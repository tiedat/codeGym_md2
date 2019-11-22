package DataStructure_Algorithms.linkedlist;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail = null;
    private int size = 0;

    MyLinkedList(E e) {
        head = new Node<>(e);
        tail = head;
        size++;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String myLinkedList = "";
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            myLinkedList += current.element.toString() + ", ";
            current = current.next;
        }
        return "MyLinkedList{" + myLinkedList + "}";
    }

    public class Node<E> {
        E element;
        private Node<E> next;

        Node(E e) {
            element = e;
        }

        public E getElement() {
            return element;
        }
    }

    public void add(int index, E e) {
        if (index == 0) addFirst(e);
        else if (index >= size) addLast(e);
        else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            current.next.next = temp;
            size++;
        }
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null)
            tail = head;
    }

    public void addLast(E e) {
        Node<E> newNote = new Node<>(e);
        if (tail == null) {
            head = tail = newNote;
        } else {
            tail.next = newNote;
            tail = tail.next;
        }
        size++;
    }

    public E remove(int index) {
        if (size == 0) return null;
        else if (size == 1) {
            Node<E> elementRemove = head;
            head = tail = null;
            size--;
            return elementRemove.getElement();
        } else if (index == 0) {
            Node<E> elementRemove = head;
            head = head.next;
            size--;
            return elementRemove.getElement();
        } else if (index >= size || index < 0) {
            return null;
        }

        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node<E> elementRemove = current.next;
        current.next = current.next.next;
        size--;
        return elementRemove.getElement();
    }

    boolean remove(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.getElement().equals(e)) {
                remove(i);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    boolean contains(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.getElement().equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    int indexOf(E e) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.getElement().equals(e)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

}

package DataStructure_Algorithms.arraylist;

public class Mylist<E> {
    private int size = 0;
    static final int DEFAULT_CAPICITY = 10;
    private E[] data = (E[]) new Object[DEFAULT_CAPICITY];

    public Mylist() {
    }

    public Mylist(int capicity) {
        data = (E[]) new Object[capicity];
    }

    public Mylist(E[] data) {
        for (E e : data) {
            add(e);
        }
    }

    public int getSize() {
        return size;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) new Object[size * 2 + 1];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public boolean add(E e) {
        ensureCapacity();
        if (e != null) {
            data[size++] = e;
            return true;
        }
        return false;
    }

    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
            data[index] = e;
            size++;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public E remove(int index) {
        checkIndex(index);
        E e = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
            data[size - 1] = null;
            size--;
        }
        return e;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) return true;
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) return i;
        }
        return -1;
    }

    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    public void clear() {
        data = (E[]) new Object[DEFAULT_CAPICITY];
        size = 0;
    }

}

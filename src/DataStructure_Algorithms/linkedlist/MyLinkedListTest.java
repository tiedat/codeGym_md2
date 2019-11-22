package DataStructure_Algorithms.linkedlist;

import java.util.Collections;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>("Chicago");
        System.out.println(myLinkedList.getSize());

        myLinkedList.addLast("baby");
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList.toString());

        myLinkedList.addFirst("parents");
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList.toString());

        myLinkedList.add(2, "brothers");
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList.toString());

        myLinkedList.remove("parents");
        System.out.println(myLinkedList.toString());

        System.out.println(myLinkedList.indexOf("baby"));

    }
}

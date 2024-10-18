package com.sandbox.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("first");
        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");

        System.out.println(linkedList);

        linkedList.pollFirst();

        System.out.println(linkedList);

        linkedList.addFirst("sixth");

        System.out.println(linkedList);

        linkedList.pollFirst();
        linkedList.pollFirst();

        System.out.println(linkedList);
    }
}

package FrameWork;

import java.util.*;

public class ll {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("Is");
        ll.addFirst("This");
        ll.addLast("a");
        ll.addLast("Linked");
        ll.addLast(" list");
        System.out.println(ll);
        System.out.println(ll.size());
        ll.removeLast();
        ll.remove();
        System.out.println(ll);
    }
}
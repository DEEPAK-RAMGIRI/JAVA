public class ReversedLinkedList {

    public static node head;
    private static int size;

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void addFirst(int data) {
        node temp = new node(data);
        if (head == null) {
            size++;
        } else {
            temp.next = head;
            size++;
        }
        head = temp;
    }

    public static void addLast(int data) {
        node temp = new node(data);
        if (head == null)
            size++;
        else {
            node tp = head;
            while (tp.next != null)
                tp = tp.next;
            tp.next = temp;
            size++;
        }

    }

    public static void traversal() {
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }

    }

    public static void reversed() {

        node previouseNode = null;// remember this have to be null
        node currentNode = head;

        while (currentNode != null) {
            node nextNode = currentNode.next;
            currentNode.next = previouseNode;

            previouseNode = currentNode;
            currentNode = nextNode;
        }

        head = previouseNode;
    }

    public static void main(String[] args) {

        addFirst(2);
        addLast(3);
        addFirst(1);
        System.out.println(size);
        // traversal();
        reversed();
        traversal();
    }

}

public class ll {
    public static node head;
    private static int size = 0;

    public static class node {
        String data;
        node nxt;

        node(String data) {
            this.data = data;
            this.nxt = null;
        }
    }

    public static void addfirst(String data) {
        node temp = new node(data);
        if (head == null) {
            head = temp;
            size++;
        } else {
            temp.nxt = head;
            head = temp;
            size++;
        }
    }

    public static void addLast(String data) {
        node temp = new node(data);
        if (head == null) {
            head = temp;
            size++;
        } else {
            node current = head;
            while (current.nxt != null)
                current = current.nxt;
            current.nxt = temp;
            size++;
        }
    }

    public static void traversal() {
        node temp = head;
        System.out.println("Total size of the linked list is: " + size);
        System.out.print("head -->");
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.nxt;
        }
        if (temp == null)
            System.out.print("null");
    }

    public static void delfirst() {
        if (head == null) {
            System.out.println("Size of Linked List =" + size);
        } else if (head.nxt == null) {
            size--;
            System.out.println("deleted " + head.data + " element successfully and size of linked list is: " + size);
            head = null;
        } else {
            size--;
            System.out.println("deleted " + head.data + " element successfully and size of linked list is: " + size);
            head = head.nxt;
        }
    }

    public static void dellast() {
        if (head == null)
            System.out.println("Linked list is Empty");
        else if (head.nxt == null) {
            size--;
            System.out.println("linked list size is: " + size + "and element " + head.data + "deleted successfully");
            head = null;
        } else {
            size--;
            node temp = head;
            while (temp.nxt.nxt != null)
                temp = temp.nxt;
            System.out.println("linked list size is: " + size + "and element " + temp.data + "deleted successfully");
            temp.nxt = null;
        }
    }

    // public static void addmiddle(String data, int index) {
    // if (head == null)
    // addLast(data);
    // else if (index == 0 || index > size) {
    // System.out.println("Invalid Index");
    // return;
    // } else {
    // node temp = new node(data);
    // node curr = head;
    // for (int i = 1; i <= size; i++) {
    // if (i == index) {
    // node nextnode = curr;
    // // temp = curr;
    // curr = temp;
    // temp.nxt = nextnode;
    // break;
    // }
    // curr = curr.nxt;
    // }
    // }
    // }

    public static void main(String[] args) {
        // addfirst("linked");
        addLast("list");
        // addfirst("This is");
        // delfirst();
        // dellast();
        // System.out.println(size);
        // traversal();
        addLast("list");
        addLast("list");
        addLast("list");
        addLast("list");
        addLast("list");
        addLast("list");
        addmiddle("hello", 0);
        traversal();
    }
}
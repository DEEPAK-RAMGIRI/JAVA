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
        temp.nxt = head;
        head = temp;
        size++;
    }

    public static void addLast(String data) {
        node temp = new node(data);
        if (head == null) {
            head = temp;
        } else {
            node current = head;
            while (current.nxt != null) {
                current = current.nxt;
            }
            current.nxt = temp;
        }
        size++;
    }

    public static void traversal() {
        node temp = head;
        System.out.println("Total size of the linked list is: " + size);
        System.out.print("head --> ");
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.nxt;
        }
        System.out.println("null");
    }

    public static void delfirst() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        System.out.println("Deleted " + head.data + " element successfully.");
        head = head.nxt;
        size--;
    }

    public static void dellast() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        if (head.nxt == null) {
            System.out.println("Deleted " + head.data + " element successfully.");
            head = null;
        } else {
            node temp = head;
            while (temp.nxt.nxt != null) {
                temp = temp.nxt;
            }
            System.out.println("Deleted " + temp.nxt.data + " element successfully.");
            temp.nxt = null;
        }
        size--;
    }

    public static void addmiddle(String data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }
        if (index == 0) {
            addfirst(data);
            return;
        }
        node temp = new node(data);
        node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.nxt;
        }
        temp.nxt = curr.nxt;
        curr.nxt = temp;
        size++;
    }

    public static node delmiddle(node head) {
        if (head == null || head.nxt == null) {
            return null; // Empty list or only one node
        }
        node fast = head, slow = head, prev = null;

        while (fast != null && fast.nxt != null) {
            fast = fast.nxt.nxt;
            prev = slow;
            slow = slow.nxt;
        }

        if (prev != null) {
            prev.nxt = slow.nxt; // Bypass the slow node
        }
        size--;
        return head;
    }

    public static void main(String[] args) {
        addLast("list");
        addfirst("This is");
        addLast("another");
        addmiddle("middle", 1); // Add "middle" at index 1
        traversal();
        // dellast();
        // delfirst();
        traversal();
        head = delmiddle(head); // Delete the middle node
        traversal();
    }
}

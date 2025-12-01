
public class SortedLinkedList {

    // Node class for Linked List
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Add node in sorted order
    public void add(int data) {
        Node newNode = new Node(data);

        // Case 1: Empty list or new node is the smallest
        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: Insert at correct position in sorted order
        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Print the LinkedList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        list.add(56);
        list.add(30);
        list.add(70);
        list.add(40);

        System.out.println("Final Sorted Linked List:");
        list.printList();  // Output → 30 -> 40 -> 56 -> 70
    }
}

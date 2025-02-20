package linkedlist;

public class LinkedList {

    private Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void insetData(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    int sizeOfLinkedList() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    void insertAtFirst(int data) {
        Node node = new Node(data);
        Node temp = head;
        head = node;
        head.next = temp;

    }

    void insetAtLast(int data) {
        Node node = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void InsetAtParticularIndex(int data, int index) {
        Node node = new Node(data);
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index - 1) {
                node.next = temp.next;
                temp.next = node;
                return;
            } else {
                count++;
                temp = temp.next;

            }
        }
    }

    void deleteAtFirst() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        head = head.next;
    }


    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insetData(1);
        l.insetData(2);
        l.insetData(3);
        l.insetData(4);
//        l.printList();
//        System.out.println(l.sizeOfLinkedList());
        l.insertAtFirst(9);
//        l.printList();
        l.insetAtLast(10);
//        l.printList();
        l.InsetAtParticularIndex(100, 2);
//        l.printList();
        l.deleteAtFirst();
        l.printList();
    }
}

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


    void deleteLast() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        if (head.next == null) {
            System.out.println("Node Delete with data " + head.data);
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteAtParticularIndex(int index) {
        if (index > sizeOfLinkedList()) {
            System.out.println("index is out of reach " + index);
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp.next != null && count == index -1) {
            temp = temp.next;
            count ++;

        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

    }


    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        System.out.println("================== add nodes ");
        l.insetData(1);
        l.insetData(2);
        l.insetData(3);
        l.insetData(4);

        System.out.println("================== print nodes ");
        l.printList();

        System.out.println("==================  node size ");
        System.out.println(l.sizeOfLinkedList());

        System.out.println("==================  insert at first ");
        l.insertAtFirst(9);
        l.printList();

        System.out.println("==================  insert at last ");
        l.insetAtLast(10);
        l.printList();

        System.out.println("==================  insert at particular Index ");
        l.InsetAtParticularIndex(100, 2);
        l.printList();

        System.out.println("==================  insert at delete first ");
        l.deleteAtFirst();
        l.printList();

        System.out.println("================== delete last");
        l.deleteLast();
        l.printList();

        System.out.println("==================== delete at particular index");
        l.deleteAtParticularIndex(1);
        l.printList();

    }
}

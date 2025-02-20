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

    void insetAtLast(int data){
        Node node = new Node(data);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
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
        l.printList();
    }
}

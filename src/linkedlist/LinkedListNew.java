package linkedlist;

public class LinkedListNew {
    public static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    void InsertNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        } else {
            while (temp != null) {
                System.out.print(STR."\{temp.data} => ");
                temp = temp.next;
            }
            System.out.println("null");

        }
    }

    int size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    void reverseLL(){
        Node current = head;
        Node prevoius = null;
        Node next;
        while (current != null){
            next = current.next;
            current.next = prevoius;
            prevoius = current;
            current = next;
        }
        head = prevoius;

    }

    void deleteFirst(){
        Node temp = head;
        head = temp.next;

    }

    public static void main(String[] args) {
        LinkedListNew linkedList = new LinkedListNew();
        linkedList.display();
        linkedList.InsertNode(1);
        linkedList.InsertNode(2);
        linkedList.InsertNode(3);
        linkedList.InsertNode(4);
        linkedList.InsertNode(5);
        linkedList.display();
        System.out.println("Size of Linked List ====== " + linkedList.size());
        linkedList.reverseLL();
        linkedList.display();
        linkedList.deleteFirst();;
        linkedList.display();


    }

}

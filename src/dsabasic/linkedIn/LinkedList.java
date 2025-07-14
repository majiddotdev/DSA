package dsabasic.linkedIn;

public class LinkedList {

    public Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void insetData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty ");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }


    int size() {
        int size = 0;
        if (head == null) {
            System.out.println("the give linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
        }
        return size;
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void reversell() {
        if (head == null) {
            System.out.println("linked list is empty");
        } else if (head.next == null) {
            System.out.println("linked list contains only one element we can not reverse it");
        } else {
            Node previous = null;
            Node current = head;
            Node next;
            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            head = previous;
        }
    }

    int midElement() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }


    void midElement(int data) {
        Node newNode = new Node(data);
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        newNode.next = slow.next;
        slow.next = newNode;
    }


    void deleteFirst(){
        if(head == null){
            System.out.println("the linked list is empty");
        }
        else {
            Node temp = head;
            head = temp.next;
        }
    }

    void deleteMiddle(){
        if(head == null){
            System.out.println("the linked list is empty");
        }
        else {
           Node slow = head;
           Node fast = head;
           while (fast != null && fast.next != null){
               slow = slow.next;
               fast = fast.next.next;
           }
           slow = slow.next;
        }
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insetData(3);
        list.insetData(5);
        list.insetData(4);
        list.insetData(98);
        list.insetData(21);
        list.insetData(12);
        list.insetData(222);


        list.display();
        System.out.println("=============================================================");
//        list.reversell();

        list.display();
        System.out.println("------------------------------------------------------------");
        System.out.println(list.midElement());
        System.out.println("---------------------------------------");
        list.midElement(90);
        list.display();
        System.out.println("0-----------------------------------------------------0");
        list.deleteFirst();
        list.display();
        System.out.println("0-9-0------------------------------");
        list.deleteMiddle();
        list.display();

    }
}

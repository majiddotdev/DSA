package linkedlist;

public class DoubleLinkedList {
    private Node head;

    public static class Node {
        int data;
        Node next;
        Node back;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.back = null;
        }

        Node(int data, Node next, Node back) {
            this.data = data;
            this.next = next;
            this.back = back;
        }
    }

    void insertData(int data) {
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
            node.back = temp;
        }
    }

    void displayDll() {
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    void insertFirst(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        head = newNode;
        head.next = temp;
        temp.back = head;
    }

    void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.back = temp;
        }
    }


    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        System.out.println("=========================== insert Node");
        dll.insertData(2);
        dll.insertData(3);
        dll.insertData(6);

        System.out.println("=========================== display Nodes");
        dll.displayDll();

        System.out.println("========================== insert  first ======================");
        dll.insertFirst(100);

        System.out.println("=========================== display Nodes");
        dll.displayDll();

        System.out.println("========================== insert last =============================");
        dll.insertLast(50);

        System.out.println("=========================== display Nodes");
        dll.displayDll();




    }


}

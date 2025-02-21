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

    int size() {
        int count = 0;
        if (head == null) {
            System.out.println("double linked list is empty");
            return count;
        } else {
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
        }
        return count;
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

    void insertAtIndex(int data, int index) {
        if (index < 0 || index > size()) {
            System.out.println("index is out of reach");
            return;
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            int count = 0;
            while (temp != null) {
                if (count == index - 1) {
                    newNode.next = temp.next;
                    if (temp.next != null) {
                        temp.next.back = newNode;
                    }
                    temp.next = newNode;
                    newNode.back = temp;
                    return;
                } else {
                    temp = temp.next;
                    count++;
                }
            }
        }

    }

    void deleteAtFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }

    }


    void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void reverse() {
        Node current = head;
        Node previous = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        head = previous;
    }


    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        System.out.println("=========================== insert Node");
        dll.insertData(2);
        dll.insertData(3);
        dll.insertData(6);

        System.out.println("=========================== display Nodes");
        dll.displayDll();

        System.out.println("========================== Size of double Linked list =============================" + dll.size());

        System.out.println("========================== insert  first ======================");
        dll.insertFirst(100);

        System.out.println("=========================== display Nodes");
        dll.displayDll();

        System.out.println("========================== insert last =============================");
        dll.insertLast(50);

        System.out.println("=========================== display Nodes");
        dll.displayDll();


        System.out.println("========================== insert last =============================");
        dll.insertAtIndex(80, 2);

        System.out.println("=========================== display Nodes");
        dll.displayDll();

        System.out.println("=========================== delete at first");
        dll.deleteAtFirst();

        System.out.println("=========================== display Nodes");
        dll.displayDll();

        System.out.println("=========================== delete at last ========================");
        dll.deleteAtLast();

        System.out.println("=========================== display Nodes");
        dll.displayDll();

        System.out.println("=========================== reverse  ========================");
        dll.reverse();

        System.out.println("=========================== display Nodes");
        dll.displayDll();


    }


}

package linkedlist;

public class LinkedListTest {
    private Node head;
    private Node tail;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void InsertData(int data) {
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

    void display() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
        System.out.print("null");
    }

    Node midNode() {
        if (head == null) {
            System.out.println("the list is empty");
            return null;
        } else {
            Node temp = head, nextNode = head;
            while (nextNode != null && nextNode.next != null) {
                temp = temp.next;
                nextNode = nextNode.next.next;
            }

            return temp;
        }
    }

    public static void main(String[] args) {
        LinkedListTest linkedListTest = new LinkedListTest();
        linkedListTest.InsertData(2);
        linkedListTest.InsertData(3);
        linkedListTest.InsertData(4);
        linkedListTest.InsertData(5);
        linkedListTest.InsertData(9);
        linkedListTest.InsertData(6);
        linkedListTest.display();
        System.out.println(linkedListTest.midNode().data);
    }
}

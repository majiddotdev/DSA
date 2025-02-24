package linkedlist;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedList1 {

    private Node head;
    private Node tail;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    void insertData(int data) {
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
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void reverse() {
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    //first approach
//    Node median() {
//        int median = size() / 2 + 1, count = 0;
//        Node temp = head;
//        while (temp != null) {
//            if (count == median -1) {
//                return temp;
//            } else {
//                count++;
//                temp = temp.next;
//            }
//        }
//        return null;
//
    //  }

    //    2nd approach
    Node median() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    boolean detectLoop() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            System.out.println("Before move - Slow: " + slow.data + ", Fast: " + fast.data);

            slow = slow.next;
            fast = fast.next.next;

            System.out.println("After move - Slow: " + slow.data + ", Fast: " + (fast != null ? fast.data : "null"));

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }



    public static void main(String[] args) {
        LinkedList1 list1 = new LinkedList1();
        list1.insertData(12);
        list1.insertData(13);
        list1.insertData(14);
        list1.insertData(100);
        list1.insertData(18);
        list1.insertData(100);


        System.out.println("=================size===========" + list1.size());
        list1.display();
        System.out.println();
        list1.reverse();
        list1.display();
        System.out.println();
        System.out.println();
        System.out.println(list1.median().data);
        System.out.println("Detect a loop in the linked list");
        System.out.println(list1.detectLoop());

    }
}

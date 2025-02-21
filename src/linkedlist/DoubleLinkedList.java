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
       if(head == null){
           head = node;
           return;
       }else {
           Node temp = head;
           while (temp.next != null){
               temp = temp.next;
           }
           temp.next = node;
           node.back = temp;
       }
    }

    void displayDll(){
        if(head == null){
            System.out.println("list is empty ");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertData(2);
        dll.insertData(3);
        dll.insertData(6);
        dll.displayDll();



    }
}

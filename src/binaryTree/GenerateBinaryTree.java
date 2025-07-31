package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryTree {
    Node root;

    void insertNode() {

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);


        root = first;
        root.left = second;
        root.right = third;
        second.left = forth;
        second.right = fifth;
        fifth.right = sixth;


    }

    List<Integer> Pre_order_Traversal(Node root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        list.add(root.data);
        Pre_order_Traversal(root.left, list);
        Pre_order_Traversal(root.right, list);
        return list;

    }

    void in_order_Traversal(Node root) {
        if (root == null) {
            return;
        }
        in_order_Traversal(root.left);
        System.out.print(root.data + " => ");
        in_order_Traversal(root.right);

    }

    void post_order_Traversal(Node root) {
        if (root == null) {
            return;
        }
        post_order_Traversal(root.left);
        post_order_Traversal(root.right);
        System.out.print(root.data + " => ");


    }

    int heightOfBinaryTree(Node root){

        if(root == null)
            return 0;
        int left = heightOfBinaryTree(root.left);
        int right = heightOfBinaryTree(root.right);
        return 1 + Math.max(left , right);

    }

    public static void main(String[] args) {
        GenerateBinaryTree generateBinaryTree = new GenerateBinaryTree();
        generateBinaryTree.insertNode();
        System.out.println("=============pre");
        List<Integer> list = new ArrayList<>();

        System.out.println(generateBinaryTree.Pre_order_Traversal(generateBinaryTree.root, list));

        System.out.println();
        System.out.println("=============in");
        generateBinaryTree.in_order_Traversal(generateBinaryTree.root);

        System.out.println();
        System.out.println("=============post");
        generateBinaryTree.post_order_Traversal(generateBinaryTree.root);

        System.out.println("height of sub tree");
        System.out.println(generateBinaryTree.heightOfBinaryTree(generateBinaryTree.root));
    }
}

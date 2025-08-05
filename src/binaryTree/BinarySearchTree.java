package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    Node root;

    void insertNode(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Node parent = null;
        Node current = root;

        while (current != null) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }


    void pre_order(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        pre_order(root.left);
        pre_order(root.right);
    }

    Node searchNode(Node root, int data) {
        if (root == null) return null;
        if (root.data == data) {
            return root;
        }
        if (data < root.data) {
            return searchNode(root.left, data);
        } else {
            return searchNode(root.right, data);
        }
    }

    Boolean sameBinaryTrees(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return root1.data == root2.data &&
                sameBinaryTrees(root1.left, root2.left)
                && sameBinaryTrees(root1.right, root2.right);
    }

    int heightOfTree(Node root) {
        if (root == null)
            return 0;
        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        return 1 + Math.max(left, right);
    }

    int sizeOfTree(Node root) {
        if (root == null) return 0;
        int left = sizeOfTree(root.left);
        int right = sizeOfTree(root.right);
        return 1 + left + right;
    }

    void levelOrderTraversal(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node top = queue.poll();
            System.out.println(top.data);
            if (top.left != null) {
                queue.add(top.left);
            }
            if (top.right != null) {
                queue.add(top.right);
            }
        }

    }

    Node levelOrderTraversalAndSearch(Node root, int data) {
        if (root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node top = queue.poll();
            if (top.data == data) {
                return top;
            }
            if (top.left != null) {
                queue.add(top.left);
            }
            if (top.right != null) {
                queue.add(top.right);
            }
        }
        return null;

    }

    void postOrderTraversal(Node root) {
        if (root == null) return;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node top = stack1.pop();
            stack2.push(top);
            if (top.left != null) {
                stack1.push(top.left);
            }
            if (top.right != null) {
                stack1.push(top.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop().data);
        }
    }

    void intOrderTraversal(Node root) {
        if (root == null) return;
        Stack<Node> stack1 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node top = stack1.pop();
            System.out.println(top.data);
            if (top.right != null) {
                stack1.push(top.right);
            }
            if (top.left != null) {
                stack1.push(top.left);
            }
        }
    }


    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertNode(12);
        binarySearchTree.insertNode(7);
        binarySearchTree.insertNode(6);

        binarySearchTree.insertNode(13);

        binarySearchTree.insertNode(8);


        binarySearchTree.pre_order(binarySearchTree.root);
        System.out.println(binarySearchTree.searchNode(binarySearchTree.root, 13));


        System.out.println(binarySearchTree.heightOfTree(binarySearchTree.root));
        System.out.println(":===============");

        System.out.println(binarySearchTree.sizeOfTree(binarySearchTree.root));

        System.out.println("======================queue");

        binarySearchTree.levelOrderTraversal(binarySearchTree.root);

        System.out.println("======================search");

        System.out.println(binarySearchTree.levelOrderTraversalAndSearch(binarySearchTree.root, 12));

        System.out.println("======================post");

        binarySearchTree.postOrderTraversal(binarySearchTree.root);

        System.out.println("======================in");

        binarySearchTree.intOrderTraversal(binarySearchTree.root);

    }
}

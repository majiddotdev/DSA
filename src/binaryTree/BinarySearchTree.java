package binaryTree;

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

    int sizeOfTree(Node root) {
        if (root == null)
            return 0;
        int left = sizeOfTree(root.left);
        int right = sizeOfTree(root.right);
        return 1 + Math.max(left, right);
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


        System.out.println(binarySearchTree.sizeOfTree(binarySearchTree.root));


    }
}

package simple.basic.questions;

public class PrintAllLeafNodesOfTree {

    static class Node {
        public int data;
        public Node left, right;
    }

    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    public static void main(String[] args) {
        System.out.println("Program to print all the leaf nodes of a Binary Tree");
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.right.left = newNode(5);
        root.right.right = newNode(8);
        root.right.left.left = newNode(6);
        root.right.left.right = newNode(7);
        root.right.right.left = newNode(9);
        root.right.right.right = newNode(10);

        printLeafNodes(root);
    }

    static void printLeafNodes(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.println("Leaf Nodes  ==> " +root.data);
            return;
        }
        if(root.left != null){
            printLeafNodes(root.left);
        }
        if(root.right != null){
            printLeafNodes(root.right);
        }
    }
    static void printLeftBoundary(Node root){
        if (root == null){
            return;
        }
        if(root.left != null){
            System.out.println("Left most boundary nodes  ==> " +root.data);
            printLeftBoundary(root.left);
        }else if(root.right != null){
            System.out.println("Right most boundary nodes  ==> " +root.data);
            printLeftBoundary(root.right);
        }
    }
    static void printRightNodes(Node root){
        if (root == null){
            return;
        }
        if(root.right != null){
            System.out.println("Right most boundary nodes  ==> " +root.data);
            printLeftBoundary(root.right);
        }else if(root.left !=null){
            System.out.println("Left most boundary nodes  ==> " +root.data);
            printLeftBoundary(root.left);
        }
    }

    void printBoundary(Node root){
        if(root == null){
            return;
        }
        System.out.println("Root Node ==> "+root.data);

        printLeftBoundary(root.left);
        printLeafNodes(root.left);
        printLeafNodes(root.right);
        printRightNodes(root.right);
    }
}

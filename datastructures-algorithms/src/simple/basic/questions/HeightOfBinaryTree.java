package simple.basic.questions;

public class HeightOfBinaryTree {

    static class Node{
        Node left,right;
        int data;
    }
    static Node newNode(int value){
        Node temp = new Node();
        temp.data = value;
        temp.left = temp.right = null;
        return temp;
    }

    public static void main(String[] args){
        System.out.println("Printing the height of Binary Tree");
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
        System.out.println("Height of Binary Tree ==>"+heightOfBinaryTree(null));
        System.out.println("Height of Binary Tree ==>"+heightOfBinaryTree(newNode(1)));
        System.out.println("Height of Binary Tree ==>"+heightOfBinaryTree(root));
    }

    public static int heightOfBinaryTree(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right ==null){
            return 1;
        }
        int left = heightOfBinaryTree(root.left);
        int right = heightOfBinaryTree(root.right);
        return (left>right)?left +1: right+1;
    }
}

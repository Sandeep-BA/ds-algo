package simple.basic.questions;


/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
public class TreeTraversals {
static class Node{
    int data;
    Node left,right;
}
static Node newNode(int value){
    Node temp = new Node();
    temp.data = value;
    temp.left = temp.right = null;
    return temp;
}

public static void main(String[] args){
    System.out.println("Printing the Traversal of Binary Tree");
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
    System.out.println("Pre Order Traversal of Binary Tree ==>"+System.lineSeparator());
    preOrder(root);
    System.out.println(System.lineSeparator());
    System.out.println("Post Order Traversal of Binary Tree ==>"+System.lineSeparator());
    postOrder(root);
    System.out.println(System.lineSeparator());
    System.out.println("In Order Traversal of Binary Tree ==>"+System.lineSeparator());
    inOrder(root);
}
private static void preOrder(Node root){
    if(root == null){
        return;
    }
    System.out.print(" "+root.data);
    preOrder(root.left);
    preOrder(root.right);
}

    private static void postOrder(Node root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(" "+root.data);
    }

    private static void inOrder(Node root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        System.out.print(" "+root.data);
        preOrder(root.right);
    }
}

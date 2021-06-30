package simple.basic.questions;

import java.util.Stack;

public class DepthFirstSearch {
    static class Node {
        int data;
        Node left, right;
        boolean visited;
    }

    static Node newNode(int value) {
        Node temp = new Node();
        temp.data = value;
        temp.left = temp.right = null;
        return temp;
    }

    public static void main(String[] args){
        System.out.println("Program to print all the nodes in Depth First Search");
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
        dfs(root);
    }
    private static void dfs(Node root){
        if(root == null){
            System.out.println("Root is null and nothing to traverse");
            return;
        }
        Stack<Node> dfs = new Stack<Node>();
        dfs.push(root);
        while(!dfs.empty()){
            Node temp = dfs.peek();
            if(temp.visited == false){
                temp.visited = true;
                System.out.print(temp.data);
            }
            if(temp.left == null && temp.right == null){
                dfs.pop();
            }else if(temp.left != null && temp.left.visited == false){
                    dfs.push(temp.left);
            }else if(temp.right !=null && temp.right.visited ==false ) {
                    dfs.push(temp.right);
            }else{
                dfs.pop();
            }
        }
    }
}

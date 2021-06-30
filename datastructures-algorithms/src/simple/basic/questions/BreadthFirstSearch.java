package simple.basic.questions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
public class BreadthFirstSearch {
    static class TreeNode {
        int data;
        TreeNode left, right;
    }

    static TreeNode newNode(int data) {
        TreeNode node = new TreeNode();
        node.data = data;
        node.left = node.right = null;
        return node;
    }

    public static void main(String[] args) {
        System.out.println("Program to print all the nodes in level order i.e Breadth First Search");
        TreeNode root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.right.left = newNode(5);
        root.right.right = newNode(8);
        root.right.left.left = newNode(6);
        root.right.left.right = newNode(7);
        root.right.right.left = newNode(9);
        root.right.right.right = newNode(10);
        System.out.println("Printing the details of Binary Tree in level order or BFS" );
        bfs(root);
    }

    static void bfs(TreeNode root) {
   /*     if(root == null){
            System.out.println("Tree Empty! Nothing to print!");
        }
        if(root.left == null && root.right == null){
            System.out.println("There is only one node in the tree and here is the value"+root.data);
        }*/
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.add(root);
        while(!bfs.isEmpty()){
            TreeNode temp = bfs.poll();
            System.out.print("Level Order Content ==> "+temp.data);
            if(temp.left!=null){
                bfs.offer(temp.left);
            }
            if(temp.right!=null){
                bfs.offer(temp.right);
            }
        }
    }

}

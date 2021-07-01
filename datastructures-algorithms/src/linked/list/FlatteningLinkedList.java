package linked.list;

/**
 * Created by Sandeep Belgavi on 7/1/2021
 */
public class FlatteningLinkedList {

    static class Node{
        int data;
        Node next,down;
    }

    static Node newNode(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = newNode.down = null;
        return newNode;
    }

    private static void printList(Node head){
        // Assumption post the merger, we will get all the Linked lists downwards.
        Node temp = head;
        while(temp!=null){
            System.out.println("Data ==> "+temp.data);
            temp = temp.down;
        }

    }


    Node flatten(Node root){
        if(root == null || root.next == null){
            return root;
        }
        root.next = flatten(root.next);
        root = merge(root,root.next);

        return root;
    }

    Node merge(Node a, Node b){
        // as both the list are sorted.
        if(a == null) return b;
        if (b == null) return a;
        Node result;
        if(a.data < b.data) {
            result =a ;
            result.down = merge(a.down,b);
        }else{
            result = b;
            result.down = merge(a, b.down);
        }
        result.next = null;
        return result;
    }

    public static void main(String[] args){
        /* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */

        Node head = newNode(5);
        head.down = newNode(7);
        head.down.down = newNode(8);
        head.down.down.down = newNode(30);

        head.next = newNode(10);
        head.next.down = newNode(20);

        head.next.next = newNode(19);
        head.next.next.down = newNode(22);
        head.next.next.down.down = newNode(50);

        head.next.next.next = newNode(28);
        head.next.next.next.down = newNode(35);
        head.next.next.next.down.down = newNode(40);
        head.next.next.next.down.down.down = newNode(45);

        // Printing Linked List
//        printList(head);

        head = new FlatteningLinkedList().flatten(head);
        System.out.println("After flatttening");
        printList(head);
    }
}
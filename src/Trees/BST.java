package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    public static void main(String[] args) {
        Node a = new Node(1);  // a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        g.left = h;

        printBST(a);
        System.out.println();
        printBSTRightOrder(a);
        System.out.println();
        displayLevel(a, 2, 0);
        System.out.println();
        printBSTWithRecursion(a, 0);
    }

    public static void printBST(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.remove();
            System.out.print(node.val+" ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
    }
    public static void printBSTRightOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.remove();
            System.out.print(node.val+" ");
            if(node.right != null) queue.add(node.right);
            if(node.left != null) queue.add(node.left);
        }
    }

    public static void printBSTWithRecursion(Node root, int l){
        if()
        displayLevel(root, l, 0);
        printBSTWithRecursion(root, l+1);
    }
    public static void displayLevel(Node root, int l, int currentLevel){
        if (root == null) return;
        if(l == currentLevel) System.out.print(root.val+" ");
        displayLevel(root.left,l, currentLevel+1 );
        displayLevel(root.right, l, currentLevel+1);
    }
}

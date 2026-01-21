package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

        List<List<Integer>> ans = new ArrayList<>();
        printBST(a);
        System.out.println();
        printBSTWithNewLines(a);
        System.out.println();
        System.out.println(ans);
        bst(a, ans);
        System.out.println(ans);
//        System.out.println();
//        printBSTRightOrder(a);
//        System.out.println();
//        displayLevel(a, 2, 0);
//        System.out.println();
//        printBSTWithRecursion(a, 0);

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

    public static void printBSTWithNewLines(Node root){
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        int currentLevel = 0;
        while (!queue.isEmpty()){
            Pair p = queue.remove();

            if(currentLevel < p.level){
                System.out.println();
                currentLevel = p.level;
            }
            System.out.print(p.node.val+" ");
            if(p.node.left != null) queue.add(new Pair(p.node.left, currentLevel+1));
            if(p.node.right != null) queue.add(new Pair(p.node.right, currentLevel+1));

        }
    }

    public static void bst(Node root, List<List<Integer>> ans){
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        int currentLevel = 0;
        List<Integer> currentAns = new ArrayList<>();
        while (!queue.isEmpty()){
            Pair p = queue.remove();

            if(currentLevel < p.level){
//                System.out.println();
                ans.add(currentAns);
                currentAns = new ArrayList<>();
                currentLevel = p.level;
            }
//            System.out.print(p.node.val+" ");
            currentAns.add(p.node.val);
            if(p.node.left != null) queue.add(new Pair(p.node.left, currentLevel+1));
            if(p.node.right != null) queue.add(new Pair(p.node.right, currentLevel+1));

        }
        if(!currentAns.isEmpty()){
            ans.add(currentAns);
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
        displayLevel(root, l, 0);
        printBSTWithRecursion(root, l+1);
    }
    public static void displayLevel(Node root, int l, int currentLevel){
        if (root == null) return;
        if(l == currentLevel) System.out.print(root.val+" ");
        displayLevel(root.left,l, currentLevel+1 );
        displayLevel(root.right, l, currentLevel+1);
    }

    public static class Pair{
        Node node;
        int level;

        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
}

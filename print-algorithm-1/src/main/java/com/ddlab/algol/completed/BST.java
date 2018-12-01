package com.ddlab.algol.completed;

import java.util.Queue;

/**
 * Created by PIKU on 10/8/2015.
 */
public class BST {

    private Node root;

    public class Node {

        private Node left;
        private Node right;
        private int data;

        public Node(int x) {
            data = x;
            left = null;
            right = null;
        }
    }

    public Node add(int x) {

        return root = insert(root, x);
    }

    public Node insert(Node node, int x) {

        if (node == null)
            node = new Node(x);
        else {
            if (x < node.data) {
                node.left = insert(node.left, x);
            } else if (x > node.data) {
                node.right = insert(node.right, x);
            } else
                node.data = x;

        }
        return node;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node node) {

        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.data + "\t");
        inOrder(node.right);
    }

    public Node delete(int x) {

        return root = delete(root, x);
    }

    public Node delete(Node node, int x) {
        if (node == null) throw new RuntimeException("cannot delete.");
        if (x < node.data)
            node.left = delete(node.left, x);
        else if (x > node.data)
            node.right = delete(node.right, x);
        else {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;
            else {
                node.data = node.left.data;
                node.left = delete(node.left, x);
            }

        }

        return node;
    }

    public boolean search(int x) {

        return search1(root, x);
    }

    public boolean search(Node node, int x) {
        if (node == null)
            return false;
        else if (x == node.data)
            return true;
        else if (x < node.data)
            return search(node.left, x);
        else
            return search(node.right, x);
    }

    public boolean search1(Node node, int x) {
        if (node == null)
            return false;
        else if (x < node.data)
            return search(node.left, x);
        else if (x > node.data)
            return search(node.right, x);
        else
            return true;
    }

    public void breadthFirstNonRecursive() {
        Queue<Node> queue = new java.util.LinkedList<Node>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data+"\t");
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
        }
    }

    public static void main(String[] args) {

        BST bst = new BST();

        for (int i = 10; i > 0; i--) {
            bst.add(i);
        }
        bst.inOrder();

        bst.delete(1);
        bst.delete(5);
        System.out.println("\n\n");
        bst.inOrder();

        System.out.println("\nSearhc 7----->" + bst.search(9));

        bst.breadthFirstNonRecursive();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minnodeinbst;

import java.util.*;
 
//https://www.geeksforgeeks.org/find-the-minimum-element-in-a-binary-search-tree/

class Node {
    int data;
    Node left, right;
 
    /* Helper function that allocates a new node
    with the given data and NULL left and right
    pointers. */
    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
 
class MinNodeInBST {
 
    /* Give a binary search tree and a number,
    inserts a new node with the given number in
    the correct place in the tree. Returns the new
    root pointer which the caller should then use
    (the standard trick to avoid using reference
    parameters). */
    public static Node insert(Node node, int data)
    {
 
        /* 1. If the tree is empty, return a new,
                single node */
        if (node == null) {
            return new Node(data);
        }
        else {
 
            /* 2. Otherwise, recur down the tree */
            if (data <= node.data) {
                node.left = insert(node.left, data);
            }
            else {
                node.right = insert(node.right, data);
            }
 
            /* return the (unchanged) node pointer */
            return node;
        }
    }
 
    /* Given a non-empty binary search tree,
    inorder traversal for the tree is stored in
    the vector sortedInorder.
    Inorder is LEFT,ROOT,RIGHT*/
    public static void inorder(Node node,
                               List<Integer> sortedInorder)
    {
        if (node == null) {
            return;
        }
        /* first recur on left child */
        inorder(node.left, sortedInorder);
 
        /* then insert the data of node */
        sortedInorder.add(node.data);
 
        /* now recur on right child */
        inorder(node.right, sortedInorder);
    }
 
    public static void main(String[] args)
    {
        Node root = null;
        root = insert(root, 4);
        insert(root, 2);
        insert(root, 1);
        insert(root, 3);
        insert(root, 6);
        insert(root, 4);
        insert(root, 5);
 
        List<Integer> sortedInorder
            = new ArrayList<Integer>();
 
        inorder(root, sortedInorder); // calling the
                                      // recursive function
        // values of all nodes will appear in sorted order
        // in the vector sortedInorder
        // Function call
        System.out.printf("\n Minimum value in BST is %d",
                          sortedInorder.get(0));
    }
}
/*this is not a BST*/
package binary_tree;

class Node {
  int data;
  Node left;
  Node right;
  
  public Node(int data) {
    this.data = data;
  }
}
  
class BinaryTree {
  Node root;
  
  public void addNode(int data) {
    Node newNode = new Node(data);
  
    if (root == null) {
      root = newNode;
    } else {
      Node focusNode = root;
      Node parent;
  
      while (true) {
        parent = focusNode;
  
        if (data < focusNode.data) {
          focusNode = focusNode.left;
          if (focusNode == null) {
              //insert here
            parent.left = newNode;
            return;
          }
        } else {
          focusNode = focusNode.right;
          if (focusNode == null) {
              //insert here
            parent.right = newNode;
            return;
          }
        }
      }
    }
  }
  
  public void preOrderTraversal(Node focusNode) {
    if (focusNode != null) {
      System.out.print(focusNode.data + " ");
      preOrderTraversal(focusNode.left);
      preOrderTraversal(focusNode.right);
    }
  }
}
  
public class Binary_Tree {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
  
    tree.addNode(50);
    tree.addNode(25);
    tree.addNode(75);
    tree.addNode(12);
    tree.addNode(37);
    tree.addNode(43);
    tree.addNode(30);
  
    tree.preOrderTraversal(tree.root);
  }
}
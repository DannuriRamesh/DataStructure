package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left ,right;

    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTreeImpl {

    static Node root;
    BinaryTreeImpl(){
        root = null;
    }
    BinaryTreeImpl(int data){
        root=new Node(data);
    }
    //using recursion
    public void Inorder(Node root){
        if (root==null){
            return;
        }
        Inorder(root.left);
        System.out.println("inOrder " +root.data);
        Inorder(root.right);
    }

    public void PostOrder(Node root){
        if (root==null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println("postOrder" +root.data);
    }
    private void preOrder(Node root) {
        if (root==null){
            return;
        }
        System.out.println("preOrder "+root.data);
        preOrder(root.left);
        preOrder(root.right);

    }
    // non recursion

    private void LevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }

        }
    }
        private int maxValueInBinaryTree(Node root){
            int maxValue = Integer.MIN_VALUE;
            if (root!=null){
                int maxleft = maxValueInBinaryTree(root.left);
                int maxright = maxValueInBinaryTree(root.right);
                if (maxleft>maxright){
                    maxValue = maxleft;
                }
                else {
                    maxValue = maxright;
                }
                if (root.data>maxValue){
                    maxValue = root.data;
                }
            }
            return maxValue;
    }
    public static void main(String args[]){
        BinaryTreeImpl tree = new BinaryTreeImpl();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(6);
        tree.Inorder(root);

        tree.PostOrder(root);
        tree.preOrder(root);
        tree.LevelOrder(root);
        System.out.println("\n max value in binary tree : "+tree.maxValueInBinaryTree(root));

    }



}

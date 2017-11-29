package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static java.lang.Math.max;

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
    static Node root2;
    BinaryTreeImpl(){

        root = null;
        root2 = null;
    }
    BinaryTreeImpl(int data){
        root=new Node(data);
        root2 = new Node(data);
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
    //Non recursion  using stack
    public void InorderNonRecursion(Node root){
        if (root==null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while (temp!=null){
            stack.push(temp);
            temp = temp.left;
        }
        while (stack.size()>0){
            temp = stack.pop();
            System.out.print(temp.data+" , ");
            if (temp.right!=null){
                temp = temp.right;
                while(temp!=null){
                    stack.push(temp);
                    temp = temp.left;
                }
            }
        }
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
    // non recursion unsing Level Order Traversal

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
        System.out.println("");
    }
    private static void printLevelByLevel(Node root){
        if (root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (true){
            int nodeCount = q.size();
            if(nodeCount==0){
                break;
            }
            while (nodeCount>0){
                Node temp = q.peek();
                System.out.print(temp.data+" ");
                q.remove();
                if (temp.left!=null){
                    q.add(temp.left);
                }
                if (temp.right!=null){
                    q.add(temp.right);
                }
                nodeCount--;
            }
            System.out.println();
        }
    }
    //using recursion
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
    //without recursion using level Order Traversal
    private int maxValueInBinaryTree2(Node root){
            if(root==null){
                return Integer.MIN_VALUE;
            }
            int max = Integer.MIN_VALUE;
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()){
                Node temp = queue.poll();
                if (temp.data>max){
                    max = temp.data;
                }
                if (temp!=null){
                    if (temp.left!=null){
                        queue.offer(temp.left);
                    }
                    if (temp.right!=null){
                        queue.offer(temp.right);
                    }
                }

            }
        return max;

    }
    //using recursion
    private boolean findElement(Node root , int x){
        if (root==null){
            return false;
        }
        if (root.data==x )
         return true;
        return findElement(root.left,x) || findElement(root.right ,x);
    }
    //with out recursion
    private boolean findElement2(Node root,int x){
     if (root==null){
         return false;
     }
     Queue<Node> queue = new LinkedList<>();
     queue.offer(root);
     while (!queue.isEmpty()){
         Node temp = queue.poll();
         if (temp.data==x){
             return true;
         }
         if (temp!=null){
             if (temp.left!=null){
                 queue.offer(temp.left);
             }
             if (temp.right!=null){
                 queue.offer(temp.right);
             }
         }

     }
        return false;
    }
    //using recursion
    private int size(Node root){
        if(root==null){
            return 0;
        }
        int leftsize = size(root.left);

        int rightsize = size(root.right);

        return 1+leftsize+rightsize;
    }
    //using levelOrder traversal
    private int size2(Node root){
        int count = 0;
        if(root==null){
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node temp = queue.poll();
            count++;
            if (temp.left!=null){
                queue.offer(temp.left);
            }
            if (temp.right!=null){
                queue.offer(temp.right);
            }

        }
        return count;
    }
    //insert Node in Tree using recursion
    public void insert(Node root , int data){
        if(root==null){
            root  =new Node(data);
        }
        else {
            insertHelper(root,data);
        }
    }
    private void insertHelper(Node root, int data){
        if (root.data>=data){
            if (root.left==null){
                root.left = new Node(data);
            }
            else {
                insertHelper(root.left,data);
            }
        }
        else {
            if (root.right==null){
                root.right = new Node(data);
            }
            else {
                insertHelper(root.right,data);
            }
        }
    }
    //insert Node Using levelOrder Traversal
    public Node insert2(Node root , int data){
        if (root==null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            Node temp  = q.poll();
            if(temp!=null){
                if (temp.left!=null){
                    q.offer(temp.left);
                }
                else {
                    temp.left = new Node(data);
                    return root;
                }
                if (temp.right!=null){
                    q.offer(temp.right);
                }
                else {
                    temp.right = new Node(data);
                    return root;
                }
            }
        }
        return root;
    }


    private int height(Node root){
        if (root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return 1+max(left,right);
    }

    public static void main(String args[]){
        BinaryTreeImpl tree = new BinaryTreeImpl();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        tree.Inorder(root);

        tree.PostOrder(root);
        tree.preOrder(root);

        System.out.println("\n max value in binary tree : "+tree.maxValueInBinaryTree(root));
        System.out.println("\n max value in binary tree : "+tree.maxValueInBinaryTree2(root));

        System.out.println("\n element Contains "+tree.findElement(root,3));
        System.out.println("\n element Contains "+tree.findElement2(root,3));
        System.out.println("\n size of tree "+tree.size(root));
        System.out.println("\n size of tree "+tree.size2(root));

         Node root2  = new Node(1);
         root2.left = new Node(2);
         root2.right = new Node(3);
         root2.left.left = new Node(4);
         root2.left.right = new Node(5);
         root2.right.right = new Node(8);
        tree.LevelOrder(root);
        tree.LevelOrder(root2);
        printLevelByLevel(root);

        System.out.println("affter insert");
        tree.insert(root,10);


        tree.LevelOrder(root);
        printLevelByLevel(root);


        System.out.println("affter insert");
        tree.insert2(root,11);
        tree.insert2(root,12);
        tree.insert2(root,13); tree.insert2(root,14);
        tree.LevelOrder(root);
        printLevelByLevel(root);


        System.out.println("\n this two trees are idential  : "+isIdentical(root , root2));
        tree.InorderNonRecursion(root);

    }

    private static boolean isIdentical(Node root, Node root2) {
        if (root==null && root2==null){
            return true;
        }
        if (root!=null && root2!=null ){
            return (root.data==root2.data)&&(isIdentical(root.left , root2.left))&&(isIdentical(root.right , root2.right));

        }
        return false;
    }


}

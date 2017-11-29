package BinaryTree;

public class ConstructTree {
    Node root;
    static int pIndex;
    Node makeTree(int[] inorder,int[] preorder, int instrt , int inend){
        if(instrt>inend){
            return null;
        }
        Node tnode = new Node(preorder[pIndex++]);
        if (instrt==inend){
            return tnode;
        }
        int inIndex = search(inorder , instrt ,inend ,tnode.data );
        tnode.left = makeTree(inorder,preorder,instrt , inIndex-1);
        tnode.right =makeTree(inorder,preorder,inIndex+1,inend);

        return tnode;

    }

    private int search(int[] arr, int instrt, int inend, int data) {
        int i;
        for (i=instrt ; i<inend;i++){
            if (arr[i]==data){
                return i;
            }
        }
        return i;
    }
    public static void main(String args[]){
        ConstructTree tree = new ConstructTree();
        int in[] = new int[]{4,2,5,1,3};
        int pre[] = new int[]{1,2,4,5,3};

        int len = in.length;
        Node root = tree.makeTree(in,pre,0,len-1);
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(root);
    }

    private void printInorder(Node root) {
        if (root==null){
            return;
        }
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);
    }
}

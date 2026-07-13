class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class BinarTreeTraversal {
    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.val+" ");
            inorder(root.right)
;        }
    }
    public void preorder(TreeNode root){
        if(root!=null){
            System.out.print(root.val + " "); 
            preorder(root.left); 
            preorder(root.right); 
        }
    }
    public void postorder(TreeNode root){
        if(root != null){
            postorder(root.left); 
            postorder(root.right); 
            System.out.print(root.val + " "); 
        }
    }
    public static void main(String[] args) {
        BinarTreeTraversal tree = new BinarTreeTraversal();
    
        
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);
    
        System.out.print("Inorder Traversal : ");
        tree.inorder(root);
    
        System.out.print("\nPreorder Traversal : ");
        tree.preorder(root);
    
        System.out.print("\nPostorder Traversal : ");
        tree.postorder(root);
    }
    
}

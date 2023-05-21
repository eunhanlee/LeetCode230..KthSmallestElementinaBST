public class Main {
    public static void main(String[] args){
        Solution tt=new Solution();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        //wrong BST. it just for easy notice.
        //inorder=1,2,3,4,5 Thus, k's index is k
//                4
//                / \
//                2   5
//                / \
//               1   3


        System.out.println(tt.kthSmallest(root,3));

    }
}

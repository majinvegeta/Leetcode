/*
The inorder traversal of a BST returns the nodes in sorted order. This is the key here. We maintain a state
sum here, since the original values are mutated. We cannot iterate through them to find the sum (since they are)
already modified (and also inefficient). In the reverse inorder traversal of a BST, the nodes are visited in
the reverse order. We keep updating the sum (sum+=root.val) , so that the next visited node can consume it.
*/

int sum = 0;
public TreeNode convertBST(TreeNode root) {
    if(root!=null){
        convertBST(root.right);
        sum+=root.val;
        root.val=sum;
        convertBST(root.left);
    }
    return root;
}
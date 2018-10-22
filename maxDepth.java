/* The height of a tree is equal to 1 + height of the taller subtree

    3
   / \          Height is 3, also equal to the number of veritces on the longest path from the root to leaf node.
  9  20
    /  \
   15   7
*/

public int maxDepth(TreeNode root) {
    if(root == null) return 0;
    return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
}
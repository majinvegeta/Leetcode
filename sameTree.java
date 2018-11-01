public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;  // reached the end, hence true
    if(p == null || q == null) return false; // one is null while the other is not, hence false
    if(p.val != q.val) return false;   
    return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);  

    // call the same function on the left subtrees and the right subtrees of the two trees respectively.
}
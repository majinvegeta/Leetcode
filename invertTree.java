/* consider a tree rooted at r with subtrees left and right. It's inverse is a tree
    rooted at r with it's left subtree equal to the inverse of right and it's right subtree
    equal to the inverse of the left.
*/

TreeNode invertTree(TreeNode root){
    if(root == null) return root;

    TreeNode left = invertTree(root.left);
    TreeNode right = invertTree(root.right);

    root.right = left;
    root.left = right;

    return root;
}

/* Iterative approach with queue. Similar to BFS*/

TreeNode invertTree(TreeNode root){
    Queue<TreeNode> queue = new Queue<TreeNode>();
    queue.add(root);
    while(!queue.isEmpty()){
        TreeNode current = queue.poll();
        TreeNode temp = current.left;
        current.left = current.right; 
        current.right = temp;

        if(current.left != null){
            queue.add(current.left);
        }

        if(current.right != null){
            queue.add(current.right);
        }
    }
    return root;
}

 public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 

public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    TreeNode t = null;          // Initialize new node to null
    if(t1 == null && t2==null){
        return t;                   // Not possible to go further
    }
    else if(t1 == null){
        t = new TreeNode(t2.val);       // If we are the positions 3 and 1 on the left and right tree (refer example)
                                        // And we decide to go right, t1 will be null. Hence only the value of t2
                                        // is considered. 
    }
    else if(t2 == null){
        t = new TreeNode(t1.val);       // If we are the positions 3 and 1 on the left and right tree (refer example)
                                        // And we decide to go left, t2 will be null. Hence only the value of t1
                                        // is considered. 
    }
    else{
        t = new TreeNode(t1.val + t2.val);  // If we are at positions 1 and 2 on the left and the right tree
                                            // and decide to go left, both t1 and t2 are not null, hence
                                            // both values are considered. 
    }
    t.left = mergeTrees(t1 == null?t1:t1.left,t2 == null?t2:t2.left); // pass null if the node is null
    t.right = mergeTrees(t1 == null?t1:t1.right,t2 == null?t2:t2.right);       
    return t;
}

/*
Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7    
*/
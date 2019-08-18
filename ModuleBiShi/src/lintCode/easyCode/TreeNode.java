package lintCode.easyCode;

public class TreeNode {
    public int val;
    public TreeNode left,right;

    public TreeNode(int val){
        this.val=val;
        this.left=this.right=null;
    }

    /**
     * @param a
     * @param b
     * @return
     */
    public TreeNode max(TreeNode a, TreeNode b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        if (a.val > b.val) {
            return a;
        }
        return b;
    }

}

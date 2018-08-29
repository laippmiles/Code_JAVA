package 重建二叉树_7;

public class 重建二叉树_7 {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode ans = ConstructBinaryTree(pre,in,0,pre.length - 1,0,in.length - 1);
        return ans;
    }
    
    private TreeNode ConstructBinaryTree(int [] pre,int [] in,int startPre,int endPre,int startIn,int endIn){
        if ((startPre > endPre) || (startIn > endIn)){
            return null;
        }
        
        TreeNode root = new TreeNode(pre[startPre]);
        //注意for的i要声明int
        for (int i=startIn ; i<=endIn ; i++){
            if (in[i] == pre[startPre]){
                root.left = ConstructBinaryTree(pre,in,startPre + 1,startPre + (i-startIn),startIn,i - 1);
                root.right = ConstructBinaryTree(pre,in,startPre + (i-startIn) + 1,endPre,i + 1,endIn);
            }
        }
        return root;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		重建二叉树_7 a = new 重建二叉树_7();
		int[] pre = {1,2,3};
		int[] in = {2,1,3};
		//JAVA数组写法用的大括号
		System.out.println(a.reConstructBinaryTree(pre,in));
	}
}

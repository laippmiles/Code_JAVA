package 题10_变态跳台阶;

public class 题10_变态跳台阶 {
	
    public int JumpFloorII(int target) {
        if (target == 0)
            return 0;
        return (int)Math.pow(2,target-1);
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题10_变态跳台阶 a = new 题10_变态跳台阶();
		System.out.println(a.JumpFloorII(3));
	}

}

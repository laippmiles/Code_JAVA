package 题12_二进制中1的个数;
/*
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * */
public class 题12_二进制中1的个数 {
    public int NumberOf1(int n) {
        int ans = 0;
        char[] num = Integer.toBinaryString(n).toCharArray();
        //这道题反而java方便
        //java用Integer.toBinaryString(n)先转2进制
        //再用toCharArray()搞到字符数组就行，不用考虑补码
        for(int i =0;i < num.length;i++)
        {
            if(num[i] == '1')
            {
                ans += 1;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题12_二进制中1的个数 a = new 题12_二进制中1的个数();
		System.out.println(a.NumberOf1(3));
	}

}

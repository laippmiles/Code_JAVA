package 题11_矩形覆盖;
/*我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？ */
public class 题11_矩形覆盖 {
    public int RectCover(int target) {
        if (target <= 2)
        {            
            return target;
        }
        int f1 = 1;
        int f2 = 2;
        int tep = 0;
        for(int i=3;i <= target;i++)
        {
            tep = f2;
            f2 += f1;
            f1 = tep;
        }
        return f2;
    }
	public static void start(String[] args) {
		// TODO 自动生成的方法存根
		题11_矩形覆盖 a = new 题11_矩形覆盖();
		//非静态引用要开个新类，通过类来引用才行
		//静态就不用
		System.out.println(a.RectCover(5));
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题11_矩形覆盖.start(null);
		//静态就不用开新类就能用了
	}
}
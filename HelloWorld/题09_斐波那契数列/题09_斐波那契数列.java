package 题09_斐波那契数列;

public class 题09_斐波那契数列 {
	//没啥要说的，最基本的代码翻译
    public int Fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int f1 = 0;
        int f2 = 1;
        int tep = 1;
        for (int i=2;i<=n;i++){
            tep = f2;
            f2 += f1;
            f1 = tep;
        }
        return f2;
    }


	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题09_斐波那契数列 a = new 题09_斐波那契数列();
		System.out.println(a.Fibonacci(3));
	}
}
package ��09_쳲���������;

public class ��09_쳲��������� {
	//ûɶҪ˵�ģ�������Ĵ��뷭��
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
		// TODO �Զ����ɵķ������
		��09_쳲��������� a = new ��09_쳲���������();
		System.out.println(a.Fibonacci(3));
	}
}
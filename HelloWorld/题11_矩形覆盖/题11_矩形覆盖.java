package ��11_���θ���;
/*���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ����� */
public class ��11_���θ��� {
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
		// TODO �Զ����ɵķ������
		��11_���θ��� a = new ��11_���θ���();
		//�Ǿ�̬����Ҫ�������࣬ͨ���������ò���
		//��̬�Ͳ���
		System.out.println(a.RectCover(5));
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		��11_���θ���.start(null);
		//��̬�Ͳ��ÿ������������
	}
}
package ��12_��������1�ĸ���;
/*
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * */
public class ��12_��������1�ĸ��� {
    public int NumberOf1(int n) {
        int ans = 0;
        char[] num = Integer.toBinaryString(n).toCharArray();
        //����ⷴ��java����
        //java��Integer.toBinaryString(n)��ת2����
        //����toCharArray()�㵽�ַ�������У����ÿ��ǲ���
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
		// TODO �Զ����ɵķ������
		��12_��������1�ĸ��� a = new ��12_��������1�ĸ���();
		System.out.println(a.NumberOf1(3));
	}

}

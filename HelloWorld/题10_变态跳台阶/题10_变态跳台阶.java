package ��10_��̬��̨��;

public class ��10_��̬��̨�� {
	
    public int JumpFloorII(int target) {
        if (target == 0)
            return 0;
        return (int)Math.pow(2,target-1);
    }
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		��10_��̬��̨�� a = new ��10_��̬��̨��();
		System.out.println(a.JumpFloorII(3));
	}

}

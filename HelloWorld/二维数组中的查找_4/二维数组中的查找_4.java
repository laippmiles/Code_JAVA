package ��ά�����еĲ���_4;

public class ��ά�����еĲ���_4 {
    public boolean Find(int target, int [][] array) {
    int i = 0;
    int j = array.length-1;
    while ((i < array[0].length) && (j >=0)){
        if (array[i][j] > target){
            j -= 1;
        }
        else if(array[i][j] < target){
            i += 1;
        }
        else{
            return true;
        }
    }
        return false;
    }
    
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		��ά�����еĲ���_4 a = new ��ά�����еĲ���_4();
		int[][] array = {{1,2},{2,4}};
		System.out.println(a.Find(3,array));
		//array ��֧����System.out.println��ֱ��д
	}
}
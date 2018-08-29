package 二维数组中的查找_4;

public class 二维数组中的查找_4 {
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
		// TODO 自动生成的方法存根
		二维数组中的查找_4 a = new 二维数组中的查找_4();
		int[][] array = {{1,2},{2,4}};
		System.out.println(a.Find(3,array));
		//array 不支持在System.out.println上直接写
	}
}
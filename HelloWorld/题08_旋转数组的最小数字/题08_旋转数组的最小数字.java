package ��08_��ת�������С����;
import java.util.ArrayList;
public class ��08_��ת�������С���� {
	
    public int minNumberInRotateArray(int [] array) {
        int l = 0;
        int r = array.length - 1;
        if (r < 0)
            return 0;
        if (r == 0)
            return array[0];
        
        while(l <= r)
        {
            if (r-l == 1)
                return array[r];
            int mid = (l+r) / 2;
            if ((array[l] == array[mid]) && (array[r] == array[mid])){
                int tep = 0;
                for (int i = l;i <= r;i++){
                    if (tep > array[i])
                        tep = array[i];
                }
                return tep;
            }
            
            if (array[l] <= array[mid])
                l = mid;
            if (array[r] >= array[mid])
                r = mid;
        }
        return array[r];
        }


	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		��08_��ת�������С���� a = new ��08_��ת�������С����();
		int[] b = {3,4,1,2};
		System.out.println(a.minNumberInRotateArray(b));
	}
	}

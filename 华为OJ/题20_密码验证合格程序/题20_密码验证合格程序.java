package ��20_������֤�ϸ����;

import java.util.*;
public class ��20_������֤�ϸ����{
	public static void main(String[]args)
    {    
        Scanner scan = new Scanner(System.in);
        //Scanner(System.in)��Ӧpython��input�� Scanner�����ڻ�ȡ�û�������
        while(scan.hasNextLine()){
            String pw = scan.nextLine();
            //nextLine()�����Ľ�����ֻ��Enter��
            System.out.println(func(pw));
        }
    }
    
    public static String func(String pw)
    {
        if(pw.length() <= 8)
            return("NG");
        
        for(int i=0;i<pw.length()-3;i++)
        {
            if (pw.substring(i+3,pw.length()).contains(pw.substring(i,i+3)))
            	//pw.substring�൱��python����Ƭ
            {
                return("NG");
            }
        }
        
        int[] count = new int[4];
        
        for(int i=0;i<pw.length();i++)
        {
            if(pw.charAt(i) >= 'a' && pw.charAt(i) <= 'z' )
                count[0] = 1;
            else if(pw.charAt(i) >= 'A' && pw.charAt(i) <= 'Z' )
                count[1] = 1;
            else if(pw.charAt(i) >= '0' && pw.charAt(i) <= '9' )
                count[2] = 1;
            else
                count[3] = 1;
        }
        if (count[0]+count[1]+count[2]+count[3] < 3)
            return("NG");
        return("OK");
    }
}

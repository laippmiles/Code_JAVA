package ��β��ͷ��ӡ����_6;
import java.util.ArrayList;
import java.util.Stack;
//JAVAҪ�����ݽṹ��ʱ��Ҫ��java.util������
//��java.util����ArrayList��Stack
public class ��β��ͷ��ӡ����_6 {
    public class ListNode {
	        int val;
	        ListNode next = null;
	
	        ListNode(int val) {
	            this.val = val;
	       }
	    }
    
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> ans = new Stack<>();
        while(listNode != null){
        	//null��==�ͣ�=�ж�
                ans.push(listNode.val);
                listNode = listNode.next;
        }
        
        ArrayList<Integer> list = new  ArrayList<Integer>();
        while(!ans.isEmpty()){
            list.add(ans.pop());
        }
        return list;
    }
	
    public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("������");
	}
}

package 从尾到头打印链表_6;
import java.util.ArrayList;
import java.util.Stack;
//JAVA要用数据结构的时候要在java.util处载入
//从java.util载入ArrayList和Stack
public class 从尾到头打印链表_6 {
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
        	//null用==和！=判断
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
		// TODO 自动生成的方法存根
		System.out.println("。。。");
	}
}

/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8*/

package leetcode;

public class problem2 {
	 /*public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        int jinwei=0;
	        ListNode sl1=l1;
	        ListNode sl2=l2;
	        ListNode result=null;
	        ListNode head=null;
	        while(sl1!=null & sl2!=null){
	        	int num=sl1.val+sl2.val+jinwei;
	        	int res=num%10;
	        	jinwei=num/10;
	        	ListNode p=new ListNode(res);
	        	p.next=null;
	        	if(head==null){
	        		head=p;
	        	}
	        	else{
	        		result.next=p;
	        	}
	        	result=p;
	        	sl1=sl1.next;
	        	sl2=sl2.next;
	        }
	        if(sl1!=null){
	        	while(sl1!=null){
	        		int num=sl1.val+jinwei;
	        		int res=num%10;
	        		jinwei=num/10;
	        		ListNode p=new ListNode(res);
	        		p.next=null;
	        		result.next=p;
	        		result=p;
	        		sl1=sl1.next;
	        	}
	        }
	        else if(sl2!=null){
	        	while(sl2!=null){
	        		int num=sl2.val+jinwei;
	        		int res=num%10;
	        		jinwei=num/10;
	        		ListNode p=new ListNode(res);
	        		p.next=null;
	        		result.next=p;
	        		result=p;
	        		sl2=sl2.next;
	        	}
	        }
	        if(jinwei>0){
	        	ListNode p=new ListNode(jinwei);
	        	p.next=null;
	        	result.next=p;
	        	result=p;
	        }
	        return head;
	    }

	 public static ListNode createList(int[] data){
		 ListNode head=null;
		 ListNode result=null;
		 for(int i=0;i<data.length;i++){
			 ListNode p=new ListNode(data[i]);
			 p.next=null;
			 if(head==null){
				 head=p;
			 }
			 else{
				 result.next=p;
			 }
			 result=p;
		 }
		 return head;
	 }*/
}
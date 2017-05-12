package problem21;



public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode r=null;
        ListNode p;
        while(l1!=null && l2!=null){
        	//新建一个节点
        	if(l1.val<=l2.val){
        		p=new ListNode(l1.val);
        		l1=l1.next;
        	}
        	else{
        		p=new ListNode(l2.val);
        		l2=l2.next;
        	}
    		p.next=null;
    		if(head==null){
    			head=p;
    			r=p;
    		}
    		else{
    			r.next=p;
    			r=p;
    		}
        }
        if(l1!=null){
        	while(l1!=null){
        		if(head==null){
        			head=l1;
        			r=head;
        		}
        		else{
        		p=l1;
        		r.next=l1;
        		r=p;}
        		l1=l1.next;
        	}
        }
        else if(l2!=null){
        	while(l2!=null){
        		if(head==null){
        			head=l2;
        			r=head;
        		}
        		else{
        		r.next=l2;
        		r=l2;
        		}
        		l2=l2.next;
        	}
        }
        return head;
    }
}

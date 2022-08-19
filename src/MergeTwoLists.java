import java.util.List;

public class MergeTwoLists {
	static class ListNode {
		      int val;
		      ListNode next;
		     ListNode() {}
		    ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  };

	public static void main(String[] args) {
		ListNode list1=new ListNode(1, new ListNode(2, new ListNode(5)));
		ListNode list2=new ListNode(4, new ListNode(6, new ListNode(7)));
		
		ListNode result=mergeTwoLists(list1, list2);
		while(result !=null) {
			System.out.println(result.val);
			result=result.next;
		}
		
	}

	static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head= new ListNode(0);
        if(list1==null)
        	return list2;
        if(list2==null) 
        	return list1;
        if(list1.val>list2.val) {
        	head=list2;
        	list2=list2.next;
        }else {
        	head=list1;
        	list1=list1.next;
        }
        head.next=mergeTwoLists(list1, list2);
        	
        return head;
        	
        }

   
}

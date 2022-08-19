
public class SumOfLinkedLsit {

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(2);
		ListNode list2 = new ListNode(4);
		ListNode list3 = new ListNode(3);
		list1.next = list2;
		list2.next = list3;
		ListNode list4 = new ListNode(5);
		ListNode list5 = new ListNode(6);
		ListNode list6 = new ListNode(4);
		list4.next = list5;
		list5.next = list6;

		ListNode resultNode = new ListNode();
		resultNode = addTwoNumbers(list1, list4);
		while(resultNode !=null) {
			System.out.println(resultNode.val);
			resultNode=resultNode.next;
		}
	}

	static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		  int carry=0;
	        int sum=0;
	         ListNode head=new ListNode(0);
	        ListNode node=head;
	        if(l2==null){
	            return l1;
	        }
	        if(l1==null){
	            return l2;
	        }
	        while(l1 !=null || l2!=null ||carry!=0){
	            
	            int val1=l1==null?0:l1.val;
	            int val2=l2==null?0:l2.val;
	            sum=val1+val2+carry;
	            carry=0;
	            if(sum>=10){
	               sum=sum%10;
	               carry=(int)Math.floor(sum/10);
	            }
	          node.next=new ListNode(sum);
	            sum=0;
	            l1=l1==null?l1:l1.next;
	            l2=l2==null?l2:l2.next;
	            node=node.next;
	        }
	        return head.next;
	    }
}

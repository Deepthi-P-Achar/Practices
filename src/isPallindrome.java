
public class isPallindrome {
	static class ListNode {
		      int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }

	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(2);
		ListNode node4=new ListNode(1);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		boolean result=isPalindrome(node1);
		System.out.println(result);

	}
	static boolean isPalindrome(ListNode head) {
        ListNode mainNode=head;
        ListNode refNode=head;
        while(refNode !=null && refNode.next!=null){
            refNode=refNode.next.next;
            mainNode=mainNode.next;
        }
        mainNode=reverse(mainNode);
        while(mainNode !=null){
            if(mainNode.val !=head.val){
                return false;
            }
            mainNode=mainNode.next;
            head=head.next;
        }
        return true;
    }
	 static ListNode reverse(ListNode mainNode){
         ListNode prev=null;
         ListNode current=mainNode;
        ListNode next=null;
            while(current!=null){
             next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        
       return current;
    }
}

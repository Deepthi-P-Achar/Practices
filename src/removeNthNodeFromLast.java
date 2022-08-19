

public class removeNthNodeFromLast {
	Node head;
	static class Node{
		int data;
		Node next;
		 public Node(int temp) {
			 this.data=temp;
			
		 }
	};
	static Node removeNthNodeFromLastNode(Node head, int n) {
		Node dummy=new Node(0);
		dummy.next=head;
		Node mainNode=dummy;
		Node refNode=head;
		for(int i=0;i<n && refNode !=null;i++) {
			if(refNode.next==null && i==n-1) {
				dummy=dummy.next;
			}
			refNode=refNode.next;
		}
		while(refNode != null) {
			refNode=refNode.next;
			mainNode=mainNode.next;
		}
		if(mainNode!=null)
			mainNode.next=mainNode.next.next;
		
	return dummy.next;
	}
	public static void main(String[] args) {
		 Node node= new Node(1);
		 node.next=new Node(2);
		 node.next.next=new Node(3);
		 Node dummy= removeNthNodeFromLastNode(node,1);
		 while(dummy !=null) {
			 System.out.println(dummy.data);
			 dummy=dummy.next;
		 }
		 }
		
		
		
	

}

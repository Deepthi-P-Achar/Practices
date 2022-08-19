public class findNthNodeFromLast {
	static class Node{
		int data;
		Node next;
		 public Node(int temp) {
			 this.data=temp;
			
		 }
	};
	static int findNthNodeFromLastNode(Node head, int n) {
		Node refNode=head;
		Node mainNode=head;
		for(int i=0;i<n;i++) {
			refNode=refNode.next;
		}
		while(refNode != null) {
			refNode=refNode.next;
			mainNode=mainNode.next;
		}
	return mainNode.data;
	}
	public static void main(String[] args) {
		 Node node= new Node(1);
		 node.next=new Node(2);
		 node.next.next=new Node(3);
		 int data=findNthNodeFromLastNode(node,3);
		 System.out.println(data);
		
		
	}

}


public class InterSectionOfTwoList {
		
		static class Node {
			int data;
			Node next;
			
			Node(int data){
				this.data = data;
				next = null;
			}
		}
		
	public static void main(String[] args) {
		
			// creating first linked list
	        Node head1=new Node(3);
			head1.next = new Node(6);
	        head1.next.next = new Node(15);
	        head1.next.next.next = new Node(15);
	        head1.next.next.next.next = new Node(30);
	 
	        // creating second linked list
	        Node head2 = new Node(10);
	        head2.next = new Node(15);
	        head2.next.next = new Node(30);
	 
	        System.out.println("The node of intersection is " + getNode(head1,head2));
		}

		private static int getNode(Node head1,Node head2) {
			// TODO Auto-generated method stub
			
			Node current1 = head1;
			Node current2= head2;
			

			int n1=countLength(head1);
			int n2 = countLength(head2);
			
			int d = Math.abs(n1-n2);
			
			if(n2>n1){
				
				Node temp = current1;
				current1=current2;
				current2=temp;
			} 
			
	          for (int i = 0; i < d; i++) {
	            if (current1 == null) {
	                return -1;
	            }
	            current1 = current1.next;
	        }
			
	        while (current1 != null && current2 != null) {
	            if (current1.data == current2.data) {
	                return current1.data;
	            }
	            current1 = current1.next;
	            current2 = current2.next;
	        }
	 
	        return -1;
	    }
	private static int countLength(Node head22) {
			// TODO Auto-generated method stub
			
			int count =0;
			Node currNode = head22;
	
			while(currNode!=null){
				currNode=currNode.next;
				count++;
			}
			return count;
		}
	}

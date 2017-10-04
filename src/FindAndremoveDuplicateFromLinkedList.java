
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;


class FindAndremoveDuplicateFromLinkedList {
	
	public static void main(String[] args) {
	
		
		LinkedList<Integer> al = new LinkedList<Integer>();
		
		al.add(13);
		al.add(11);
		al.add(12);
		al.add(5);
		al.add(2);
		al.add(4);
		al.add(13);
		al.add(5);
		al.add(4);
		
		
		for(int i: al)
			System.out.println(i);
		
		
		LinkedList<Integer> res = new LinkedList<Integer>();
		
		for(int i:al){
			if(!res.contains(i))
				res.add(i);
		}
		
		System.out.println("\nAfter removing using recursion : \n");
		
		for(int i:res)
			System.out.println(i);
		
		
		System.out.println("\nDuplicates : \n");
		
		HashSet<Integer> resa= new HashSet<Integer>();

		for(int i: al){
			if(!resa.add(i))
				System.out.println(i);
		}
		
	}
}
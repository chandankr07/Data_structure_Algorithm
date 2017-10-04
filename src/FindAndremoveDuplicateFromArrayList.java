
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindAndremoveDuplicateFromArrayList {

	
	public static void main(String[] args) {
	
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
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
		
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		
		for(int i:al){
			if(!res.contains(i))
				res.add(i);
		}
		
		System.out.println("\nAfter removing recursion : \n");
		
		for(int i:res)
			System.out.println(i);
		
		
		res = new ArrayList<Integer>(new HashSet<Integer>(al));


		System.out.println("\nAfter removing Hashset : \n");
				
		for(int i: res)
			System.out.println(i);

		
		res = new ArrayList<Integer>(new LinkedHashSet<Integer>(al));


		System.out.println("\nAfter removing LinkedHashset : \n");
				
		for(int i: res)
			System.out.println(i);
		
		
		System.out.println("Duplicates : \n");
		

		HashSet<Integer> resa= new HashSet<Integer>();

		for(int i: al){
			if(!resa.add(i))
				System.out.println(i);
		}
		
	}
}

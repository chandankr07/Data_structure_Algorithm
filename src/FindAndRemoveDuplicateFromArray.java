
public class FindAndRemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int[] input = {1, 1, 6, 3,6, 7,0,90,34,56,6,7, 7, 8, 9, 9, 9, 10};
		int current = input[0];
		boolean found = false;

		for (int i = 0; i < input.length; i++) {
		    if (current == input[i] && !found) {
		        found = true;
		        
		    } else if (current != input[i]) {
		        System.out.print(" " + current);
		        current = input[i];
		        found = false;
		    }
		}
		
		System.out.print(" " + current);
		
		
	}
	
}

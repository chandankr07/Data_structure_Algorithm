
public class HexadecimalToDecimal {
	
	
		public static void main(String[] args) {
			
			String s = "3e8";
			
			System.out.println(s.toUpperCase());
			
			System.out.println(change(s));
			
			
		}
	    
		
		public static int change(String s){
			
			int val =0;
			s = s.toUpperCase();
			
			String digits = "0123456789ABCDEF";
			
			for(int i=0; i<s.length(); i++){
				
				char c = s.charAt(i);
				int index = digits.indexOf(c);
				val = 16*val+index;
				
			}
			
			return val;
			
		}
		
		
	
}

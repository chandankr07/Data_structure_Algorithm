
class Test
{
	
	public static void main(String[] args) {
		
		String s   =  "sadjhak3sajd%300kasdh10ljljk37kllj30jk&";

		int sum =0;
		String temp  ="";
		
		for(int i =0; i<s.length();i++){
			
			char c = s.charAt(i);
			if(Character.isDigit(c)){
				temp=temp+Character.toString(c);
				continue;
			}
			else{
				try{
					sum = sum+Integer.parseInt(temp);
					temp  =  "";
				}
				catch(Exception e)
				{
					temp = "";
				}
			}
			
		}
		
		System.out.println(sum);
		
		
	}
}

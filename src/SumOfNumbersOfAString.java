class SumOfNumbersOfAString{
	public static void main(String[] args) {

/*	
		String str = "AABAASASASC30DE45P5%@50Pu%@Pu" ;

				str = str.replaceAll("[^-0-9]+", " ").trim(); 
		
		
		int sum =0;
		
		String[] arr = str.split("\\s+");
		
		System.out.println(str);
				
		for(int i = 0; i<arr.length;i++){
			
			sum = sum+Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
	
*/	
		String s = "jklmn489pjro635ops";
		
		 int add = 0;
	     for(int i = 0; i < s.length() ; i++){
	         if( Character.isDigit(s.charAt(i)) ){
	        	 add = add + Character.getNumericValue(s.charAt(i));
	         }
	     }
	     System.out.println(add);
     
/*		String str = "AABAASASASC30DE45P5%@50Pu" ;
		
		int sum =0, nid=0;
		
		String temp="";
		
		for(int i = 0; i<str.length();i++){
			
			if(Character.isDigit((str.charAt(i)))){
				temp=temp+str.charAt(i);
				System.out.println(temp);
				continue;
			}
			
			else {
				try{
					nid = Integer.parseInt(temp);
					temp = "0";
				}catch (Exception e) {
					// TODO: handle exception
						temp = "0";
					}
				}
			sum = sum+nid;
			

		}*/
     }
}
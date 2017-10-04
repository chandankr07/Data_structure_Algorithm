
import java.util.HashMap;
import java.util.Map.Entry;

public class StringRelaceWithCountInString {
		  
			public static void main(String[] args)  {
				String s1= "java concept of theday";
				occrcount(s1);
			}
			
			public static void occrcount(String s){
				
				HashMap<Character,Integer> map= new HashMap<Character, Integer>();
				
				for(int i=0; i<s.length();i++){
					
					char charKey = s.charAt(i);
					int count =0;
					
					if(map.containsKey(charKey))
						count = map.get(charKey);
					
					map.put(charKey, ++count);
					
				}						
				
				String st = "abcdefghijklmnopqrstuvwxyz";
							
				for(Entry<Character, Integer> entry:map.entrySet()){
					
					for(int i=0; i<st.length();i++){
						
	                    if(st.charAt(i)==entry.getKey()){
	                    	st = st.replace(Character.toString(st.charAt(i)), entry.getValue().toString());
	                    }
					}
				}
				
				for(int i=0; i<st.length();i++){
				
					try{
						Integer.parseInt(Character.toString(st.charAt(i)));
					}
				
					catch(Exception e){
						
						st = st.replace(Character.toString(st.charAt(i)), "0");
					}
				}
				System.out.println(st);
				}
	}

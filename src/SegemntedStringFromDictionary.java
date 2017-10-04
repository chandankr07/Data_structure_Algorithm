import java.util.HashSet;
import java.util.Set;

public class SegemntedStringFromDictionary {
	
	
	public static void main(String[] args) {
		
		
		String str = "applepie";
		
		String [] dic = {"apple","pie","chandan","Kumar","Singh","how","are","you","mister","ram","I","am","Fine","varun"};
		
		Set <String> dict = new HashSet<String>();
		
		for(String i:dic)
			dict.add(i);
				
		System.out.println(SegmentString(str,dict));
		
	}

	private static String SegmentString(String input, Set<String> dict) {
		 int len = input.length();
		  for (int i = 1; i < len; i++) {
		    String prefix = input.substring(0, i);
		    System.out.println("prefixes : "+ prefix);
		    if (dict.contains(prefix)) {
		      String suffix = input.substring(i, len);
			    System.out.println("suffixes : "+ suffix);
		      if (dict.contains(suffix)) {
		        return prefix + " " + suffix;
		      }
		    }
		  }
		  return null;
		}

}

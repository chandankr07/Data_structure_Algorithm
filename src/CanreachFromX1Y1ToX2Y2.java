import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CanreachFromX1Y1ToX2Y2 {
	
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	
    	Scanner sc = new Scanner(System.in);
  /*  
    	int x1 = sc.nextInt();

    	int x2 = sc.nextInt();
    	int y1 = sc.nextInt();
    	int y2 = sc.nextInt();
    	
//    	System.out.println(canReach(x1,y1,x2,y2));
*/    	System.out.println(canReach(1,4,5,9));
    	
    }


    /*
     * Complete the function below.
     */
    static String canReach(int x1, int y1, int x2, int y2) {

		while(x1 < x2 && y1 <y2){
			boolean b= true;
			
			int temp = x1+y1;
			
			if(temp < x2 && b== true){
				x1 = x1+temp;
                b=false;
        }   
			
		System.out.println(x1);
        if(temp< y2){
				y1 = y1+temp;
                b =true;
        }

		System.out.println(11);
		}
		

		
		if(x1==x2 && y1==y2)
			return "Yes";
		
		return "No";
		
	}
}
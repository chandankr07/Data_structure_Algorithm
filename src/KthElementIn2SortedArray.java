
public class KthElementIn2SortedArray {

	    static int kth(int arr1[], int arr2[], int m, int n, int k)
	    {
	        int[] sorted = new int[m + n];
	        int i = 0, j = 0, c = 0;
	        
	        for(int p =0; p<m+n;p++){
	        	
	        while (i < m && j < n)
	        {
	            if (arr1[i] < arr2[j]){
	                sorted[c++] = arr1[i++];
	                
	            }else{
	                	sorted[c++] = arr2[j++];
	                }	
	            }
	        while (i < m)
	            sorted[c++] = arr1[i++];
	        while (j < n)
	            sorted[c++] = arr2[j++];
	        }
	        for(int l:sorted)
	        	System.out.println(l);
	        
	        System.out.println();
	        return sorted[k - 1];
	    }
	    
	    // main function
	    public static void main (String[] args) 
	    {
	        int arr1[] = {0,2, 3, 5, 7, 9, 11,17};
	        int arr2[] = {1, 4, 8, 10};
	        int k = 3;
	        System.out.print(kth(arr1, arr2, 5, 4, k));
	    }
	}

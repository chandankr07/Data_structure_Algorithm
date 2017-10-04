package Matrix_programs;

public class SpiralPrintMatrix {

			public static void main(String[] args) {
			
			int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
			boolean leftToRight = true;
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					
					if(!leftToRight) 
						System.out.print(arr[i][j] + " ");
					 else 
						System.out.print(arr[i][arr[0].length - j - 1] + " ");
					}
				
				if(leftToRight) 
					leftToRight = false;
				else 
					leftToRight = true;
			}

		}

	}
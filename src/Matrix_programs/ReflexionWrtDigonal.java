package Matrix_programs;

/*
 *  mXn matrix.

 diagonal 1(1,5,9)
 diagonal 2(3,5,7)

 1 2 3
 4 5 6    
 7 8 9
 
 ||   (fLIP OVER DIGONAL 1)
 \/
 
 1 4 7
 2 5 8
 3 6 9
 

  || (flip over diagonal 2)
  \/

 9 6 3
 8 5 2
 7 4 1


void flipOverSecondDigonal(int **mat, int num_row, int num_col)
{
}
 * 
 * 
 */


import java.util.Scanner;

public class ReflexionWrtDigonal {


	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m =  3;
		int n =  3;
		
		int [][] input = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<m;i++){
			for(int j=0; j<n;j++){
				System.out.println(input[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("First Digonal of a matrix :");
		
		for(int i=n-1; i>=0;i--){
			System.out.println(input[m-i-1][i]);
		}
		
		System.out.println("\nSecond Digonal of a matrix :" );
		for(int j=0; j<m;j++){
			System.out.println(input[j][j]);
		}
			// 1(00) 2(01) 3(02)  10  
			// 4(10) 5(11) 6(12)  11 
			// 7(20) 8(21) 9(22)  12
		//     13    14    15		16
	//	 
	//
	//	 9 6 3
	//	 8 5 2
	//	 7 4 1
		
		System.out.println("\nTranspose :  reflexion across first digonal :");
		for(int i=0; i<m;i++){
			for(int j=0; j<n;j++){
				
				System.out.println(input[j][i]+"");
			}
			System.out.println();
		}
		
		System.out.println("\nFlip across 3,5,7 Digonal :");
		
		int result [][]  = new int[m][n];
		
		for(int i=0; i<m;i++){
			for(int j=0; j<n;j++){
				
			//	swap(input[i][j], input[m-j-1][n-i-1]);
				/* 
				int temp = input[i][j];
				input[i][j] = input[m-j-1][n-i-1];
				input [m-j-1][n-i-1] = temp;
				
			*/				
				result [m-j-1][n-i-1] = input[i][j];
				
			}
		}
			
		for(int i=0; i<m;i++){
			for(int j=0; j<n;j++){
				
				System.out.println(result[i][j]);
			}
			System.out.println();
		}
	}

	private static void swap(int x, int y) {
		// TODO Auto-generated method stub
		int z = x;
		x=y;
		y=z;
	}
}

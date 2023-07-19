import java.security.PublicKey;
import java.util.Scanner;

public class PyramidPractiseClass {

	//square hollow pattern
	public static void squareHollowPattern(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("* ");
			if (i==0) {
				for (int j = 0; j <n-2; j++) {
					System.out.print("* ");					
				}
			}
			else if (i == n-1) {
				for (int j = 0; j < n-2; j++) {
					System.out.print("* ");					
				}

			}
			else {
				for (int j = 0; j < n-2; j++) {
					System.out.print("  ");					
				}
			}
			System.out.print("*");
			System.out.println();
		}
		
	}
	
	public static void numberTrianglePattern(int n) { //n is limited to 9
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void numberIncreasingRightTrianglePattern(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void numberIncreasingRightTrianglePatternReverse(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n+1-i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void numberChangingPyramidPattern(int n) {
		int x=1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(x+" ");
				x+=1;
			}
			System.out.println();
		}
	}

	public static void zeroOneTrianglePyramidPattern(int n) {		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i+j)%2==0) {
					System.out.print(1+" ");					
				}
				else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void palindromeTrianglePattern(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= 2*(n-i) ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i ; j++) {
				System.out.print(i-j+1+" ");
			}
			for (int j = 2; j <= i ; j++) {
				System.out.print(j+" ");
			}

			System.out.println();
		}
	}
	
	public static void rhombusPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void diamondStarPattern(int n) {
		//print the upper half triangle
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			for (int j = 2; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//print the lower half triangle
		for (int i = n-1; i >=1; i--) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			for (int j = 2; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void butterflyStarPattern(int n) {
		//print the upper half triangle
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//print the mirror copy of upper half
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void squareFillPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");					
			}			
			System.out.println();
		}
	}
	
	public static void rightHalfPyramidPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void rightHalfPyramidPatternReverse(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void leftHalfPyramidPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2*(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void leftHalfPyramidPatternReverse(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= 2*(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void kPattern(int n) {
		///upper half reverse right triangle
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		//lower half right triangle
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void triangleStarPattern(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void numberTrianglePatternReverse(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = n-i+1; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void mirrorImageNumberTrianglePatternReverse(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = n-i+1; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = n-(i-1); j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void triangleHollowStarPattern(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j==1 || j==i || i==n) {
					System.out.print("* ");					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(); 
		}
	}

	public static void triangleHollowStarPatternReverse(int n) {
		for (int i = n; i >= 1 ; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j==1 || j==i || i==n) {
					System.out.print("* ");					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(); 
		}
	}

	public static void diamondHollowPatternReverse(int n) {
		
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j==1 || j==i ) {
					System.out.print("* ");					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(); 
		}
		for (int i = n-1; i >= 1 ; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j==1 || j==i ) {
					System.out.print("* ");					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(); 
		}
	}

	public static void hourglassHollowPattern(int n) {
		for (int i = n; i >= 1 ; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j==1 || j==i || i==n) {
					System.out.print("* ");					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(); 
		}
		for (int i = 2; i <= n ; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j==1 || j==i || i==n) {
					System.out.print("* ");					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(); 
		}
	}

	public static int factorial(int i) { //recursive method
		if (i==0) {
			return 1;
		}
		return i*factorial(i-1);
	}
	
	public static void pascalTrianglePattern(int n) {
		
		for (int i = 0; i < n; i++) {
			//adding space to the left side
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) { 
				Integer c = factorial(i)/(factorial(i-j)*factorial(j));
				System.out.print(" "+ c );
			}
		
			System.out.println();
		}
	}
	
	public static void triangleWithRepeatingPattern(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(j+" ");
			}
			for (int j = i-1; j >= 1 ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void invertedDoubleTriangles(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= i-1 ; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = n-1; i >= 1 ; i--) {
			for (int j = 1; j <= i-1 ; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	public static void invertedDoubleTriangles2(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= i-1 ; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 1 ; i--) {
			for (int j = 1; j <= i-1 ; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void digitPillarPattern(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n-i ; j++) {
				System.out.print(1);
			}
			for (int j = 1; j <= i ; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void binaryDigitPattern(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n ; j++) {
				if ((i+j)%2==0) {
					System.out.print(1);					
				}
				else {
					System.out.print(0);										
				}
			}
			System.out.println();
		}
	}
	
	
	public static void ascendingTrianglePattern(int n) { //complex
		for (int i = 1; i <= n ; i++) {
			System.out.print(i+" ");
			int x =1;
			int y = i;
			
			for (int j = n-1; j > n-i ; j--) {
				y=y+(n-x);
			    x++;
			    System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	
	public static void ascendingTrianglePattern2(int n) { //easy and alternative to ascendingTrianglePattern
		for (int i = 1; i <= n ; i++) {
			int num=i;
			for (int j = 1; j <= i ; j++) {
			    System.out.print(num+" ");
			    num=num+n-j;
			}
			System.out.println();
		}
	}
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to create pattern: ");
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		
//		squareHollowPattern(i);
//		numberTrianglePattern(i);
//		numberIncreasingRightTrianglePattern(i);
//		numberIncreasingRightTrianglePatternReverse(i);
//		numberChangingPyramidPattern(i);
//		zeroOneTrianglePyramidPattern(i);
//		palindromeTrianglePattern(i);
//		rhombusPattern(i);
//		diamondStarPattern(i);
//		butterflyStarPattern(i);
//		squareFillPattern(i);
//		rightHalfPyramidPattern(i);
//		rightHalfPyramidPatternReverse(i);
//		leftHalfPyramidPattern(i);
//		leftHalfPyramidPatternReverse(i);
//		kPattern(i);
//		triangleStarPattern(i);
//		numberTrianglePatternReverse(i);
//		mirrorImageNumberTrianglePatternReverse(i);
//		triangleHollowStarPattern(i);
//		triangleHollowStarPatternReverse(i);
//		diamondHollowPatternReverse(i);
//		hourglassHollowPattern(i);
//		pascalTrianglePattern(i);
//		triangleWithRepeatingPattern(i);
//		invertedDoubleTriangles(i);
//		invertedDoubleTriangles2(i);
//		digitPillarPattern(i);
//		binaryDigitPattern(i);
		ascendingTrianglePattern2(i);
		
		
		
		
	}

}

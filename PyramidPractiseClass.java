
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
	
	public static void numberIncreasingReverseRightTrianglePattern(int n) {
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=6;
		squareHollowPattern(i);
		numberTrianglePattern(i);
		numberIncreasingRightTrianglePattern(i);
		numberIncreasingReverseRightTrianglePattern(i);
		numberChangingPyramidPattern(i);
		zeroOneTrianglePyramidPattern(i);
		palindromeTrianglePattern(i);
		rhombusPattern(i);
		diamondStarPattern(i);
		butterflyStarPattern(i);
		squareFillPattern(i);
		
		
	}

}

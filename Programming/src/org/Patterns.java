package org;

public class Patterns {
		public static void main(String[] args) {
			int n = 5;
//			int n = 5;
//			for(int i =1;i<=n;i++) {
//				for(int j = n -i; j>=1;j-- ) {
//					System.out.print(" ");
//				}
//				for(int j = i;j>=1;j--) {
//					if(i%2 == 0) System.out.print(0+"");
//					else System.out.print(1+"");
//				}
//				System.out.println(" ");
//			}
		
//			for(int i =1;i<=n;i++) {
//				for(int j = 1;j<=n;j++) {
//					if(j == 1|| j == n || i==j) System.out.print("* ");
//					else System.out.print("  ");
//				}
//				System.out.println(" ");
//			}
			
//			int a = 0;
//			for(int i = 1;i<=n;i++) {
//				for(int j = i; j<n; j++) {
//					System.out.print("  ");
//				}
//				for(int k = 1; k<=(2*i-1);k++) {
//					System.out.print(a%2+" ");
//					a++;
//				}
//				
//				System.out.println(" ");
//			}
			
//			for(int i =1;i<=n;i++) {
//				for(int j = i;j<n;j++) {
//					System.out.print(" ");
//				}
//				if(i%2!=0) {
//					for(int j = i; j>=1; j--) {
//						System.out.print("* ");
//					}
//				}
//				System.out.println(" ");
//			}
//			
//			for(int i = n - 1;i>=1;i--) {
//				for(int j = n - i; j>0;j--) {
//					System.out.print(" ");
//				}									
//				if(i%2!=0) {
//					for(int j = n - i; j<n;j++) {
//						System.out.print("* ");
//					}
//				}
//				System.out.println(" ");
//			}
//
//		      *  
//		    
//		    * * *  
//		    
//		  * * * * *  
//		    
//		    * * *  
//		      
//		      *  
			
//			for(int i = 1;i<=n;i++) {
//				if(i%2!=0) {
//					for(int j = i;j>=1;j--) {
//						System.out.print("* ");
//					}	
//				}
//				System.out.println(" ");
//			}
			
//			for(int i =1;i<=n;i++) {
//				for(int j = 1; j<=i;j++) {
//					System.out.print(n-j+1+" ");
//				}
//				System.out.println(" ");
//			}
			
//			for(int i = 0;i<n;i++) {
//				for(int j = n - i;j>1;j--) {
//					System.out.print("  ");
//				}
//				for(int j = i; j>=0;j--) {
//					System.out.print((char)(j%26+65)+" ");
//				}
//				System.out.println(" ");
//			}
//			1 2 3 4 5 
//			1 2 3 4 
//			1 2 3 
//			1 2 
//			1
//			int a = 1;
//			for(int i = 1;i<=n;i++) {
//				for(int j = 1;j<=n;j++) {
//					System.out.print(a%2+" ");
//					a++;
//				}
//				a = 1;
//				System.out.println(" ");
//			}
			
//			1 0 1 0 1  
//			1 0 1 0 1  
//			1 0 1 0 1  
//			1 0 1 0 1  
//			1 0 1 0 1  
			
//			for(int i =1;i<=n;i++) {
//				for(int j = 1;j<=n+1-i;j++) {
//					System.out.print(j+" ");
//				}
//				System.out.println(" ");
//			}
			
//			for(int i = 1;i<=n;i++) {
//				for(int j = 1;j<=n;j++) {
//					if(i == 1||i==n||j==1||j == n||j == (n/2)+12)
//						System.out.print("* ");
//					else System.out.print("  ");
//			}
//				System.out.println();
//
//		}
//			for(int i =1;i<=n;i++) {
//				if(i%2!=0) {
//					for(int j = n - i;j>=1;j--) {
//						System.out.print(" ");
//					}
//					for(int j = i;j>=1;j--) {
//						System.out.print("* ");
//					}	
//				}
//				System.out.println();
//			}
//			
//			for(int i = n-1;i>=1;i--) {
//				if(i%2!=0)`{
//					for(int j = n-i;j>0;j--) {
//						System.out.print(" ");
//					}
//					for(int j = n;j>n - i;j--) {
//						System.out.print("* ");
//					}
//				}
//				
//				System.out.println(" ");
//			}
//			int a = 1;
//			for(int i = 1;i<=n;i++) {
//				for(int j = n - i;j>=1;j--) {
//					System.out.print("  ");
//				}
//				
//				for(int j = 1;j<=(2*i-1);j++) {
//					System.out.print(a%2+" ");
//				}
//				a++;
//				System.out.println();
//			}
			
//			for(int i = 0;i<n;i++) {
//				for(int j = 0;j<n - i;j++) {
//					System.out.print("  ");
//				}
//				
//				for(int j = i;j>=0;j--) {
//					System.out.print((char)(i%26+65)+" ");
//				}
//				
//				System.out.println();
//			}
			
//			
//			

//			for(int i = 1;i<=n;i++) {
//				for(int j = 1;j<=n;j++) {
//					if(i == 1||i == n||j==n/2+1)
//						System.out.print("* ");
//					else System.out.print("  ");
//				}
//				System.out.println("  ");
//			}
//			int a = 1;
//			for(int i = 1;i<=n;i++) {
//				if(i%2!=0) a = 1;
//				else a = 0;
//				for(int j =i; j>=1;j--) {
//					System.out.print(a%2+" ");
//					a++;
//				}
//				System.out.println();
//			}
			
//			
			
			for(int i = n;i>=1;i--) {
				for(int j = i;j>0;j--) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i = 2;i<=n;i++) {
				for(int j = i;j>0;j--) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}	
}

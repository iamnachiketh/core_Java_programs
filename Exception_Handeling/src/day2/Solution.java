package day2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("START");
		int[] arr = {10,20};
		try {
			try {
				System.out.println(10/0);
			}catch(Exception e) {
				System.out.println("Arithmetic Exception");
			}
			System.out.println(arr[100]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index OutOf Bounds");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e) {
			System.out.println("Generral exception");
		}
		
		System.out.println("END");
	}

}

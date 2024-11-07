package matrix;

public class SumMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {{2,3,1},{6,2,9},{2,9,1}};
		int[][] arr2 = {{4,3,7},{2,9,9},{1,5,1}};
		
		int[][] sum = new int[arr1.length][arr1[0].length];
		
		for(int i =0;i<arr1.length;i++) {
			for(int j = 0;j<arr1[0].length;j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		for(int i = 0;i<arr1.length;i++) {
			for(int j = 0;j<arr1[0].length;j++) {
				System.out.print(sum[i][j]+"  ");
			}
			System.out.println("");
		}
	}

}

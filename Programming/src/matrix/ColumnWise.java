package matrix;

public class ColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { {2,3,4},
				{5,4,1},
					{8,2,5}};
		
		int[] sum = new int[arr[0].length];
		
		for(int i =0; i<arr[0].length;i++) {
			for(int j =0;j<arr.length;j++) {
				sum[i] = sum[i] + arr[j][i];
			}
		}
		
		for(int i:sum) {
			System.out.println(i);
		}
	}

}

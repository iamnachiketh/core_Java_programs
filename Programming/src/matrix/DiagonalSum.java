package matrix;

public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[][] arr = { {2,3,4},
					{5,4,1},
					{6,7,9}};
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				if(i == j || i+j== arr.length+1) {
					sum = sum + arr[i][j];
				}
			}
		}
		
		System.out.println(sum);
		
	}

}

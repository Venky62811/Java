package Array;



public class array2D {

	public static void main(String[] args) {
	int[][] a= { {1,2,3},{4,5,6},{7,8,9} };
	int[][] b= { {7,8,9},{2,4,5},{4,5,7} };
	int[][] sum=new int[3][3];
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			sum[i][j] = a[i][j] + b[i][j];
	
//	for(int i=0;i<3;i++) {
//		for(int j=0;j<3;j++) {
			System.out.print(sum[i][j] + " ");
		}
		System.out.println();
	}
	}
}



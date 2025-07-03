package Array;

public class OfficeAttendance {

	public static void main(String[] args) {
		int[][] emp=new int[5][3];
		
		emp[1][1]= -1;
		emp [2][0]= -1;
		emp [3][2]= -1;
		for( int i=0;i<emp.length;i++) {
			for( int j=0;j<emp[i].length;j++) {
				System.out.print(emp[i][j]+1 + " ");
			}
			System.out.println();
		}
	}
}

package Array;

public class Studentsmarks {

	public static void main(String[] args) {
		int [][] marks ={ 
				{65,70,60},
				{80,60,65},
				{55,60,65},
				{70,65,65}
				};
		 
		for( int i=0;i<marks.length;i++) {
			int total=0;
			for(int j=0;j<marks[i].length;j++) {
				
				total += marks[i][j];
				

				}
		
			System.out.println("Student  " + (i+1) + " Total "  + total);
		}
	}
}

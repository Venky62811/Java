package Array;

public class TicTacToe {

	public static void main(String[] args) {
		char[][] pattern= {{'X' ,'O','X',},
				{' ','X','O'},
				{'O',' ','X'},
				};
			for(int i=0;i<pattern.length;i++) {
				for(int j=0;j<pattern[i].length;j++) {
					System.out.print(pattern[i][j] + " ");
				}
				System.out.println();
		}

	}

}

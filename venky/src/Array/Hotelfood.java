package Array;

public class Hotelfood {

	public static void main(String[] args) {
		int[][] bills= {{20,30,50},{35,23,54},{24,53,23}};
		for(int i=0;i<bills.length;i++) {
			int total=0;
			for(int j=0;j<bills[i].length;j++) {
				
				total += bills[i][j];
			}
			System.out.println("Costumer " + (i+1) + " Bill "+ ":" +total);
		}
			

	}

}

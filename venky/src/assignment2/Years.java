package assignment2;

import java.util.Scanner;

public class Years {

	public static void main(String[] args) {
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
		if((year % 4 == 0 && year %100 !=0 )) {
		
		System.out.println("Leap");
		}
		else {
			System.out.println("Not leap");
		}
		
	}

}

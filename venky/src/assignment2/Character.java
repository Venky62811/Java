package assignment2;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch= sc.next().charAt(0);
		if(ch >='A' && ch <='Z')
			System.out.println("Alphabet");
		else
			System.out.println("Not Alphabet");
		
	}

}

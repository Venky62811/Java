package assignment2;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b)
            System.out.println(a + " is maximum");
        else
            System.out.println(b + " is maximum");
    }	
	}



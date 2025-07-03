package Operators;
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value of A");
	int a=sc.nextInt();
	System.out.println("Enter the Value of B");
	int b=sc.nextInt();
	System.out.println("Enter the Value of C");
	int c=sc.nextInt();
	System.out.println("Enter the Value of D");
	int d=sc.nextInt();
	System.out.println("Enter the Value of E");
	int e=sc.nextInt();
	int avg=(a+b+c+d+e)/5;
	System.out.println("The Average of 5 Numbers is : "+avg);
	}

}

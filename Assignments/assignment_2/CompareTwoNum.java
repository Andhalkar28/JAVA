//11. Write a program to compare two numbers? (==,>,<)
import java.util.Scanner;
public class CompareTwoNum{
	public static void main(String args[]){

		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		a = sc.nextInt();
		System.out.println("Enter Second Number : :");
		b = sc.nextInt();
		if(a==b)
			System.out.println("Both Number Are Equal....");
		else if (a>b)
			System.out.println("First Number Is Greater Than Second");
		else if (a<b)
			System.out.println("First Number Is Lesser Than Second");

	}
}

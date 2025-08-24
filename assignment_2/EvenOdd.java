//3. Write a program to check whether given number is even or odd (with if and conditional operator ?:)?
import java.util.Scanner;
public class EvenOdd{
	public static void main(String args[]){

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		n = sc.nextInt();
		//if(n%2==0)
		//	System.out.println("Even Number");
		//else
		//	System.out.println("Odd Number !!! ");
		System.out.println((n % 2 == 0)?"Even Number !":"Odd Number !!");
	}
}


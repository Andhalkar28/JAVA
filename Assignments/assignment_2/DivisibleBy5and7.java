//5. Write a program to check whether given number is divisible by 5 and 7? (with && operator and with nested if) 
import java.util.Scanner;
public class DivisibleBy5and7{
	public static void main(String args[]){

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		n = sc.nextInt();
		if((n%5==0) && (n%7==0))
			System.out.println("No Is Divisible By 5 & 7");
		else if((n%5==0))
			System.out.println("No Is Divisible By 5 ");
		else if((n%7==0))
			System.out.println("No Is Divisible By 7 ");
		else
			System.out.println("No Is Not Divisible By Both 5 & 7 ");
	}
}
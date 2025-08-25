//9. Accept any year as input through the keyboard. Write a program to check whether the year isa leap year or not. 
import java.util.Scanner;
public class LeapYearOrNot{
	public static void main(String args[]){

		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year :");
		year = sc.nextInt();
		if((year % 4 ==0) ||((year % 400 == 0) && (year % 100 !=0)))
			System.out.println("Year Is Leap Year");
		else
			System.out.println("Year Is Not Leap Year ");
	}
}
//1 & 2. Write a program to check whether given number is positive or negative? 
import java.util.Scanner;
public class PositiveOrNegetive{
	public static void main(String args[]){

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number :");
		num = sc.nextInt();
		if(num>0)
			System.out.println("Positive Number");
		else
			System.out.println("Negetive Number !!! ");
	}
}


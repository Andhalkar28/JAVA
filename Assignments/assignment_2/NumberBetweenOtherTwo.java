//7. Write a program to accept three numbers and check whether the first is between the other two numbers. 
import java.util.Scanner;
public class  NumberBetweenOtherTwo{
	public static void main(String args[]){

		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		a = sc.nextInt();
		System.out.println("Enter Second Number :");
		b = sc.nextInt();
		System.out.println("Enter Third Number :");
		c = sc.nextInt();
		if((a>b && a<c) || (a<b && a>c))
			System.out.println("First Number("+a+") Is Between Second("+b+") & Third("+c+")");
		else
			System.out.println("First Number("+a+") Is Not In Between Second("+b+") & Third("+c+")");
	}
}



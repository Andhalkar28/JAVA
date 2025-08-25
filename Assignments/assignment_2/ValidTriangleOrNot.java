//10. Accept three sides of triangle as input, and print whether the triangle is valid or not.
import java.util.Scanner;
public class ValidTriangleOrNot{
	public static void main(String args[]){

		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Side Of Triangle :");
		a = sc.nextFloat();
		System.out.println("Enter Second Side Of Triangle : :");
		b = sc.nextFloat();
		System.out.println("Enter Third Side Of Triangle :");
		c = sc.nextFloat();
		if((a+b>c) && (a+c>b) && (c+b>a))
			System.out.println("Triangle Is VSalid ");
		else
			System.out.println("Triangle Is Not Valid ");
	}
}


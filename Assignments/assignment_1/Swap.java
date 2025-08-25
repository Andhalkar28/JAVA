//7. Accept two integers from the user and interchange them. Display the interchanged numbers. Using temporary variable Without using temporary variable 
import java.util.Scanner;
public class Swap{
	public static void main(String args[]){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		a=sc.nextInt();
		System.out.println("Enter Second Number:");
		b=sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
	



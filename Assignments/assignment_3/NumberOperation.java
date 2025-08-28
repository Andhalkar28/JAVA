/*3. Accept two numbers in variables x and y from the user and perform the following operations*/
import java.util.Scanner;
public class NumberOperation{
public static void main(String args[]){
	int a,b,c,ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number :");
	a = sc.nextInt();
	System.out.println("Enter Second Number :");
	b = sc.nextInt();

	System.out.println("""
			1.Equality
			2.Less Than
			3.Quotient And Remainder
			4.Range
			5.Swap
			Enter Your Choice :
		""");
	ch = sc.nextInt();
	switch(ch){
		case 1->{
			if(a == b)
				System.out.println("Both Are Equal !!");
			else
				System.out.println("Both Are Not Equal !!");
		}

		case 2->{
			if(a < b)
				System.out.println("First Num Is Less Than Second !!");
			else
				System.out.println("Second Num Is Less Than First !!");
		}

		case 3->{
			System.out.println("Quotient Is : "+(a/b));
			System.out.println("Remainer Is : "+(a % b));
		}
		
		case 4->{
			System.out.println("Enter A Num :");
			c = sc.nextInt();
			if((c>a && c<b) || (c<a && c>b))
				System.out.println("Third Num Lies In Between First And Second ");
			else
				System.out.println("Third Num Does Not Lies In Between First And Second ");
		}

		case 5->{
			int temp = a;
			a = b;
			b= temp;
			System.out.println("Swaped Values : "+a+" "+b);
		}

		default -> System.out.println("INVALID Choice !!! ");
		}
	}
}




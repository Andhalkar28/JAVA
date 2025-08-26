/*2. Write a program, which accepts two integers and an operator as a character (+ - * /), performs the corresponding operation and displays the result.*/
import java.util.Scanner;
public class DisplayResult{
	public static void main(String args[]){
		int a,b;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		a = sc.nextInt();
		System.out.println("Enter Second Number:");
		b = sc.nextInt();
		System.out.println("Enter Operand:");
		op = sc.next().charAt(0);

		switch(op){
			case '+'->System.out.println("Addition :"+(a+b));
			case '-'->System.out.println("Addition :"+(a-b));
			case '*'->System.out.println("Addition :"+(a*b));
			case '/'->System.out.println("Addition :"+(a/b));
			default->System.out.println("Wrong Operand !!!");
		}
	}
}


/*20. Write a program to check whether given character is a digit or a character in lowercase or uppercase alphabet. (Hint ASCII value of digit is between 48 to 58 and Lowercase characters have ASCII values in the range of 97 to122,uppercase is  between 65 and 90)*/
import java.util.Scanner;
public class CharCheck{
	public static void main(String args[]){

		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Character :");
		ch = sc.next().charAt(0);
		
		if(ch>=48 && ch<=57)
			System.out.println("Character Is A Digit");
		else if(ch>=65 && ch<=90)
			System.out.println("Character Is An UpperCase Alphabate");
		else if(ch>=97 && ch<=122)
			System.out.println("Character Is An LowerCase Alphabate");
		else
			System.out.println("Enter Valid Data !!!");
	}
}
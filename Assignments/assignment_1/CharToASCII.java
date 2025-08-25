//13. Accept a character from the user and display its ASCII value. 
import java.util.Scanner;
public class CharToASCII{
	public static void main(String args[]){
		char ch;
		int ascii;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Character :");
		ch = sc.next().charAt(0);
		ascii = (int)ch;
		System.out.println("ASCII Value Of '"+ ch +"'Is :" +ascii);
	}
}

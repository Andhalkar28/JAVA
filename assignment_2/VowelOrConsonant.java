//8. Accept a lowercase character from the user and check whether the character is a vowel or consonant
import java.util.Scanner;
public class VowelOrConsonant{
	public static void main(String args[]){

		char a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter LowerCase Character:");
		a = sc.next().charAt(0);
		if(a=='a' || a=='e' ||a=='i' ||a=='o' ||a=='u')
			System.out.println("Given Character Is A Vowel !!");
		else
			System.out.println("Given Character Is A Consonant !!");
	}
}
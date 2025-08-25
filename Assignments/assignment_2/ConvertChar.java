/*19. Write a Program to convert lowercase letter into uppercase letter and vice versa. */
import java.util.Scanner;
public class ConvertChar{
	public static void main(String args[]){

		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Character :");
		ch = sc.next().charAt(0);

		if(Character.isLowerCase(ch)){
			ch = Character.toUpperCase(ch);
			System.out.println("Character Is In UpperCase :"+ch);
		}
			
		else if(Character.isUpperCase(ch)){
			ch = Character.toLowerCase(ch);
			System.out.println("Character Is In LowerCase :"+ch);
		}
		else
                     	System.out.println("It Is Not An Alphabate Character");
	}
}



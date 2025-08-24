//12. Accept a character from the keyboard and display its previous and next character in order. 
import java.util.Scanner;
public class CharacterInOrder{
	public static void main(String args[]){
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Character :");
		ch=sc.next().charAt(0);
		char charprev = (char)(ch - 1);
		char charnext = (char)(ch + 1);
		System.out.println("Previous Character :"+charprev);
		System.out.println("Next Character :"+charnext);
	}
}


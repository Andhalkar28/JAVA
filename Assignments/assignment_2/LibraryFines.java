/*18. A library charges a fine for every book returned late. Accept the number of days the member is late, compute and print the fine as follows:(less than five days Rs fine, for 6 to 10 days Rs. Fine and above 10 days Rs. fine ) */
import java.util.Scanner;
public class LibraryFines{
	public static void main(String args[]){

		int days,fine=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How Late Youre Submitting The Book ? ");
		days = sc.nextInt();

		if(days<=5 && days>0)
			fine = 10;
		else if(days>5 && days<=10)
			fine = 15;
		else if(days>10)
			fine = 20;
		else
			System.out.println("You Dont Need To Pay Fine For Book  ");
		System.out.println("For "+days+" You Have To Pay "+fine+"Rs Fine");
	}
}

//9. A cashier has currency notes of denomination 1, 5 and 10. Accept the amount to be withdrawn from the user and print the total number of currency notes of each denomination the cashier will have to give.
import java.util.Scanner;
public class CashierCurrency{
	public static void main(String args[]){
		int amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount To Withdraw :");
		amt=sc.nextInt();
		System.out.println("$10 Currency:"+amt/10);
		amt = amt%10;
		System.out.println("$5 rs Currency:"+amt/5);
		amt = amt%5;
		System.out.println("$1 rs Currency:"+amt/1);
		amt = amt%1;
	}
}
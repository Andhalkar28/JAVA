/*17. Write a program to accept quantity and rate for three items, compute the  total sales amount, Also compute and print the discount as follows: (amount > – 20% discount, amount between to – 15% discount, amount between – to -- 8 %  discount)*/
import java.util.Scanner;
public class DiscountOnItem{
	public static void main(String args[]){

		int amount,discount,i1,i2,i3,q1,q2,q3;
		double discountAmt,finalAmt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item Amount :");
		i1 = sc.nextInt();
  		System.out.println("Enter Quantity :");
		q1 = sc.nextInt();
		System.out.println("Enter Item Amount :");
		i2 = sc.nextInt();
  		System.out.println("Enter Quantity :");
		q2 = sc.nextInt();
		System.out.println("Enter Item Amount :");
		i3 = sc.nextInt();
  		System.out.println("Enter Quantity :");
		q3 = sc.nextInt();

		amount=(i1*q1) + (i2*q2) + (i3*q3);
		if(amount<=10000)
			discount = 8;
		else if(amount <=25000)
			discount = 15;
		else
			discount = 20;
  		discountAmt = (discount * amount) / 100;
		finalAmt = amount - discountAmt;
		System.out.println("Total Amount    :"+amount);
		System.out.println("Discount Amount :"+discountAmt);
		System.out.println("Final Amount    :"+finalAmt);
	}
}
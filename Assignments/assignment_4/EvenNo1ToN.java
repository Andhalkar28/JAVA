//13. Write a program to print even numbers from 1 to N (or numbers) 

import java.util.Scanner;
public class EvenNo1ToN{
public static void main (String args[]){
	int i,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number : ");
	n=sc.nextInt();
	if(n<1)
		System.out.println("number must be Greater than 1 !!! ");
	System.out.println("Even Num :");

	for(i=1;i<=n;i++){	  
		if(i%2==0)
			System.out.println(i);
	}
	}
}
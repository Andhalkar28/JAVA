/*11.Write a program to print even numbers from 1 to 10 (or odd numbers) 
12.Write a program to print even numbers from 100 to 150 (or numbers) */

public class EvenNo1To150{
public static void main (String args[]){
	int i;
	System.out.println("Even Num :");

	for(i=1;i<=150;i++){	  
		if(i%2==0)
			System.out.println(i);
	}
	}
}
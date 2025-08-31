//30.31.32. Write a program to print, count and sum of factors 

import java.util.Scanner;
public class FactorOfNum{
public static void main(String args[]){
	int n,i,count = 0,sum = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Num :");
	n=sc.nextInt();

	System.out.println("Factors of " + n + " are:");
        for(i = 1; i <= n; i++){
            if (n % i == 0) {
                System.out.println(i);
                count++;        
                sum += i; 
            }
        }

        System.out.println("Total number of factors: " + count);
        System.out.println("Sum of factors: " + sum);
	}
}
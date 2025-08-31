/* 7. Write a program to find sum of 1 to 5 (sum of first 5 numbers) 
   8. Write a program to find sum of 100 to 150 */

public class SumOf1To150{
public static void main(String[] args){
	int sum=0,i,j;
	for(i=1;i<=5;i++)
		sum+=i;
	System.out.println("Sum of 1 to 5 is : "+sum);

	for(j=100;j<=155;j++)
		sum+=j;
	System.out.println("Sum of 1 to 5 is : "+sum);
 }
}
//6. Write a program to print x to y (both inclusive)
import java.util.Scanner;
public class PrintXToY{
public static void main(String[] args){
	int i,x,y;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Starting Num :");
	x = sc.nextInt();
	System.out.println("Enter Ending Num :");
	y = sc.nextInt();

	if(y<x)
		System.out.println("Starting Num Must Be Greater Than Ending Num !!!");

	for(i=x;i<y;i++)
		System.out.println(i);
	}
}
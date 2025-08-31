//5. Write a program to print 1 to N
import java.util.Scanner;
public class Print1ToN{
public static void main(String[] args){
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A Num :");
	n = sc.nextInt();
	for(int i=0;i<n;i++)
		System.out.println(i);
	}
}

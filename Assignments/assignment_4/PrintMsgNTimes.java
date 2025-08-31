//2. Write a program to print hello N times
import java.util.Scanner;
public class PrintMsgNTimes{
public static void main(String[] args){
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("How Many Times You Want To Print Hello ? Enter A Num :");
	n = sc.nextInt();
	for(int i=0;i<n;i++)
		System.out.println("Hello");
	}
}

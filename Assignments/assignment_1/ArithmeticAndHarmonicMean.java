 //5. Accept two numbers and print arithmetic and harmonic mean of the two numbers.
import java.util.Scanner;
public class ArithmeticAndHarmonicMean{
	public static void main (String args[]){
		float n1,n2,am,hm;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		am=(n1+n2)/2;
		hm=(2*n1*n2)/(n1+n2);
		System.out.println("Arethematic Mean Is :"+am);
		System.out.println("Harmonic Mean Is :"+hm);
	}
}




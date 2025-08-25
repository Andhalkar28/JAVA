//4. Accept initial velocity (u), acceleration (a) and time (t). Print the final velocity (v) and the distance (s) travelled.
import java.util.Scanner;
public class VelocityAndDistance{
	public static void main (String args[]){
		float u,a,t;
		double v,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Initial Velocity :");
		u=sc.nextFloat();
		System.out.println("Enter Acceleration :");
		a=sc.nextFloat();
		System.out.println("Enter Time :");
		t=sc.nextFloat();
		v = u + (a*t);
		s = (u * t) + (0.5 * a * t * t); 
		System.out.println("Velocity :"+v);
		System.out.println("Distance Travelled :"+s);
	}
}
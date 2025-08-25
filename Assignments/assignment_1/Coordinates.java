//10. Accept the x and y coordinates of two points and compute the distance between the two points.
import java.util.Scanner;
public class Coordinates{
	public static void main(String args[]){
		int x1,x2,y1,y2;
		double distance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Coordinates Of First:");
		System.out.println("x1 Coordinate:");
		x1=sc.nextInt();
		System.out.println("y1 Coordinate:");
		y1=sc.nextInt();
		System.out.println("Enter Coordinates Of Second:");
		System.out.println("x2 Coordinate:");
		x2=sc.nextInt();
		System.out.println("y2 Coordinate:");
		y2=sc.nextInt();
 
		distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		System.out.println("Distance = :"+distance);
	}
}
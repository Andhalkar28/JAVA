/*14. Accept the x and y coordinate of a point and find the quadrant in which the point lies. (2 logics and origin condition) */
import java.util.Scanner;
public class Quadrant{
	public static void main(String args[]){

		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X Coordinate :");
		x = sc.nextInt();
  		System.out.println("Enter Y Coordinate :");
		y = sc.nextInt();
		
		//Logic-I
		if(x==0 && y==0)
			System.out.println("Point Is At Origin ");
		else if(x>0 && y>0)
			System.out.println("Point Lies In First Quadrant ");
		else if(x<0 && y>0)
			System.out.println("Point Lies In Second Quadrant ");
		else if(x<0 && y<0)
			System.out.println("Point Lies In Third Quadrant ");
		else if(x>0 && y<0)
			System.out.println("Point Lies In Fourth Quadrant ");
		else if(x==0)
			System.out.println("Point Lies In Y-Axis ");
		else
			System.out.println("Point Lies In X-Axis ");
		
		//Logic-II

		if(x==0 && y==0){
			System.out.println("Point Is At Origin ");
		}
		else{
			if(x>0){
				if(y>0)
					System.out.println("Point Lies In First Quadrant");
				else if (y<0)
					System.out.println("Point Lies In Fourth Quadrant ");
				else
					System.out.println("Point Lies In X-Axis");
			}
			else if(x<0){
				if(y>0)
					System.out.println("Point Lies In Second Quadrant");
				else if (y<0)
					System.out.println("Point Lies In Third Quadrant ");
				else
					System.out.println("Point Lies In X-Axis");
			}
			else{
				System.out.println("Point Lies In X-Axis ");
			}
		}
	}
}

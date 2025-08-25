//6. Accept three dimensions length (l), breadth(b) and height(h) of a cuboid and print surface area and volume.
import java.util.Scanner;
public class CuboidSurfaceAreaAndVolume{
	public static void main(String args[]){
		float surfaceArea,volume,l,b,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length Of Cuboid :");
		l=sc.nextFloat();
		System.out.println("Enter Breadth Of Cuboid :");
		b=sc.nextFloat();
		System.out.println("Enter Height Of Cuboid :");
		h=sc.nextFloat();
		surfaceArea=2*(l*b + l*h +b*h);
		volume=l*b*h ;
		System.out.println("SurfaceArea Of Cuboid Is :"+surfaceArea);
		System.out.println("Volume Of Cuboid Is :"+volume);
	}
}



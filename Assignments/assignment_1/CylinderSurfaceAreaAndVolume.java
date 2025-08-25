//2. Accept dimensions of a cylinder and print the surface area and volume. 
import java.util.Scanner;
public class CylinderSurfaceAreaAndVolume{
	public static void main(String args[]){
		float r,h;
		double surfaceArea,volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius :");
		r=sc.nextFloat();
		System.out.println("Enter Height :");
		h=sc.nextFloat();
                surfaceArea=(2*Math.PI*r*2)+(2*Math.PI*r*h);
		volume=Math.PI*r*2*h;
		System.out.println("SurfaceArea is :"+surfaceArea);
		System.out.println("Volume is :"+volume);
	}
}





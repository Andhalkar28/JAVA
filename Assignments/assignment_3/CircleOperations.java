/*4. Accept radius from the user and write a program having menu with the following options and corresponding actions */

import java.util.Scanner;
public class CircleOperations{
public static void main(String args[]){

	int ch;
	float r;
	Scanner sc = new Scanner(System.in);
	
	while(true){
	System.out.println("Enter Radius :");
	r = sc.nextFloat();

	System.out.println("""
			1.Area Of Circle
			2.Circumference of Circle
			3.Volume of Sphere 
			4.Exit
			Enter Your Choice :
		""");
	ch = sc.nextInt();
	switch(ch){
		case 1->System.out.println("Area Of Circle : "+(Math.PI * (r * r)));
		case 2->System.out.println("Circumference of Circle: "+(2 * Math.PI * r));
		case 3->System.out.println("Volume of Sphere  : "+((4.0 / 3)*Math.PI * (r * r * r)));
		case 4->System.exit(0);
		default -> System.out.println("INVALID Choice !!! ");
		}
	}
}
}
/*16. Write a program to accept marks for three subjects and find the total marks secured , average and also display the class obtained. (Class I – above %, class II – % to %, pass class – % to % and fail otherwise)*/

import java.util.Scanner;
public class GradeClass{
	public static void main(String args[]){

		int total,m1,m2,m3;
		double avg,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks Of First Subject :");
		m1 = sc.nextInt();
  		System.out.println("Enter Marks Of Second Subject :");
		m2 = sc.nextInt();
		System.out.println("Enter Marks Of Third Subject :");
		m3 = sc.nextInt();
		total = m1+m2+m3;
		avg = total / 3.0;
		p = (total / 300.0) * 100;
		System.out.println("Total Marks :"+total);
		System.out.println("Average Marks :"+avg);
		if(p>=75)
			System.out.println("Grade : Class-I");
		else if(p>=50)
			System.out.println("Grade : Class-II");
		else if(p>=35)
			System.out.println("Grade : Class-III");
		else
			System.out.println("Grade : FAIL !!!! ");
	}
}

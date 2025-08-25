/*13. Accept the time as hour, minute and seconds and check whether the time is valid. (Hint:0<=hour<24, 0<=minute <60, 0<=second <60) (3 logics) */
import java.util.Scanner;
public class ValidTime{
	public static void main(String args[]){

		int h,m,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hours :");
		h = sc.nextInt();
  		System.out.println("Enter Minutes :");
		m = sc.nextInt();
		System.out.println("Enter Seconds :");
		s = sc.nextInt();

		//Logic-I
		if(h>0 && h<24 && m>0 && m<60 && s>=0 && s<60)
			System.out.println("Valid Time !! ");
		else
			System.out.println("Invalid Time !!!");

		//Logic-II
		if(h>0 && h<24){
			if(m>0 && m<60){
				if(s>=0 && s<60){
					System.out.println("Valid Time !! ");
				}
				else{
					System.out.println("Invalid Seconds !! ");
				}
			}
			else{
				System.out.println("Invalid Minutes !! ");
			}
		}
		else{
			System.out.println("Invalid Hours !! ");
		}


		//Logic-III
		if(h<0 || h>=24)
			System.out.println("Invalid Hours !! ");
		else if (m<0 || m>=60)
			System.out.println("Invalid Minutes !! ");
		else if (s<0 || s>=60)
			System.out.println("Invalid Minutes !! ");
		else 
			System.out.println("Valid Time !! ");
	}
}

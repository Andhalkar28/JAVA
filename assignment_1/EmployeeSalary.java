//8. Accept the employee id and basic salary for an employee and output the take home salary of the employee. 
import java.util.Scanner;
public class EmployeeSalary{
	public static void main(String args[]){
		int id;
		float da,hra,tax,basicSalary,totalSalary;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Details :");
		System.out.println("Id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Name :");
		name=sc.nextLine();
		System.out.println("BasicSalary :");
		basicSalary=sc.nextFloat();
		System.out.println("DA :");
		da=sc.nextFloat();
		System.out.println("HRA :");
		hra=sc.nextFloat();
		System.out.println("TAX :");
		tax=sc.nextFloat();
 
		totalSalary = basicSalary + ((basicSalary*(da + hra - tax))/100);

                System.out.println("\n---Employee Salary Slip---");
		System.out.println("ID          : "+id);
		System.out.println("Name        : "+name);
		System.out.println("TotalSalary :"+totalSalary);
	}
}

	


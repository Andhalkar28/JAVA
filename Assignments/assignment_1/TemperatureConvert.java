// 3.Accept temperatures in Fahrenheit(F) and print it in Celsius(C) and Kelvin (K)
import java.util.Scanner;
public class TemperatureConvert{
	public static void main(String args[]){
		float celcius,fahrenheit;
		double kelvin;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temprature In Fahrenheit Only  :");
		fahrenheit=sc.nextFloat();
		celcius = (5.0f/9.0f)*(fahrenheit-32);
		kelvin = celcius + 273.15;
		System.out.println("Temprature In Celcius :"+celcius);
		System.out.println("Temprature In Kelvin :"+kelvin);
	}
}

 
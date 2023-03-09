package javabegining;
import java.util.Scanner;
public class TemperatureConvertor {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	double cel;
	System.out.println("Temperature in celcius:");
	cel=input.nextDouble();
	double farheinheit=(9*cel/5)+32;
	System.out.println("Celcius to farhenheit:"+farheinheit);
	
}
}

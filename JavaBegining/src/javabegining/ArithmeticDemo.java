package javabegining;
import java.util.Scanner;
public class ArithmeticDemo {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	int num1;
	System.out.println("Enter num1:");
	num1=input.nextInt();
	int num2;
	System.out.print("Enter num2:");
	num2=input.nextInt();
	int sum=num1+num2;
	int difference=num1-num2;
	int multiplication=num1*num2;
	double division=num1/num2;
	System.out.println("Sum:"+sum);
	System.out.println("Difference:"+difference);
	System.out.println("Multiplication:"+multiplication);
	System.out.print("Division:"+division);
	
}
}

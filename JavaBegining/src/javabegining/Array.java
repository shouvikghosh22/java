package javabegining;
import java.util.Scanner;
public class Array {
public static void main (String[]args) {
	Scanner input=new Scanner(System.in);
	double[] number=new double[5];
	System.out.print("Enter 5 numbers: ");
	number[0]=input.nextDouble();
	number[1]=input.nextDouble();
	number[2]=input.nextDouble();
	number[3]=input.nextDouble();
	number[4]=input.nextDouble();
	double sum;
	double average;
	sum=number[0]+number[1]+number[2]+number[3]+number[4];
	System.out.println("Sum is: "+sum);
	average=(number[0]+number[1]+number[2]+number[3]+number[4])/2;
	System.out.println("Average is: "+average);

	
		
	
}
}

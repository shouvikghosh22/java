package javabegining;
import java.util.Scanner;
public class AreaTriangle {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	double radius;
	System.out.println("Enter Radius:");
	radius=input.nextDouble();
	double area;
	area=3.1416*(radius*radius);
	System.out.println("Area: "+area);
}
}

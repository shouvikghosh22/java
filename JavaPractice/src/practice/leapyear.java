package practice;
import java.util.*;
public class leapyear {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a year: ");
	int a= sc.nextInt();
	if((a%4==0) && (a%100!=0) || ( a%400==0) ) {
		System.out.println("The year is a leap year");
	}
	else {
		System.out.println("The year is not a leap year");
	}
}
}

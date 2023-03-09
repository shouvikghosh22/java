package task2;

public class Student extends Address {
private int id;
private String firstName;
private String lastName;
private double cgpa;
Student(int id, String firstName, String lastName, double cgpa,Address){
	this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
	this.cgpa=cgpa;
}
}

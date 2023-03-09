package tasks;

public class Student {
private String id;
private String name;
private String year;
private double cgpa;
Student(String id, String name, String year, double cgpa){
	this.id=id;
	this.name=name;
	this.year=year;
	this.cgpa=cgpa;
	
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public double getCgpa() {
	return cgpa;
}
public void setCgpa(double cgpa) {
	this.cgpa = cgpa;
}
public void resetCgpa() {
	this.cgpa=0.0;
	
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", year=" + year + ", cgpa=" + cgpa + "]";
}
}

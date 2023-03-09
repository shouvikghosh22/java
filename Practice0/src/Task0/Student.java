package Task0;

public class Student {

	private int id;
	private String Name;
	private String year;
	private double cgpa;
	Student(){
		id=0;
		Name=" ";
		year=" ";
		cgpa=0.0;
		
	}
	public Student(int id, String name, String year, double cgpa) {
		
		this.id = id;
		this.Name = name;
		this.year = year;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
		cgpa=0.0;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", year=" + year + ", cgpa=" + cgpa + "]";
	}
	
}

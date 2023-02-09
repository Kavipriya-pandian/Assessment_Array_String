package DXC;

public class Teacher 
{
	private String teacherName;
	private String Subject;
	private double salary;
	public Teacher(String teacherName, String subject, double salary) {
	
		this.teacherName = teacherName;
		Subject = subject;
		this.salary = salary;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display()
	{
		System.out.println("Name : "+getTeacherName()+", Subject : "+getSubject()+", Salary : "+getSalary());
	}
	

}

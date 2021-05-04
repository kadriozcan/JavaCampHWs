package oopTask2;

public class Student extends User {
	
	private String studentDepartment;
	private String[] courses;
	private String firstName;
	private String lastName;
	
	

	
	public Student() {

	}

	public Student(String studentDepartment, String firstName, String lastName, int id, String password, String eMail) {
		super(id, password, eMail);
		this.studentDepartment = studentDepartment;
		this.firstName = firstName;
		this.lastName = lastName;
	}






	public String getStudentDepartment() {
		return studentDepartment;
	}




	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}




	public String[] getCourses() {
		return courses;
	}




	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	

	

}

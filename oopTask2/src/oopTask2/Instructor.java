package oopTask2;

public class Instructor extends User {

	private String instructorAdress;
	private String firstName;
	private String lastName;
	
	public Instructor() {
		
	}




	public Instructor(String instructorAdress, String firstName, String lastName, int id, String password, String eMail) {
		super(id, password, eMail);
		this.instructorAdress = instructorAdress;
		this.firstName = firstName;
		this.lastName = lastName;
	}




	public String getInstructorAdress() {
		return instructorAdress;
	}

	public void setInstructorAdress(String instructorAdress) {
		this.instructorAdress = instructorAdress;
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

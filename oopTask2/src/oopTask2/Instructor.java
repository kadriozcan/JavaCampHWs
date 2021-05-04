package oopTask2;

public class Instructor extends User {

	private String instructorAdress;
	
	public Instructor() {
		
	}

	public Instructor(String instructorAdress, String firstName, String lastName, String id, String password, String eMail ) {
		super(firstName, lastName, id, password, eMail);
		this.instructorAdress = instructorAdress;
		
	}

	public String getInstructorCode() {
		return "INST" + getFirstName() + getLastName();
	}

	public String getInstructorAdress() {
		return instructorAdress;
	}

	public void setInstructorAdress(String instructorAdress) {
		this.instructorAdress = instructorAdress;
	}




	

}

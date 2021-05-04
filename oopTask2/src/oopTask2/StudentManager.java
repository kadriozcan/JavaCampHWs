package oopTask2;

public class StudentManager extends UserManager {
	
	
	@Override
	public void comment(String text) {
		System.out.println("Student Comment: " + text);
	}
	
	
	public void enrolOn(String course) {
		System.out.println(course + " kursuna kayit oldunuz");
	}
	


}

package oopTask2;

public class InstructorManager extends UserManager {
	
	
	@Override
	public void comment(String text) {
		System.out.println("Instructor Comment: " + text);
	}
	
	public void publishLesson(String lesson) {
		System.out.println(lesson + " dersiniz yayinlandi.");
	}
	
	

	
	
	
}

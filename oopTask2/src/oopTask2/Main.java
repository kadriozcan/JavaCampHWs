package oopTask2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("department1", "ali", "ozcan", 5, "asdfasd", "kasdfas@gmail.com");
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("ahmet");
		instructor1.setLastName("mehmet");
		instructor1.seteMail("ahmet@gmail.com");
		instructor1.setPassword("9dd89dsf");
		instructor1.setId(15);
		
		
		System.out.println(student1.getStudentDepartment());
		
		System.out.println("----------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.comment("ders guzelmis");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.comment("dersi iyi izleyin");
		System.out.println("--------------");
		instructorManager.publishLesson("java oop ders 2");
		
		
		
		
		
		
		

	}

}

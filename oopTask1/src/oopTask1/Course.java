package oopTask1;

public class Course {

	// bos constructor
	public Course() {

	}

	// parametreleri kullanarak hizlica obje olusturmak icin dolu constructor
	public Course(int id, String name, String instructor, int completionPercentage) {
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.completionPercentage = completionPercentage;
	}

	int id;
	String name;
	String instructor;
	int completionPercentage;

}

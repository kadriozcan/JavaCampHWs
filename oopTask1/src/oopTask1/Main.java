package oopTask1;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "C# and Angular course", "Engin Demirog", 75);
		Course course2 = new Course(2, "Java and React course", "Engin Demirog", 30);

		Category category1 = new Category(1, "Kurslarim", false);
		Category category2 = new Category(2, "Tum Kurslar", false);

		Course[] courses = { course1, course2 };
		Category[] categories = { category1, category2 };
		
		for (int i=1; i<=courses.length; i++) {
			System.out.println("Kurs " + String.valueOf(i)+ ": " + courses[i-1].name);
		}
		
		System.out.println("-----------------------");
		
		
		for (int j=1; j<=categories.length; j++) {
			System.out.println("Kategori " + String.valueOf(j)+ ": " + categories[j-1].name);
		}
		
		
		System.out.println("-----------------------");
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.comment("'github.com/kadriozcan'");
		courseManager.addImageToYourComment("Profil Fotografim");
		
		

	}

}

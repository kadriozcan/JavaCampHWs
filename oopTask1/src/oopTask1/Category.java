package oopTask1;

public class Category {

	public Category() {

	}

	public Category(int id, String name, boolean hasSubCategory) {
		this.id = id;
		this.name = name;
		this.hasSubCategory = hasSubCategory;
	}

	int id;
	String name;
	boolean hasSubCategory;
}

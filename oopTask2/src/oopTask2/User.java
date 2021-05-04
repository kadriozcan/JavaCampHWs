package oopTask2;

public class User {
	
	
	private int id;
	private String password;
	private String eMail;

	
	
	public User() {
		
	}

	

	



	public User(int id, String password, String eMail) {
		super();
		this.id = id;
		this.password = password;
		this.eMail = eMail;
	}







	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}







	public int getId() {
		return id;
	}







	public void setId(int id) {
		this.id = id;
	}

	
	
	
	
	
	
	
}

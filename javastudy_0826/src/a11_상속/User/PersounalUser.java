package a11_상속.User;

public class PersounalUser extends User{
	private String name;
	private String phone;
	
	public PersounalUser() {
		// TODO Auto-generated constructor stub
	}
	
	public PersounalUser(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	

}

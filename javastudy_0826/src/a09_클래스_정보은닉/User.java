package a09_클래스_정보은닉;
	/**
	 * 
	 * username(id)
	 * password(ps)
	 * name(이름)
	 * email(이메일)
	 * 
	 *
	 */
public class User {
	
	private String username;
	private String password;
	private String name;
	private String email;
	
	///////////////////////////////// ↑ 필드, ↓ 메소드 ///////////////////////////
	// 정보 하나만 담고 주고받는 객체 = bean, Entity
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUsername() {
		return username;
	}
	
	public User(String username, String password, String name, String email) { // 생성자 오버로딩 ctrl + shift + alt -> constructor using field  // 그래서 기본생성자도 만들어줘야함
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

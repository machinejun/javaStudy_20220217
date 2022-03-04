package a11_상속.User;

// 부모
/* User = 
 * username 
 * password
 * email
 * 
 * 메소드 : 
 * boolean = login(아이디, 비밀번호)  -> return 
 * 자기자신의 아이디와 매개변수의 아이디가 같은지
 * 그리고 자신의 비밀번화 매개변수의 비밀번호가 같은지
 * 둘다 같은면 true 를 리턴
 * ---------------------------------------------------------------
 * 
 * company class
 * companyName
 * companyAddress
 * companyTel
 * 
 * personalUser class
 * name
 * phone
 */

public class User {
	private String userName;
	private String passWord;
	private String email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, String passWord, String email) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean login(String userName, String passWord) {
		if(userName.equals(this.userName) && passWord.equals(this.passWord)) {
			return true;	
		}else {
			return false;
		}
		
	}
	
	
	

}

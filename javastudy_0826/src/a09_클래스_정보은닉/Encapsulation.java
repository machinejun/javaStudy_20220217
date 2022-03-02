package a09_클래스_정보은닉;

public class Encapsulation {
	private String username;  //아이디
	private String password;  //비밀번호
	private String provider;  //서비스 회사  // google, kakao, naver
	
	public Encapsulation( String password, String provider) {
		super();
		this.username = username;
		this.password = password;
		this.provider = provider;
		
	}
	
	public void setUsername(String username) {   //문자열 비교 > equals("문자열")
		if(provider.equals("kakao")) {
			this.username = username + "@kakao.com";
		}else if(provider.equals("google")) {
			this.username = username +"@gmail.com";
		}else if(provider.equals("naver")){
			this.username = username +"@maver.com";
		}else {
			this.username = username;
		}
	
	}
	
	
	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	
	public void showInfo() {
		System.out.println(username);
		System.out.println(password);
		System.out.println(provider);
		
	}
	
	

}

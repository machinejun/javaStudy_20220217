package a09_클래스_정보은닉;

/**
 *  변수 = private
 *  변수는 외부에서 get, set을 사용해서 접근 
 *  변수 가져올려면 get
 *  변수 편집 set
 */

public class Encapsulation {
	private String username;  //아이디
	private String password;  //비밀번호
	private String provider;  //서비스 회사  // google, kakao, naver
	
	public Encapsulation( String password, String provider) {
		super();
//		this.username = username;
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
	


	public String getUsername() {
		return username;
	}
	
	/*  getter( public ) 
	 * 
	 */
	
	
	
	public void showInfo() {
		System.out.println(username);
		System.out.println(password);
		System.out.println(provider);
		
	}

	public String getPassword() { // 변수명을 따서 가지고 온다. 해당변수의 자료형과 동일해야한다.
		return password;
	}

	public void setPassword(String password) { // 매개변수와 변수의 자료형이 일치해야한다.
		this.password = password;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	

}

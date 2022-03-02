package 연습;

public class LoginProgram {
	private String id;
	private String password;
	private String provider;
	private String imformation;
	private String etc;

	//1. 아이디, 비밀번호, 제공업체, 정보
	
	
	public String page( ) {
		return etc;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getProvider() {
		return provider;
	}

	public String getImformation() {
		return imformation;
	}

	public String getEtc() {
		return etc;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public void setImformation(String imformation) {
		this.imformation = imformation;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	public String login(String id, String password) {
		if(id.equals(id) && password.equals(password)) {
			if(provider.equals("naver")) {
				this.imformation = id + "@naver.com";
				System.out.println(imformation);
				System.out.println(etc);
			}else if(provider.equals("google")) {
				this.imformation = id + "@google.com";
				System.out.println(imformation);
				System.out.println(etc);
			}else {
				this.imformation = id;
			}
		}else {
			System.out.println("Error");
		}
		return imformation;
	}
	

}

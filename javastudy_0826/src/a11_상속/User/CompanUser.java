package a11_상속.User;
/*
 * 
 * 
 */

public class CompanUser extends User{
	private String companyName;
	private String companyAddress;
	private String companyTel;
	
	public CompanUser() {
		// TODO Auto-generated constructor stub
	}
	
	public CompanUser(String companyName, String companyAddress, String companyTel) {
		super();
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyTel = companyTel;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyTel() {
		return companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}
	
	
	
	

}

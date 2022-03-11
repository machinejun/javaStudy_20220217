package a12_상속2;

public class ElectronicCompany extends Company{
	
	public ElectronicCompany() {
		// TODO Auto-generated constructor stub
	}
	
	public ElectronicCompany(String companyName) {
		super(companyName + "전자");// ODO Auto-generated constructor stub
	}
	
	public void addFactory() {
		System.out.println(super.getCompanyName() + "공장을 추가합니다.");
	}
	
	@Override
	public void setCompanyName(String companyName) {
		// TODO Auto-generated method stub
		super.setCompanyName(companyName + "전자");
	}
}

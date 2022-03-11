package a12_상속2;

public class DeliveryCompany extends Company{
	private String companyType;
	
	public DeliveryCompany() {
		// TODO Auto-generated constructor stub
	}
	
	public DeliveryCompany(String companyName, String companyType) {
		super(companyName + "배달 대행업체");
		this.companyType = companyType;
	}
	
	public void addMotocycle() {
		System.out.println(super.getCompanyName() + "배달용 오토바이를 추가합니다.");
	}
	
	@Override
	public void showCompanyInfo() {
		// TODO Auto-generated method stub
		super.showCompanyInfo();
		System.out.println("companyType: " + companyType );

	}
	
	@Override
	public void setCompanyName(String companyName) {
		// TODO Auto-generated method stub
		super.setCompanyName(companyName + "배달대행없체");
	}
	
	

}

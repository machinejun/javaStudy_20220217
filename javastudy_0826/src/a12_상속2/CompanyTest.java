package a12_상속2;

public class CompanyTest {

	public static void main(String[] args) {
		
		ElectronicCompany samsung = new ElectronicCompany("삼성");
		ElectronicCompany lg = new ElectronicCompany("LG");
		DeliveryCompany baemin = new DeliveryCompany("배달의 민족", "배달");
		DeliveryCompany yogiyo = new DeliveryCompany("요기요", "배달");
		
		samsung.setCompanyName("삼숭");
		
		Company samsung_company = samsung; // 업캐스팅
		Company lg_company = lg;
		Company baemin_company = baemin;
		Company yogiyo_company = yogiyo;
		
		samsung_company.setCompanyName("삼성");
		
		
		samsung.showCompanyInfo();;
		lg.showCompanyInfo();
		baemin.showCompanyInfo();
		yogiyo.showCompanyInfo();  // 값을 대입 1. 생성자, 2. 게터 세터(객체가 생성되있어야함)
		
		samsung.addFactory();
		lg.addFactory();
		baemin.addMotocycle();
		yogiyo.addMotocycle();
		
		samsung_company.showCompanyInfo();
		ElectronicCompany down_samsung_company = (ElectronicCompany)samsung_company;
		down_samsung_company.addFactory();
		
		Company c = new Company();
		c.setCompanyName("삼성");
		c.showCompanyInfo();
		
		
		((ElectronicCompany)samsung_company).addFactory();
	}

}

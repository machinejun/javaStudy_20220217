package a11_상속.가전제품;

public class TV extends HomeAppliances{
	private String proudctName;
	private String productType;
	private String reception;
	
	public TV() {
		// TODO Auto-generated constructor stub
	}
	
	public TV(int appliancesCode, String makename, String dateProduction, String proudctName, String productType, String reception) {
		super(appliancesCode, makename, dateProduction);
		this.proudctName = proudctName;
		this.productType = productType;
		this.reception = reception;
	}

	public String getProudctName() {
		return proudctName;
	}

	public void setProudctName(String proudctName) {
		this.proudctName = proudctName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getReception() {
		return reception;
	}

	public void setReception(String reception) {
		this.reception = reception;
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("제품명: " + this.proudctName);
		if(this.productType.equals("LED")) {
			System.out.println("이 제품은 LED 패널을  사용합니다.");
		}
		
	}
	
	

}

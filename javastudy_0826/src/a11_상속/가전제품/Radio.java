package a11_상속.가전제품;

public class Radio extends HomeAppliances {
	private String proudctName;
	private String productType;
	private String reception;
	
	
	public Radio(int appliancesCode, String makename, String dateProduction, String proudctName, String productType, String reception) {
		super(appliancesCode, makename, dateProduction);
		this.proudctName = proudctName;
		this.productType = productType;
		this.reception = reception;
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("제품명: " + this.proudctName);
		System.out.println("제조일: " + this.productType);
		if(this.reception.equals("FM")) {
			System.out.println("이 라디오의 수신타입은 FM입니다.");
		}else if(this.reception.equals("AM")) {
			System.out.println("이 라디오의 수신타입은 AM입니다.");
		}else {
			System.out.println("이 라디오는 모든 타입의 전파를 수신합니다.");
		}
		
	}
	
	public void radiodiscount() {
		System.out.println("이 제품은 10% 할인상품 입니다. ");
	}

}

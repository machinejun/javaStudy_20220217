package a09_클래스;

public class Tumbler extends Product{
	private String cap; // 버튼식, 오픈식

	public Tumbler(int productCode, String productName , String cap) {
		super(productCode, productName); // 자식이 만들때 부모의 변수에 값을 넣어줄 수 있음
		this.cap = cap;
	}
	
	public void showTumblerInfo() {
		super.showProduct();
		
	}
	
	@Override
	public void showProduct() {
		// TODO Auto-generated method stub
		super.showProduct();
		System.out.println("뚜껑 타입" + cap);
	}
	

}

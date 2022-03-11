package a09_클래스;

public class MugCup extends Product{
	public boolean handel;

	public MugCup(int productCode, String productName, boolean handel) {
		super(productCode, productName);
		this.handel = handel;
	}
	
	  @Override
	public void showProduct() {
		// TODO Auto-generated method stub
		super.showProduct();
		System.out.println("손잡이(유/무): " +( handel ? "있음": "없음"));
	}
	  
}

package a09_클래스;

public class PhoneTest {
	
	/*
	 * addPhone(int type, String model, int color);
	 * return은 객체를 리턴
	 * 
	 */
	
	public static Phone addPhone(int type, String model, int color) {
		Phone phone = new Phone();
		phone.setPhoneColor(color);
		phone.setPhoneModel(model);
		phone.setPhoneType(type);
		return phone;
	  // 비어있는 주소만 리턴
	}
	
	public static void main(String[] args) {
		
		Phone p2 = new Phone(3, "아이폰", 1);
		
		Phone p1 = addPhone(1,"고아라폰",2);
		p1.powerOn();
		p1.powerOff();
		p1.showInfo();
		
		Tumbler tumbler = new Tumbler( 200, "스타벅스 텀블러", "오픈식");
		MugCup cup = new MugCup(3000, "스타벅스 머그컵", true);
		
		System.out.println();
		tumbler.showProduct(); // 자식객체가 오버라이드 한것 그대로 출력한다.
		cup.showProduct();
		
		Product[] products = new Product[2];
		products[0] = tumbler;
		products[1] = cup;
		
		for(int i =0 ; i < products.length ; i++) {
			System.out.println("@@@@@@");
			products[i].showProduct();
			if(products[i] instanceof Tumbler) {
				Tumbler tumbler2 = (Tumbler)products[i];

			}else {
				MugCup cu2 = (MugCup)products[i];
 
			}
		}
		
		
		

	}

}

package a09_클래스;

public class productTest {
	public static void test2(Product pp) {
		pp.showProduct();
	}
	
	
/*
 * 클래스
 * 속성(변수)
 * 기능
 * 
 * 자동차(틀) - 객체 -> 생성 : 인스턴스 힙메모리영역에 주소를 할당
 * 속성(변수)
 * 차종
 * 차량 색상
 * 
 * 기능(메소드)
 * 앞으로간다.
 * 뒤로간다.
 * 기름을 넣는다. 
 * 미디어(소리)를 켠다. 끈다.
 * 
 * 프래그래밍 적인 사고
 * 클래스를 정의(참조 자료형(데이트를 담을 수 있는 그릇의 크기)을 정의)
 * 정의도니 클래스를 생성
 * 생성시에 
 * 생성 : 인스턴스 힙메모리영역에 주소를 할당
 */
	public static Product test( ) {
		Product product = new Product(); // product에 생성된 힙메모리 주소
		product.showProduct();
		product.setProductCode(20220307);
		product.setProductName("모니터1");
		return product;
		
	}
	
	public static void main(String[] args) {
		Product p = test();
		test2(p);
	}
}

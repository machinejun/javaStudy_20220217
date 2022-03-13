package a16_스태틱;

/**
 * 싱글톤(singleton) 디지인패턴
 * 디자인패턴: "이 상황에서는 이 방법을 쓰자" 와 같은 효율적인 코드를 만들기 위한 방법론 ★알아봐야함
 * 1. 생성
 * 2. 구조
 * 3. 행위
 * 
 * 종류 :
 *  싱글톤:
 *  클래스의 인스턴스가 하나임을 보장(생성이 한번만 되어야함)하고 접근할 수 있는 전역적인(스태틱) 접근점(해당 객체 -> 리턴할수 있게 만들어주는 스태틱 메소드 하나 제공)을 제공하는 패턴으로, 
 *  디자인 패턴의 가장 많이 알려진 패턴이다.
 *  하나만 만들어서 전체 공유하겠따.
 *  
 *  1. 클래스 내부에서 자기 자신을 생성하여 private 인스턴스로 변수에 대입한다.
 *  2. 생성자의 접근지정자가 private이다. -> 자기자신안에서만 접근 가능
 *  3. 생성된 인스턴스를 반환해줄 수 있는 스태틱 메소드가 존재해야한다.
 */


public class Singleton {

	public static void main(String[] args) {
//		KIA kia = new KIA(); 생성 불가
		KIA factory1 = KIA.getInstance();
		KIA factory2 = KIA.getInstance();
		KIA factory3 = KIA.getInstance();
		KIA factory4 = KIA.getInstance();
		
		Car[] cars = new Car[4];
		
		cars[0]= factory1.createCar("k5");
		cars[1]= factory1.createCar("k7");
		cars[2]= factory1.createCar("k8");
		cars[3]= factory1.createCar("k9");
		
		for(int i =0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		

	}

}

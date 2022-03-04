package a11_상속;

public class AnimalTest {

	public static void main(String[] args) {
		Human human = new Human();
		Eagle eagle = new Eagle();
		Tiger tiger = new Tiger();
		
		human.move();
		eagle.move();
		tiger.move();
		
		//////////////////// -- 업캐스팅 전
		human.readBooks();
		eagle.flying();
		tiger.hunting();
		
		////////////////////////////////////
		//////////////////// -- 업캐스팅 후
		
		Animal ah = human;  // Animal 참조자료형
		Animal ae = eagle;
		Animal at = tiger;
		
		ah.move();
		ae.move();
		at.move();
		
		// ah.readBooks(); 업캐스팅 후에는 부모의 형태이기에 자식의 메서드를 사용할 수 없다.
		
		Human hh = (Human)ah; // 휴먼 다시 다운 캐스팅 , 자신의 형태로만 되돌아감
		hh.readBooks();
		Eagle ee= (Eagle)ae;
		ee.flying();
		Tiger tt = (Tiger)at;
		tt.hunting();
		
		Animal[] animals = new Animal[3];
		animals[0] = human;
		animals[1] = eagle;
		animals[2] = tiger;
		
		for( int i =0; i < animals.length; i++) {
			animals[i].move();
		}
		
		for( int i = 0; i < animals.length; i++) {
			//instanceof(업캐스팅 되기 전의 자료형을 비교)  -> true, false 로 값이 나옴
			if(animals[i] instanceof Human) {
				Human h = (Human)animals[i];
				h.readBooks();
			}else if( animals[i] instanceof Eagle) {
				Eagle e = (Eagle)animals[i];
				e.flying();
			}else if ( animals[i] instanceof Tiger) {
				Tiger t = (Tiger)animals[i];
				t.hunting();
			}
		}
		

	}

}

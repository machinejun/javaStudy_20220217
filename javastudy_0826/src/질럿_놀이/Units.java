package 질럿_놀이;

public class Units {

	private int power;
	private String name;
	private int hp;
	
	public Units(int power, String name, int hp) {
		this.power = power;
		this.name = name;
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}


	public void attack(Units unit) {
		try{
			Thread.sleep(500);
		}catch(Exception e) {
		};
		System.out.println();
		System.out.println( unit.getName() + "을 공격합니다.");
		unit.beAttacked(power);
	}
	
	//내가 공격을 당합니다.
	public void beAttacked(int power) {
		if(hp > 0) {
			this.hp -= power;
		}else {
			System.out.println("사망하였습니다.");
			this.hp = 0;
		}
	}

	public void showInfo() {
		try{
			Thread.sleep(500);
		}catch(Exception e) {
		};
		System.out.println();
		System.out.println("--------------[정보창]----------------");
		System.out.println("이름 : " + name);
		System.out.println("power: " + power);
		System.out.println(" hp  : " + hp);
		

	}
	
	
}

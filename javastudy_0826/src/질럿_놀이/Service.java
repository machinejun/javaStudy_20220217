package 질럿_놀이;

public class Service {
	
	private static Units[] units;
	
	public Service() {
		units = new Units[4];
		units[1] = new Zealot("질럿1");
		units[2] = new Marine("마린1");
		units[3] = new Zergling("저글링1");
	}
	
	
	public void createUnit(char select) {
		if(select == 'z') {
			units[0] = new Zealot("질럿");
			units[0].showInfo();
		}else if(select == 'm') {
			units[0] = new Marine("마린");
			units[0].showInfo();
		}else if(select == 'l') {
			units[0] = new Zergling("저글링");
			units[0].showInfo();
		}
	}
	
	
	public boolean attackUnit(char select) {
		if(select == 'z') {
			units[0].attack(units[1]);
			if(units[1].getHp() < 1) {
				System.out.println(units[1].getName() + "사망");
				return false;
			}else {
				units[1].showInfo();
				return true;
			}
		}else if(select == 'm') {	
			units[0].attack(units[2]);
			if(units[2].getHp() < 1) {
				System.out.println(units[2].getName() + "사망");
				return false;
			}else {
				units[2].showInfo();
				return true;
			}
		}else if(select == 'l') {
			units[0].attack(units[3]);
			if(units[3].getHp() < 1) {
				System.out.println(units[3].getName() + "사망");
				return false;
			}else {
				units[3].showInfo();
				return true;
			}
		}else {
			return true;
		}
	}

}

package a06_조건;

public class SwitchEx {

	public static void main(String[] args) {
		int select = 4;

		switch (select) { // 해당 case 부터 실행을 시작해라는 함수
		case 1:
			System.out.println("1을 선택하셨습니다.");
		case 2:
			System.out.println("2을 선택하셨습니다.");
		case 3:
			System.out.println("3을 선택하셨습니다.");
		default:
			System.out.println("해당 case는 없습니다."); // default가 맨위로 가면 브레이크가 나올때 까지 함수 실행 >> 따라서 맨 밑에 와야한다.
		}

		String select2 = "김준일";

		switch (select2) { // 문자열이면 문자열이 있어야 하고 정수면 정수가 있어야 한다.
		case "김준일":
			System.out.println("선택하신 이름은 김준일입니다.");
			break;
		case "김준이":
			System.out.println("선택하신 이름은 김준이입니다.");
			break;
		}

		int num = 0;
		
		switch (num == 0 ? 2 : num%2) {
			case 1:
				System.out.println("<홀수>입니다.");
				break;
			case 0:
				System.out.println("<짝수>입니다.");
				break;
			default:
				System.out.println("<0>입니다.");
			}
		}
	}



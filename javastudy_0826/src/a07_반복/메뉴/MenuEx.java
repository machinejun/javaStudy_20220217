package a07_반복.메뉴;

import java.util.Scanner;

public class MenuEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char select = ' ';
		
		while(true) {	                                            //무한 루프 설정
			System.out.println("[회원정보 관리]");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.println();
			
			System.out.print("명령을 선택하세요: ");
			select = sc.next().charAt(0); // charAt : 문자열의 첫번째 index만 입력 받을때 사용(0번째 index를 가지고 오겠다)
			System.out.println("선택값 출력: " + select);
			
			if(select == '1') {
				
			}else if( select == '2') {
				
			}else if( select == '3') {
				
			}else if ( select == 'q') {
				System.out.println("프로그램 종료중.....");
				break;			
			}else {
				System.out.println("해당명령은 선택하실 수 없습니다.");
			}
			System.out.println();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}

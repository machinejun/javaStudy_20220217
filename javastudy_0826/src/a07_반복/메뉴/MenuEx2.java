package a07_반복.메뉴;

import java.util.Scanner;

public class MenuEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char select = ' ';
		boolean flag = true;
		
		while(flag) {	                                            //무한 루프 설정
			System.out.println("[회원정보 관리]");
			System.out.println("1. 학생 주소조회");
			System.out.println("2. 학생 성적조회");
			System.out.println("3. 학생 기본정보 조회");
			System.out.println("q. 프로그램 종료");
			System.out.println();
			
			System.out.print("명령을 선택하세요: ");
			select = sc.next().charAt(0);

			if( select == '1') {
				System.out.println("학생의 주소를 조회합니다.");
			}
			else if( select == '2') {
				System.out.println("학생의 성적을 조회합니다.");			
			}
			else if( select == '3') {
				System.out.println("학생의 기본정보를 조회합니다.");
			}
			else if( select == 'q') {
				System.out.println("프로그램 종료중 .....");
				flag = false;
			}else {
				System.out.println("사용하실수 없습니다.");
			}
			System.out.println("----------------------------------------------");
			System.out.println();
		}
		System.out.println("프로그램이 종료되었습니다.");

	}
}
			
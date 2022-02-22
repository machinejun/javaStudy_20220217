package a05_입력;

import java.util.Scanner;

// import 단축기 ctrl + shift + o
// Scanner 자동완성 -> 처음 작성할 때 

public class UserInof {

	public static void main(String[] args) {
		/*
		 * username(아이디)
		 * password(비밀번호)
		 * year(생년)
		 * month(생월)
		 * day(생일)
		 * name(이름)
		 * address(주소) 띄어쓰기 포함
		 * 
		 * Bupper를 사용하기 위해서 :                
		 * 
		 */
		
		Scanner vomit = new Scanner(System.in);
		
		String id = null;
		String ps = null;
		String name = null;
		String address = null;
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.print("ID를 입력하세요: ");
		id = vomit.next();
		System.out.print("PS을 입력해 주세요 : ");
		ps = vomit.next();
		System.out.print("년도를 입력해 주세요 : ");
		year = vomit.nextInt();
		System.out.print("월을 입력해 주세요 : ");
		month = vomit.nextInt();
		System.out.print("일을 입력해 주세요 : ");
		day = vomit.nextInt();
		System.out.print("이름을 입력해 주세요 : ");
		name = vomit.next();
		vomit.nextLine();
		System.out.print("주소을 입력해 주세요 : ");
		address = vomit.nextLine();
		
		
		System.out.println("ID: "+ id);  // 현재줄 아래에 복사:  ctrl + alt + 아래키 | 현재줄 위에 복사 : ctrl + alt + 윗키
		System.out.println("PS: " + ps);
		System.out.print("생년월일: " + year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day +"일");
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
		
		vomit.close();
		
		
	}

}

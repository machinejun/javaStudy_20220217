package a01_HelloJava;     // HelloJava 라는 파일이 a01_HelloJava 패키지안에 들어가 있다.  " ; " 빠뜨리지 않도록 한다.  

/**
 * 
 * 여러줄 주석(클래스 or 메소드를 설명하는 주석)
 *
 */

/*
 * 여러줄 주석(여러줄 메모)
 * 
 */

// 한줄 주석
// 주석의 단축키 ctrl + /


public class HelloJava {  //여기는 HelloJava class 선언문입니다. 파일명이랑 이름이 같아야한다. + class 파일은 시작 문자가 대문자로 시작해야한다.(약속임)

	public static void main(String[] args) {  //main : 프로그램의 시작지점(실행)
//		'문자' => 'a' 한글자
//		"문자열" => "apple" 여러 글자
//		프로그램 실행(run) -> 단축기 ctrl + F11
		System.out.println("Hello,\nJava!!");
		System.out.print("하만준\n\n"); // System.out.println();
		System.out.print("이름: ");
		System.out.println("하만준");
		System.out.print("연락처: ");
		System.out.println("01086370826");
		System.out.print("주소: ");
		System.out.print("경남 김해시 내외로55");
		
		
		/*
		 * 이름: 
		 * 연락처:
		 * 주소:
		 * 
		 */
		
	}

}

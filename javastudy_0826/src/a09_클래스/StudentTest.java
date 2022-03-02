package a09_클래스;

import java.util.Scanner;

/**
 * class = student
 * schoolName
 * studentYear
 * studentGroup
 * studentNumber
 * studentAddress
 * studentphone_number
 * graduationFlag(boolean)
 * 
 * 
 * 메소드()
 * studentInfo()
 * 학교명: 
 * 학년: 
 * 반: 
 * 번호: 
 * 이름: 
 * 주소: 
 * 연락처:
 * 졸업구분: false;  // false -> 재학중
 * 
 * incrementYear();
 * 학년 + 1
 * 학년 3학년을 넘어서면 -> 졸업 (true)
 *
 */

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student( "부산고", "홍길동", 1,2,10,"부산", "010-1234-5789" , false );
		
		s1.showStudentInfo();
		s1.incrementYear();
		s1.showStudentInfo();
		
		Student s2 = new Student("경남고등학교", "김준일");
	}

}

package a09_클래스_정보은닉;
/*
 * Student 클래스 정의
 * 속성
 * schoolName
 * studentCode(학번) 20220000   학생추가 +1
 * studentYear
 * studentName
 *  
 * 생성자(기본, 전체)
 * getter, setter
 * 
 * 메소드 > showStudentInfo
 * 학교명: 코리아아이티아아케데미
 * 학번: 20220001
 * 학년: 1
 * 이름: 김준일
 * 
 * 메소드 > showStudentInfo
 * 학교명: 코리아아이티아아케데미
 * 학번: 20220001
 * 학년: 1
 * 이름: 김준이
 */
public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("코리아아이티아카데미", "20220000",1,"김준일");
		student.showStudentInfo();
		Student student1 = new Student("코리아아이티아카데미", "20220001",3,"김준이");
		student1.showStudentInfo();
		student.addedStudnet("김준이");
		student.showStudentInfo();
	
		
	}

}

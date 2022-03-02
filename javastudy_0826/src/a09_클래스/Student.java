package a09_클래스;


	public class Student {
		//  속성, 래퍼런스변수, 필드
		 public String studentName;
		 String schoolName;
		 int studentYear; 
		 int studentGroup;
		 int studentNumber;
		 String studentAddress;
		 String studentphone_number;
		 boolean graduationFlag;
	
	 
	 public Student() { //기본 생성자
		 System.out.println("기본생성자 호출");
		 
	 }
	
	 public Student(String studentName, String schoolName) {
		 System.out.println();
	 }
	 
	 public Student(String studentName, String schoolName, int studentYear, int studentGroup, int studentNumber,
			String studentAddress, String studentphone_number, boolean graduationFlag) {
		this.studentName = studentName;
		this.schoolName = schoolName;
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.studentAddress = studentAddress;
		this.studentphone_number = studentphone_number;
		this.graduationFlag = graduationFlag;
	}


	public void incrementYear() {
		 if (0 < studentYear && studentYear < 3) {
			 studentYear ++; 
		 }else if ( studentYear == 3) {
			 graduate();	 
		 }else {
			 System.out.println("Error");
		 }
	 }
	 
	 public void graduate() {
		 studentYear = 0;
		 graduationFlag = true;
	 }
	 
	 public void showStudentInfo() {
		 System.out.println();
		 System.out.println("이름: " + studentName);
		 System.out.println("학교명: " + schoolName);
		 System.out.println("학년: " + studentYear);
		 System.out.println("반: " + studentGroup);
		 System.out.println("주소: " + studentAddress);
		 System.out.println("연락처: " + studentphone_number);
		 System.out.println("졸업구분: " + (graduationFlag ? "졸업" : "재학중" ));
	 }
}

 

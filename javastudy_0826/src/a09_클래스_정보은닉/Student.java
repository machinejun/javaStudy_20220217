package a09_클래스_정보은닉;

public class Student {
	private String schoolName;
	private String studentCode;
	private int schoolYear;
	private String studnetName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String schoolName, String studentCode, int schoolYear, String studentName) {
		super();
		this.schoolName = schoolName;
		this.studentCode = studentCode;
		this.schoolYear = schoolYear;
		this.studnetName = studentName;
	}
	
	

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public int getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}

	public String getStudnetName() {
		return studnetName;
	}

	public void setStudnetName(String studnetName) {
		this.studnetName = studnetName;
	}

	public void showStudentInfo() {
		System.out.println("학교명: " + schoolName);
		System.out.println("학번: " + studentCode);
		System.out.println("학년: " + schoolYear);
		System.out.println("이름: " + studnetName);
		System.out.println();
		
	}
	
	public void addedStudnet(String studnetName) {
		this.studentCode = Integer.toString(Integer.parseInt(studentCode) +1);
		this.studnetName = studnetName;
	}
	

}

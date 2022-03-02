package a09_클래스;

import java.util.Scanner;

public class StudentTest1 {

	public static void main(String[] args) {
//		Student s1 = new Student( "부산고", "홍길동", 1,2,10,"부산", "010-1234-5789" , false );
//		
//		s1.showStudentInfo();
//		s1.incrementYear();
//		s1.showStudentInfo();
		
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수: ");
		i = sc.nextInt();
		
		Student[] student = new Student[i];
		
		for(int j =0; j < i; j++) {
			
			Student std1 = new Student();
			
			std1.studentName = sc.next();
			std1.schoolName = sc.next();
			std1.studentYear = sc.nextInt(); 
			std1.studentGroup = sc.nextInt();
			std1.studentNumber = sc.nextInt();
			std1.studentAddress = sc.next();
			sc.nextLine();
			std1.studentphone_number = sc.nextLine();
			std1.graduationFlag = sc.nextBoolean();
			
			student[j] = std1;
			
			
			
//			student[j][0] = std1.studentName ;
//			student[j][1] = std1.schoolName;
//			student[j][2] = Integer.toString(std1.studentYear);
//			student[j][3] = Integer.toString(std1.studentGroup);
//			student[j][4] = Integer.toString(std1.studentNumber);
//			student[j][5] = std1.studentAddress;
//			student[j][6] = std1.studentphone_number;
//			student[j][7] = Boolean.toString(std1.graduationFlag);		
		}
		
		
		System.out.println(student);
		
		System.out.print("몇 번째 학생을 출력하겠습니까? : ");
		i = sc.nextInt();
		student[i].showStudentInfo();
		
		for(int k = 0; k < student.length; k++) {
			System.out.println(student[k]);
		}
		
		
	}

}

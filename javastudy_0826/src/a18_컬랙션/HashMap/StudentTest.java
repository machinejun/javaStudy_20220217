package a18_컬랙션.HashMap;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService( new HashMap< String, Student>() );
		
		service.showStudentAll();
		service.addStudent("AAA", "aaaa", "aaaaaaaa");
		service.addStudent("BBB", "bbbb", "bbbbbbbb");
		service.addStudent("CCC", "cccc", "cccccccc");
		service.showStudentAll();
		
		service.updateStudentByName("AAA", "", "ddddddd");
		service.showStudentByName("CCC");
		service.deleteStudentByName("RRR");
		service.showStudentAll();

	}

}

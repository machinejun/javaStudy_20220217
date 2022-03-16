package a18_컬랙션.HashMap;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService( new HashMap< String, Student>() );
		
		service.showStudentAll();
		service.addStudent("AAA", "aaaa", "aaaaaaaa");
		service.addStudent("BBB", "bbbb", "bbbbbbbb");
		service.addStudent("CCC", "cccc", "cccccccc");
		service.addStudent("DDD", "dddd", "dddddddd");
		service.showStudentAll();
		
		service.updateStudentByName("AAA", "ttt", "ddddddd");
		service.updateStudentByName("DDD", null, "qqqqqqq");
		service.updateStudentByName("CCC", "rrr", null);
		
		service.showStudentByName("CCC");
		service.deleteStudentByName("BBB");
		service.showStudentAll();

	}

}

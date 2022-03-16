package a18_컬랙션;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService( new ArrayList<Student>());
		
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

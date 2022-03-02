package a09_클래스_정보은닉;

import a09_클래스.Student;  // 패키지가 다르면 꼭 import 해주어야 한다. 패키지이름.Student

public class AccessModifierTest {

	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		accessModifier.name = " ";
		accessModifier.age = 29;

		
		Student student = new Student();
		

	}

}

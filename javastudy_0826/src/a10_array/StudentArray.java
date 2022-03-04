package a10_array;

public class StudentArray {

	public static void main(String[] args) {
		/*
		 * 1학년 2명 2학년 1명 3학년 1명 4학년 1명
		 */

		Student[] students = new Student[5];
		students[0] = new Student("김준일", 1);
		students[1] = new Student("김준이", 4);
		students[2] = new Student("김준삼", 3);
		students[3] = new Student("김준사", 1);
		students[4] = new Student("김준오", 2);

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;

		for (int i = 0; i < students.length; i++) {

			switch (students[i].getStudnetYear()) {
			case 1:
				count1++;

				break;
			case 2:
				count2++;

				break;
			case 3:
				count3++;

				break;
			case 4:
				count4++;

				break;
			default:
				System.out.println("Error");
			}
		}

		System.out.println("1학년: " + count1);
		System.out.println("1학년: " + count1);
		System.out.println("1학년: " + count1);
		System.out.println("1학년: " + count1);

		int[] yearArray = new int[count1 + count2 + count3 + count4];

		for (int i = 0; i < yearArray.length; i++) {
//			if()
//		}
//		
//		
//		
//		yearArray[0] = count1;
//		yearArray[1] = count2;
//		yearArray[2] = count3;
//		yearArray[3] = count4;
//		
//		
		}

	}
}

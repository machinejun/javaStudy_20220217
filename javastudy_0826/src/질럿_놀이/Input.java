package 질럿_놀이;

import java.util.Scanner;

public class Input {
	Scanner sc;
	
	boolean flag1 = true; 
	boolean flag2 = true; 
	
	public Input() {
		sc = new Scanner(System.in);
	}
	
	public void selectUnit() {
		System.out.println();
		System.out.println();
		System.out.println("=======================================");
		System.out.println("아래의 유닛중 하나를 고르세요");
		System.out.println("☆ 질럿 = z,  마린 = m, 저글링 = l, 프로그램종료 = q");
		System.out.println("---------------------------------------");
		System.out.print("   유닛 선택: ");	 
	}
	
	
	public void selectAttUnit() {
		System.out.println();
		System.out.println();
		System.out.println("=======================================");
		System.out.println("공격할 유닛을 고르세요");
		System.out.println("☆ 질럿 = z,  마린 = m, 저글링 = l, 뒤로가기 = b");
		System.out.println("---------------------------------------");
		System.out.print("   유닛 선택: ");
		}
	}
	




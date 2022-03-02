package a09_클래스;

public class Program {
	// 멤버 변수
	private int a;
	
	//생성자 
	public Program(int data) {
		this.a = data;	
	}
	
	//반환 값이 int형인 함수
	public int func( ) {
		return this.a; // this. 를 붙이면 class 변수를 반환해준다.
	}
	
	//반환값이 필요없는 함수
	public void print() {
		System.out.println("Print!");
	}
	
	public static void main(String[] args) {
		
		Program p = new Program(10);
		
		int ret = p.func();
		
		System.out.println("ret= "+ret);
		p.print();
		
		
	}
}

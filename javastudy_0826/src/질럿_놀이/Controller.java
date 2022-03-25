package 질럿_놀이;

import java.util.Scanner;

public class Controller {
	
	private Service service;
	private Input input;
	private Scanner sc;
	
	
	public Controller(Input input, Service service) {
		sc = new Scanner(System.in);
		this.input = input;
		this.service = service;
	}
	
	public void startGame() {
		boolean flag = true;
		char select = 0;
		while(flag) {
			input.selectUnit();
			select = sc.next().charAt(0);
			if( select == 'z' || select == 'm' ||select == 'l') {
				service.createUnit(select);
				game();
			}else if(select == 'q')	{
				flag = false;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}	
	}
	
	public void game() {
		boolean flag = true;
		char select = 0;
		while(flag) {
			input.selectAttUnit();
			select = sc.next().charAt(0);
			if( select == 'z' || select == 'm' ||select == 'l') {
				flag = service.attackUnit(select);	
			}else if(select == 'b')	{
				flag = false;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}	
	}
	
	
		
}
	
	



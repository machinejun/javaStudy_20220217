package 질럿_놀이;

public class Zealot extends Units{
	
	private static int zealotSid;
	private int id;

	public Zealot(String name) {
		super(10, name, 100);
		zealotSid++;
		this.id = zealotSid;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println(" id  : " + id);
		System.out.println("--------------------------------------");
		}
	}
	


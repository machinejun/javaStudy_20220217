package 질럿_놀이;

public class Marine extends Units {

	private static int marineSid;
	private int id;

	public Marine(String name) {
		super(5, name, 70);
		marineSid++;
		this.id = marineSid;
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

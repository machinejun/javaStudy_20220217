package a11_상속.가전제품;

public class HomeAppliances {
	private int appliancesCode;
	private String makename;
	private String dateProduction;
	
	public HomeAppliances() {
		// TODO Auto-generated constructor stub
	}
	
	public HomeAppliances(int appliancesCode, String makename, String dateProduction) {
		super();
		this.appliancesCode = appliancesCode;
		this.makename = makename;
		this.dateProduction = dateProduction;
	}

	public int getAppliancesCode() {
		return appliancesCode;
	}

	public void setAppliancesCode(int appliancesCode) {
		this.appliancesCode = appliancesCode;
	}

	public String getMakename() {
		return makename;
	}

	public void setMakename(String makename) {
		this.makename = makename;
	}

	public String getDateProduction() {
		return dateProduction;
	}

	public void setDateProduction(String dateProduction) {
		this.dateProduction = dateProduction;
	}
	
	public void showInfo() {
		System.out.println("제품코드: " + appliancesCode);
		System.out.println("제품사: " + makename);
		System.out.println("제조일: " + dateProduction);
	}
	
	

}

package course54_55;

public class Typhoon {

	private int typhoonbango;
	private String hasseibi;
	private String asiaName;

	//デフォルトコンストラクタ
	public Typhoon() {
		System.out.println("初期コンストラクタです");
	}
	
	//引数有りコンストラクタ
	public Typhoon(int typnum,String hassei,String asia) {
		this.typhoonbango=typnum;
		this.hasseibi=hassei;
		this.asiaName=asia;
	}
	
	
	//getter,setter
	public int getTyphoonbango() {
		return typhoonbango;
	}

	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}

	public String getHasseibi() {
		return hasseibi;
	}

	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}

	public String getAsiaName() {
		return asiaName;
	}

	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}
}
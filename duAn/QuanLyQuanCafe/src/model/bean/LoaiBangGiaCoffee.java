package model.bean;

public class LoaiBangGiaCoffee {

	private String id;
	private String TenBG;
	private int macDinh;
	
	public LoaiBangGiaCoffee(String id, String tenBG, int macDinh) {
		super();
		this.id = id;
		TenBG = tenBG;
		this.macDinh = macDinh;
	}
	public LoaiBangGiaCoffee() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenBG() {
		return TenBG;
	}

	public void setTenBG(String tenBG) {
		TenBG = tenBG;
	}

	public int getMacDinh() {
		return macDinh;
	}

	public void setMacDinh(int macDinh) {
		this.macDinh = macDinh;
	}

}

package model.bean;

public class DonViTinhTable {
	private String idDVT;
	private String macDinh;

	public DonViTinhTable(String idDVT, String macDinh) {
		super();
		this.idDVT = idDVT;
		this.macDinh = macDinh;
	}
	
	public DonViTinhTable() {
		
	}

	public String getIdDVT() {
		return idDVT;
	}

	public void setIdDVT(String idDVT) {
		this.idDVT = idDVT;
	}

	public String getMacDinh() {
		return macDinh;
	}

	public void setMacDinh(String macDinh) {
		this.macDinh = macDinh;
	}


}

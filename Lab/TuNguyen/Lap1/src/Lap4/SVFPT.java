package Lap4;

public class SVFPT {

	private String hoTen;
	private String nganh;
	
	public SVFPT() {
		
	}

	public SVFPT(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;

	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public void xuat() {
		System.out.println("Ho ten:" + getHoTen());
		System.out.println("Nganh:" + getNganh());
		
	}
	
	public void xuat1() {
		System.out.println("Ho ten:" + getHoTen());
	}

	
	
	
}

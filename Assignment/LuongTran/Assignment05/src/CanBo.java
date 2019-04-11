
public class CanBo {
	private String ten;
	private double phuCap;
	private double heSoLuong;
	
	public String getTen() {
		return ten;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	
	public CanBo() {
		
	}
	public CanBo(String ten, double phuCap, double heSoLuong) {
		super();
		this.ten = ten;
		this.phuCap = phuCap;
		this.heSoLuong = heSoLuong;
	}

	
	
}

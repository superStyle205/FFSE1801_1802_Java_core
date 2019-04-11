package bapTap1.model;

public class sv {
	private String ten;
	private String ho;
	
	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public String getHo() {
		return ho;
	}
	
	public void setHo(String ho) {
		this.ho = ho;
	}
	
	public sv(String ten, String ho) {
		super();
		this.ten = ten;
		this.ho = ho;
	}
	
	public sv() {
		super();
	}
	
	@Override
	public String toString() {
		return "ho: " + this.ho + "\t ten: " + this.ten;
	}
}

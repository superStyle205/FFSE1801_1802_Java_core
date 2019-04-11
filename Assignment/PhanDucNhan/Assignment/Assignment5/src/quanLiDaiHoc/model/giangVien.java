package quanLiDaiHoc.model;

public class giangVien {
	private String ten;
	private String khoa;
	private int trinhDo;
	private double phuCap;
	private int soTietDay;
	private double heSoLuong;
	
	public giangVien(String ten, String khoa, int trinhDo, int soTietDay, double heSoLuong) {
		super();
		this.ten = ten;
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		if(trinhDo == 1) {
			this.phuCap = 300; 
		}else if(trinhDo == 2) {
			this.phuCap = 500;
		}else{
			this.phuCap = 1000;
		}
		this.soTietDay = soTietDay;
		this.heSoLuong = heSoLuong;
	}
	
	public double tinhLuong() {
		return heSoLuong * 730 + phuCap + soTietDay * 30;
	}
	
	public giangVien() {
		super();
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public int getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(int trinhDo) {
		this.trinhDo = trinhDo;
		if(trinhDo == 1) {
			this.phuCap = 300; 
		}else if(trinhDo == 2) {
			this.phuCap = 500;
		}else{
			this.phuCap = 1000;
		}
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	public int getSoTietDay() {
		return soTietDay;
	}
	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	@Override
	public String toString() {
		return "giangVien [ten=" + ten + ", khoa=" + khoa + ", trinhDo=" + trinhDo + ", phuCap=" + phuCap
				+ ", soTietDay=" + soTietDay + ", heSoLuong=" + heSoLuong + "]";
	}
	
	
	
}

package quanLiDaiHoc.model;

public class nhanVien {
	private String ten;
	private int phongBan;
	private int soNgayCong;
	private double heSoLuong;
	private double phuCap;
	private int chucVu;
	
	public nhanVien(String hoTen, int phongBan, int soNgayCong, double heSoLuong, int chucVu) {
		super();
		this.ten = hoTen;
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		this.heSoLuong = heSoLuong;
		if(chucVu == 1) {
			this.phuCap = 2000; 
		}else if(chucVu == 2) {
			this.phuCap = 1000;
		}else {
			this.phuCap = 500;
		}
		this.phuCap = phuCap;
		this.chucVu = chucVu;
	}
	public double tinhLuong() {
		return heSoLuong * 730 + phuCap + soNgayCong * 45;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String hoTen) {
		this.ten = hoTen;
	}
	public int getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(int phongBan) {
		this.phongBan = phongBan;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	public int getChucVu() {
		return chucVu;
	}
	public void setChucVu(int chucVu) {
		this.chucVu = chucVu;
		if(chucVu == 1) {
			this.phuCap = 2000; 
		}else if(chucVu == 2) {
			this.phuCap = 1000;
		}else {
			this.phuCap = 500;
		}
	}
	public nhanVien() {
		super();
	}
	@Override
	public String toString() {
		return "nhanVien [hoTen=" + ten + ", phongBan=" + phongBan + ", soNgayCong=" + soNgayCong + ", heSoLuong="
				+ heSoLuong + ", phuCap=" + phuCap + ", chucVu=" + chucVu + "]";
	}
	
}

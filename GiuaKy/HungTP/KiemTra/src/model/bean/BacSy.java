package model.bean;

public class BacSy extends ConNguoi{
	
	private int maBacSy;
	private String khoa;
	private String ngayVaoLam;
	private double luong;
	private double phuCap;

	public BacSy() {
	}
	public int getMaBacSy() {
		return maBacSy;
	}
	public void setMaBacSy(int maBacSy) {
		this.maBacSy = maBacSy;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getNgayVaoLam() {
		return ngayVaoLam;
	}
	public void setNgayVaoLam(String ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	
	public BacSy(int maBacSy, String khoa, String ngayVaoLam, double luong, double phuCap) {
		this.maBacSy = maBacSy;
		this.khoa = khoa;
		this.ngayVaoLam = ngayVaoLam;
		this.luong = luong;
		this.phuCap = phuCap;
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("id Bac Sy : " + maBacSy);
		System.out.println("Khoa : " + khoa);
		System.out.println("Ngay vao lam: " + ngayVaoLam);
		System.out.println("Luong : " + luong);
		System.out.println("Tien phu cap : " + phuCap);
	}
}

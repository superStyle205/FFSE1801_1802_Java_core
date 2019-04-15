package BaiKiemTra;

public class BacSi extends ConNguoi {
	private String maBacSi;
	private String khoa;
	private String ngayBatDauVaoLam;
	private double luong;
	private double phuCap;
	
	public BacSi(String ten, int tuoi, String gioiTinh, int cmnd, String maBacSi, String khoa ,String ngayBatDauVaoLam, double luong, double phuCap) {
		super(ten, tuoi, gioiTinh, cmnd);
		this.maBacSi =  maBacSi;
		this.khoa = khoa;
		this.ngayBatDauVaoLam = ngayBatDauVaoLam;
		this.luong = luong;
		this.phuCap = phuCap;
	}
	public BacSi() {
		
	}
	

	public void xuat() {
		super.xuat();
		System.out.println("Mã bác sĩ : " + getMaBacSi());
		System.out.println("Khoa : " + getKhoa());
		System.out.println("Ngày bắt đầu vào làm : " + getNgayBatDauVaoLam());
		System.out.println("Lương : " + getLuong());
		System.out.println("Phụ cấp : " + getPhuCap());
	}



	public String getMaBacSi() {
		return maBacSi;
	}
	public void setMaBacSi(String maBacSi) {
		this.maBacSi = maBacSi;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getNgayBatDauVaoLam() {
		return ngayBatDauVaoLam;
	}
	public void setNgayBatDauVaoLam(String ngayBatDauVaoLam) {
		this.ngayBatDauVaoLam = ngayBatDauVaoLam;
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
}	


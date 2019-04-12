package BaiTapKiemTra;

public class BacSy extends ConNguoi{
	private String maBacSy;
	private String khoa;
	private String ngayLamDau;
	private double luong;
	private double phuCap;
	
	public BacSy() {
		
	}

	public BacSy(String ten, int tuoi, String gioiTinh, int cmnd,String maBacSy, String khoa, String ngayLamDau,
			     double luong, double phuCap) {
		super(ten, tuoi, gioiTinh, cmnd);
		this.maBacSy = maBacSy;
		this.khoa = khoa;
		this.ngayLamDau = ngayLamDau;
		this.luong = luong;
		this.phuCap = phuCap;
	}

	public String getMaBacSy() {
		return maBacSy;
	}

	public void setMaBacSy(String maBacSy) {
		this.maBacSy = maBacSy;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getNgayLamDau() {
		return ngayLamDau;
	}

	public void setNgayLamDau(String ngayLamDau) {
		this.ngayLamDau = ngayLamDau;
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

	@Override
	public String toString() {
		super.toString();
		return " Ma bac sy: " + maBacSy + "\n khoa: " + khoa + "\n Ngay Lam dau: " + ngayLamDau + "\n Luong: " + luong
				+"\n Phu cap: " + phuCap;
	}
	
	
	
}

package quanLyHoSo;

public class BacSy extends ConNguoi {
	private String IdBacSy;
	private String Khoa;
	private String NgayVaoLam;
	private double Luong;
	private double PhuCap;
	
	public BacSy() {	
	}
	public BacSy(String ten, int tuoi, String gioiTinh, int CMND,String idBacSy, String khoa, String ngayVaoLam, double luong, double phuCap) {
		super(ngayVaoLam, CMND, ngayVaoLam, CMND);
		IdBacSy = idBacSy;
		Khoa = khoa;
		NgayVaoLam = ngayVaoLam;
		Luong = luong;
		PhuCap = phuCap;
	}

	public String getIdBacSy() {
		return IdBacSy;
	}
	public void setIdBacSy(String idBacSy) {
		IdBacSy = idBacSy;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public String getNgayVaoLam() {
		return NgayVaoLam;
	}
	public void setNgayVaoLam(String ngayVaoLam) {
		NgayVaoLam = ngayVaoLam;
	}
	public double getLuong() {
		return Luong;
	}
	public void setLuong(double luong) {
		Luong = luong;
	}
	public double getPhuCap() {
		return PhuCap;
	}
	public void setPhuCap(double phuCap) {
		PhuCap = phuCap;
	}
	
	public void xuat(){
		super.xuat();
	System.out.println("Id Bac Sy: " + IdBacSy );
	System.out.println("Khoa: " + Khoa);
	System.out.println("Ngay vao lam: " + NgayVaoLam);
	System.out.println("Luong : " + Luong);
	System.out.println("Phu câp : " + PhuCap);
	}	
}

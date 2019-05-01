package assignment5;

public class NhanVien extends ConNguoi{
	private String phongBan;
	private int soNgayCong;
	private String chucVu;
	
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
		
	public NhanVien(String hoTen, double phuCap, int soNgayCong, String phongBan, int heSoLuong, String chucVu) {
		super(hoTen, phuCap, heSoLuong);
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		this.chucVu = chucVu;
	}
	public void xuat() {
		super.xuat();
		System.out.println("PhongBan : " + getPhongBan());
		System.out.println("Khoa : " + getPhongBan());
		System.out.println("Trình độ : " + getSoNgayCong());		
	}
	
	public double getPhuCap() {
		if ( getChucVu().equals("trưởng phòng")) {
			return 2000;
		} else if (getChucVu().equals("phó phòng")) {
			return 1000;
		} else if (getChucVu().equals("nhân viên")) {
			return 500;
		}
		return 0;
	}

	public double getLuong() {
		return getHeSoLuong()*730 + getPhuCap() + getSoNgayCong()* 30;
	}
}

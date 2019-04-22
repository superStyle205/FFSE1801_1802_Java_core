package assignment6;

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
		
	public NhanVien(String maCanBo, String hoTen, double phuCap, int heSoLuong, String phongBan, int soNgayCong, String chucVu) {
		super(maCanBo, hoTen, phuCap, heSoLuong);
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		this.chucVu = chucVu;
	}
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}
	public void xuat() {
		super.xuat();
		System.out.println("PhongBan : " + getPhongBan());
		System.out.println("Chức vụ : " + getChucVu());
		System.out.println("Trình độ : " + getSoNgayCong());		
	}
	
	
	public double getPhuCap() {
		if ( getChucVu().equals("Truong phong")) {
			return 2000;
		} else if (getChucVu().equals("Pho phong")) {
			return 1000;
		} else if (getChucVu().equals("Nhan vien")) {
			return 500;
		}
		return 0;
	}

	public double getLuong() {
		return getHeSoLuong() * 730 + getPhuCap() + getSoNgayCong() * 30;
	}
}

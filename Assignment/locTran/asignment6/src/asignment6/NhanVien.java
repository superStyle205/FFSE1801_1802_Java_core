package asignment6;

public class NhanVien extends CanBo{
	private String phongBan;
	private double soNgayCong;
	private String chucVu;

	
	public NhanVien() {
		super();
	} 

	public NhanVien(String phongBan, double soNgayCong, String chucVu) {
		super();
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		this.chucVu = chucVu;
	}

	
	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public double getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(double soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public void xuat() {
		super.xuat();
		System.out.println("<-------------Nhân viên--------------->");
		System.out.println("Phòng ban \t: " + getPhongBan());
		System.out.println("Số ngày công \t: " + getSoNgayCong());
		System.out.println("Chức vụ \t: " + getChucVu());
		System.out.println("Lương \t\t: " + getLuong());
	}

	public double getPhuCap() {
		if ( getChucVu().equals("Trưởng Phòng")) {
			return 2000;
		} else if (getChucVu().equals("Phó Phòng")) {
			return 1000;
		} else if (getChucVu().equals("Nhân Viên")) {
			return 500;
		}
		return 0;
	}
	
	public double getLuong() {
		return getHeSoLuong()*730 + getPhuCap() + getSoNgayCong()* 30;
	}
}

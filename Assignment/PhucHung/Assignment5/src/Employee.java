

public class Employee extends Person{
	private String phongBan;
	private double soNgayCong;
	private String chucVu;

	public Employee(String phongBan, double soNgayCong, String chucVu) {
		super();
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		this.chucVu = chucVu;
	}

	public Employee() {
		super();
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
		System.out.println("<--------------Hành Chính-------------->");
		super.xuat();
		System.out.println("Phòng ban \t: " + getPhongBan());
		System.out.println("Số ngày công\t: " + getSoNgayCong());
		System.out.println("Chức vụ\t\t: " + getChucVu());
		System.out.println("Lương\t\t: " + getLuong());
	}

	public double getPhuCap() {
		if ( getChucVu().equals("Trưởng phòng")) {
			return 2000;
		} else if (getChucVu().equals("Phó phòng")) {
			return 1000;
		} else if (getChucVu().equals("Nhân viên")) {
			return 500;
		}
		return 0;
	}
	
	public double getLuong() {
		return getHeSoLuong()*730 + getPhuCap() + getSoNgayCong()* 30;
	}
}

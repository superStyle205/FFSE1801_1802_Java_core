package sinhVien.model;

public abstract class sinhVienFpt implements Comparable<sinhVienFpt> {
	private String hoTen;
	private String nganh;
	
	public abstract double getDiemTB();
	
	public String getHocLuc() {
		if(this.getDiemTB() > 5 && this.getDiemTB() <= 10) {
			return "Hoc sinh gio";
		}else {
			return "Hoc sinh trunh binh";
		}
	}
	
	public sinhVienFpt() {
		super();
	}
	
	public sinhVienFpt(String hoTen, String nganh) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getNganh() {
		return nganh;
	}
	
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	
	@Override
	public String toString() {
		return "Tên: " + this.hoTen + "\tNgành: " + this.nganh + "\tHọc lực: " + this.getHocLuc();
	}
	
	@Override
	public int compareTo(sinhVienFpt o) {
		if(this.getDiemTB() < o.getDiemTB()) {	
			return 1;
		}else if(this.getDiemTB() > o.getDiemTB()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public String hocSinhGioi() {
		if(this.getDiemTB() > 5) {
			return "Tên: " + this.hoTen + "\tNgành: " + this.nganh + "\tHọc lực: " + this.getHocLuc();
		}else {
			return "";
		}
	}
	
	
	
}

package BaiKiemTra;

public class ConNguoi {
	private String ten;
	private int tuoi;
	private String gioiTinh;
	private int cmnd;

	public ConNguoi() {
	}

	public ConNguoi(String ten, int tuoi, String gioiTinh, int cmnd) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.cmnd = cmnd;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getCmnd() {
		return cmnd;
	}

	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}

	public void xuat() {
		System.out.println("Tên : " + getTen());
		System.out.println("Tuổi : " + getTuoi());
		System.out.println("Giới tính : " + getGioiTinh());
		System.out.println("Chứng minh : " + getCmnd());
	}
}
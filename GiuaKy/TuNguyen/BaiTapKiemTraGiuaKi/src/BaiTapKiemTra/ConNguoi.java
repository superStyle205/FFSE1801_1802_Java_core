package BaiTapKiemTra;

public class ConNguoi {
	private String ten;
	private int tuoi;
	private String gioiTinh;
	private int cmnd;
	
	public ConNguoi() {
		
	}
	
	public ConNguoi(String ten, int tuoi, String gioiTinh, int cmnd) {
		super();
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

	
	public String toString() {
		return " ten: " + ten + "\n tuoi: " + tuoi + "\n Gioi Tinh: " + gioiTinh + "\n cmnd: " + cmnd;
	}
	
	
}

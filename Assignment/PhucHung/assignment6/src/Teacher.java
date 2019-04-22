
public class Teacher extends Person{
	private String khoa;
	private String trinhDo;
	private double soTietDayTrongThang;

	public Teacher() {
		super();
	}

	public Teacher(String khoa, String trinhDo, double soTietDayTrongThang) {
		super();
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDayTrongThang = soTietDayTrongThang;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public double getSoTietDayTrongThang() {
		return soTietDayTrongThang;
	}

	public void setSoTietDayTrongThang(double soTietDayTrongThang) {
		this.soTietDayTrongThang = soTietDayTrongThang;
	}

	public void xuat() {
		System.out.println("<--------------Giảng viên-------------->");
		super.xuat();
		System.out.println("Khoa \t\t: " + getKhoa());
		System.out.println("Trinh Do\t: " + getTrinhDo());
		System.out.println("So Tiet \t: " + getSoTietDayTrongThang());
		System.out.println("Lương\t\t: " + getLuong());
		
	}

	public double getPhuCap() {
		if (getTrinhDo().equals("cu nhan")) {
			return 300;
		} else if (getTrinhDo().equals("thac si")) {
			return 500;
		} else if (getTrinhDo().equals("tien si")) {
			return 1000;
		}
		return 0;
	}

	public double getLuong() {
		return getHeSoLuong()*730 + getPhuCap() + getSoTietDayTrongThang() * 45;
	}


}

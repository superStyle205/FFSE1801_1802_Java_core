package Assignment5;

public class GiangVien extends ConNguoi {
	private String khoa;
	private String trinhDo;
	private double soTietDayTrongThang;

	public GiangVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiangVien(String ten, double heSoLuong, String khoa, String trinhDo, double soTietDayTrongThang) {
		super(ten, heSoLuong);
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDayTrongThang = soTietDayTrongThang;
		// TODO Auto-generated constructor stub
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
		if (getTrinhDo().equals("Cử nhân")) {
			return 300;
		} else if (getTrinhDo().equals("Thạc sĩ")) {
			return 500;
		} else if (getTrinhDo().equals("Tiến sĩ")) {
			return 1000;
		}
		return 0;
	}

	public double getLuong() {
		return getHeSoLuong()*730 + getPhuCap() + getSoTietDayTrongThang() * 45;
	}

}

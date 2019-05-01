package assignment6;

public class GiangVien extends ConNguoi{
	private String khoa;
	private String trinhDo;
	private int soTietDay;
	
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
	public int getSoTietDay() {
		return soTietDay;
	}
	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}
	
	public GiangVien(String maCanBo, String hoTen, double phuCap, int heSoLuong, String khoa, String trinhDo, int soTietDay) {
		super(maCanBo, hoTen, phuCap, heSoLuong);
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDay = soTietDay;
	}
	public GiangVien() {
		// TODO Auto-generated constructor stub
	}
	public void xuat() {
		super.xuat();
		System.out.println("Khoa : " + getKhoa());
		System.out.println("Trình độ : " + getTrinhDo());
		System.out.println("Phụ cấp : " + getPhuCap());
		System.out.println("Số tiết dạy : " + getSoTietDay());
	}
	
	public double getPhuCap() {
		if (getTrinhDo().equals("Cu nhan")) {
			return 300;
		} else if (getTrinhDo().equals("Thac si")) {
			return 500;
		} else if (getTrinhDo().equals("Tien si")) {
			return 1000;
		}
		return 0;
	}

	public double getLuong() {
		return getHeSoLuong()*730 + getPhuCap() + getSoTietDay() * 45;
	}
	
	
}

package Assignment6;

public class GiangVien extends ConNguoi{
	
	private String khoa;
	
	private String trinhDo;
	
	private int soTietDay;


	public GiangVien() {
		
	}
	
	public GiangVien(String id ,String hoTen, double heSoLuong ,String khoa, String trinhDo, int soTietDay) {
		super(id,hoTen, heSoLuong);
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDay = soTietDay;
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


	public int getSoTietDay() {
		return soTietDay;
	}


	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}
	
	
	public double getPhuCap() {
		if(getTrinhDo().equals("Tien si")) {
			return 1000;
		} else if (getTrinhDo().equals("Thac si")) {
			return 500;
		} else if (getTrinhDo().equals("Cu nhan")) {
			return 300;
		}
		return 0;
	}

	

	public double getLuong() {
		
		return (getHeSoLuong() * 730) + getPhuCap() + (getSoTietDay() * 45);
		
	}
	
	@Override 
	public String toString() {
		
		return super.toString() + "\n Khoa: " + khoa + "\n Trình độ: " + trinhDo + "\n Phụ cấp: " + getPhuCap()
		+"\n Số tiết dạy: " + soTietDay + "\n TONG LUONG: " + getLuong();
	}
	
	
}

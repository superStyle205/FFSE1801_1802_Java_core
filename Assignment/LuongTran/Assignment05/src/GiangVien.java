
public class GiangVien extends CanBo{
	private String khoa;
	private String trinhDo;
	private int soTietDayTrongThang;
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
	public int getSoTietDayTrongThang() {
		return soTietDayTrongThang;
	}
	public void setSoTietDayTrongThang(int soTietDayTrongThang) {
		this.soTietDayTrongThang = soTietDayTrongThang;
	}
	
	public GiangVien() {
		
	}
	
	public void setPhuCap() {
		if(getTrinhDo().equals("cử nhân")) {
			super.setPhuCap(300);;
		}
		if(getTrinhDo().equals("thạc sĩ")) {
			super.setPhuCap(500);
		}
		if(getTrinhDo().equals("tiến sĩ")) {
			super.setPhuCap(1000);
		}
	}
	@Override
	public double getLuong() {
		return (getHeSoLuong()*730 + getPhuCap() + soTietDayTrongThang*45);
	}
	
	public GiangVien(String ten, double phuCap, double heSoLuong, String khoa, String trinhDo,
			int soTietDayTrongThang) {
		super(ten, phuCap, heSoLuong);
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDayTrongThang = soTietDayTrongThang;
	}
	
	
}

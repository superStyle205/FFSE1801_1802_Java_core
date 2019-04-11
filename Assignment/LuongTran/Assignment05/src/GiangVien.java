
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
	public GiangVien(String ten, double phuCap, double heSoLuong, String khoa, String trinhDo,
			int soTietDayTrongThang) {
		super(ten, phuCap, heSoLuong);
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDayTrongThang = soTietDayTrongThang;
	}
	
	
}

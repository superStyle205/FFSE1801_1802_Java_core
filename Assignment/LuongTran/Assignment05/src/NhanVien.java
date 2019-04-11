
public class NhanVien extends CanBo{
	private String phongBan;
	private String soNgayCong;
	private double phuCap;
	private String chuVu;
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public String getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(String soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	public String getChuVu() {
		return chuVu;
	}
	public void setChuVu(String chuVu) {
		this.chuVu = chuVu;
	}
	
	public NhanVien() {
		
	}
	public NhanVien(String ten, double phuCap, double heSoLuong, String phongBan, String soNgayCong, double phuCap2,
			String chuVu) {
		super(ten, phuCap, heSoLuong);
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		phuCap = phuCap2;
		this.chuVu = chuVu;
	}
	
	
	
	
	
}

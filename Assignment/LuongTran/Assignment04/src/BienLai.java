package QuanLyDien;

public class BienLai {
	private String maCongTo;
	private double chiSoCu;
	private double chiSoMoi;
	public String getMaCongTo() {
		return maCongTo;
	}
	public void setMaCongTo(String maCongTo) {
		this.maCongTo = maCongTo;
	}
	public double getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(double chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	public double getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(double chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	
	public double getTienDienTra() {
		return (chiSoMoi - chiSoCu)*750;
	}
	public BienLai() {
		
	}
}

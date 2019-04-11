package Assignment4;

public class KhachHang {
	private String hoTen;
	private String diaChi;
	private	double chiSoDien;
	private BienLai bienLai;
	

	public KhachHang() {
		//
	}
	public KhachHang(String hoTen, String diaChi, double chiSoDien) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.chiSoDien = chiSoDien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public double getChiSoDien() {
		return chiSoDien;
	}
	public void setChiSoDien(double chiSoDien) {
		this.chiSoDien = chiSoDien;
	}
	public BienLai getBienLai() {
		return bienLai;
	}
	public void setBienLai(BienLai bienLai) {
		this.bienLai = bienLai;
	}
	
}

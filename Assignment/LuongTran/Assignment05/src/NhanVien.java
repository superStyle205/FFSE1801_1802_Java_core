
public class NhanVien extends CanBo{
	private String phongBan;
	private int soNgayCong;
	private String chuVu;
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	
	public String getChucVu() {
		return chuVu;
	}
	public void setChuVu(String chuVu) {
		this.chuVu = chuVu;
	}
	
	public NhanVien() {
		
	}
	public void setPhuCap() {
		if(getChucVu().equals("trưởng phòng")) {
			super.setPhuCap(2000);;
		}
		if(getChucVu().equals("phó phòng")) {
			super.setPhuCap(1000);
		}
		if(getChucVu().equals("nhân viên")) {
			super.setPhuCap(500);
		}
	}
	public double getLuong() {
		return (getHeSoLuong()*730+ getPhuCap() + soNgayCong*30);
	}
	public NhanVien(String ten, double phuCap, double heSoLuong, String phongBan, int soNgayCong, double phuCap2,
			String chuVu) {
		super(ten, phuCap, heSoLuong);
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		phuCap = phuCap2;
		this.chuVu = chuVu;
	}
	
	
	
	
	
}

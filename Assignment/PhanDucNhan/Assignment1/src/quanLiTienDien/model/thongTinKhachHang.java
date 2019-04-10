package quanLiTienDien.model;

public abstract class thongTinKhachHang {
	protected String hoTen;
	protected String diaChi;
	protected int maCongTo;
	protected int soDienCu;
	protected int soDienMoi;
	
	
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

	public int getMaCongTo() {
		return maCongTo;
	}

	public void setMaCongTo(int maCongTo) {
		this.maCongTo = maCongTo;
	}

	public int getSoDienCu() {
		return soDienCu;
	}

	public void setSoDienCu(int soDienCu) {
		this.soDienCu = soDienCu;
	}

	public int getSoDienMoi() {
		return soDienMoi;
	}

	public void setSoDienMoi(int soDienMoi) {
		this.soDienMoi = soDienMoi;
	}

	public thongTinKhachHang(String hoTen, String diaChi, int maCongTo, int soDienCu, int soDienMoi) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.maCongTo = maCongTo;
		this.soDienCu = soDienCu;
		this.soDienMoi = soDienMoi;
	}

	public thongTinKhachHang() {
		super();
	}


	
}

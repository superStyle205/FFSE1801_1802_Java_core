package BaiTapKiemTra;

public class BenhNhan extends ConNguoi{
	private String maBenhNhan;
	private String benh;
	private String phuongPhapChuaBenh;
	private String ngayNhapvien;
	private String ngayRaVien;
	private double tienThanhToan;
	
	public BenhNhan() {
		
	}

	public BenhNhan(String ten, int tuoi, String gioiTinh, int cmnd,String maBenhNhan, String benh, String phuongPhapChuaBenh, String ngayNhapvien, String ngayRaVien,
			double tienThanhToan) {
		super(ten, tuoi, gioiTinh, cmnd);
		this.maBenhNhan = maBenhNhan;
		this.benh = benh;
		this.phuongPhapChuaBenh = phuongPhapChuaBenh;
		this.ngayNhapvien = ngayNhapvien;
		this.ngayRaVien = ngayRaVien;
		this.tienThanhToan = tienThanhToan;
	}

	public String getMaBenhNhan() {
		return maBenhNhan;
	}

	public void setMaBenhNhan(String maBenhNhan) {
		this.maBenhNhan = maBenhNhan;
	}

	public String getBenh() {
		return benh;
	}

	public void setBenh(String benh) {
		this.benh = benh;
	}

	public String getPhuongPhapChuaBenh() {
		return phuongPhapChuaBenh;
	}

	public void setPhuongPhapChuaBenh(String phuongPhapChuaBenh) {
		this.phuongPhapChuaBenh = phuongPhapChuaBenh;
	}

	public String getNgayNhapvien() {
		return ngayNhapvien;
	}

	public void setNgayNhapvien(String ngayNhapvien) {
		this.ngayNhapvien = ngayNhapvien;
	}

	public String getNgayRaVien() {
		return ngayRaVien;
	}

	public void setNgayRaVien(String ngayRaVien) {
		this.ngayRaVien = ngayRaVien;
	}

	public double getTienThanhToan() {
		return tienThanhToan;
	}

	public void setTienThanhToan(double tienThanhToan) {
		this.tienThanhToan = tienThanhToan;
	}

	@Override
	public String toString() {
		super.toString();
		return " Ma benh nhan: " + maBenhNhan + "\n Benh: " + benh + "\n Phuong phap chua benh: " + phuongPhapChuaBenh
				+ "\n Ngay nhap vien: " + ngayNhapvien + "\n Ngay ra vien: " + ngayRaVien + "\n Tien thanh toan" + tienThanhToan;
	}
	
	
	
	
}

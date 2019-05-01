package model.bean;

public class BenhNhan extends ConNguoi{
	private int maBenhNhan;
	private String benh;
	private String phuongPhapChuaBenh;
	private String ngayNhapVien;
	private String ngayRaVien;
	private double tienThanhToan;

	public BenhNhan(int maBenhNhan, String benh, String phuongPhapChuaBenh, String ngayNhapVien, String ngayRaVien,
			double tienThanhToan) {
		this.maBenhNhan = maBenhNhan;
		this.benh = benh;
		this.phuongPhapChuaBenh = phuongPhapChuaBenh;
		this.ngayNhapVien = ngayNhapVien;
		this.ngayRaVien = ngayRaVien;
		this.tienThanhToan = tienThanhToan;
	}
	public BenhNhan() {
	}
	
	public double getTienThanhToan() {
		return tienThanhToan;
	}	
	public void setTienThanhToan(double tienThanhToan) {
		this.tienThanhToan = tienThanhToan;
	}
	
	public int getMaBenhNhan() {
		return maBenhNhan;
	}
	public void setMaBenhNhan(int maBenhNhan) {
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
	public String getNgayNhapVien() {
		return ngayNhapVien;
	}
	public void setNgayNhapVien(String ngayNhapVien) {
		this.ngayNhapVien = ngayNhapVien;
	}
	public String getNgayRaVien() {
		return ngayRaVien;
	}
	public void setNgayRaVien(String ngayRaVien) {
		this.ngayRaVien = ngayRaVien;
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("id Benh Nhan : " + maBenhNhan);
		System.out.println("Benh : " + benh);
		System.out.println("Phuong phap chua benh: " + phuongPhapChuaBenh);
		System.out.println("ngay nhap vien : " + ngayNhapVien);
		System.out.println("ngay ra vien : " + ngayRaVien);
		System.out.println("Tien THANH TOAN : " + tienThanhToan);
	}
}

package model;

import java.util.Date;

public class BenhNhan extends Person {
	private String maBenhNhan;
	private String benh;
	private String phuongPhapChuaBenh;
	private Date ngayNhapVien;
	private Date ngayRaVien;
	private double tienThanhToan;
	
	public BenhNhan(String ten, byte age, String sex, String cmnd, String maBenhNhan, String benh, String phuongPhapChuaBenh, Date ngayNhapVien, Date ngayRaVien, double tienThanhToan)
	{
		super(ten, age, sex, cmnd);
		this.benh = benh;
		this.maBenhNhan=maBenhNhan;
		this.phuongPhapChuaBenh=phuongPhapChuaBenh;
		this.ngayNhapVien=ngayNhapVien;
		this.ngayRaVien=ngayRaVien;
		this.tienThanhToan=tienThanhToan;
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

	public Date getNgayNhapVien() {
		return ngayNhapVien;
	}

	public void setNgayNhapVien(Date ngayNhapVien) {
		this.ngayNhapVien = ngayNhapVien;
	}

	public Date getNgayRaVien() {
		return ngayRaVien;
	}

	public void setNgayRaVien(Date ngayRaVien) {
		this.ngayRaVien = ngayRaVien;
	}

	public double getTienThanhToan() {
		return tienThanhToan;
	}

	public void setTienThanhToan(double tienThanhToan) {
		this.tienThanhToan = tienThanhToan;
	}
	
	
	
	
}

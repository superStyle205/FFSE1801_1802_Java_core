package model;

import java.util.Date;

public class BacSy extends Person {
	private String maBacSy;
	private String khoa;
	private Date ngayVaoLam;
	private double luong;
	private double phuCap;
	
	
	public BacSy(String ten, byte age, String sex, String cmnd, String maBacSy, String khoa, Date ngayVaoLam, double luong, double phuCap) 
	{
		super(ten, age, sex, cmnd);
		this.maBacSy = maBacSy;
		this.khoa = khoa;
		this.ngayVaoLam = ngayVaoLam;
		this.luong = luong;
		this.phuCap = phuCap;
	}


	public String getMaBacSy() {
		return maBacSy;
	}


	public void setMaBacSy(String maBacSy) {
		this.maBacSy = maBacSy;
	}


	public String getKhoa() {
		return khoa;
	}


	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}


	public Date getNgayVaoLam() {
		return ngayVaoLam;
	}


	public void setNgayVaoLam(Date ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}


	public double getLuong() {
		return luong;
	}


	public void setLuong(double luong) {
		this.luong = luong;
	}


	public double getPhuCap() {
		return phuCap;
	}


	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}

	
	
	
}

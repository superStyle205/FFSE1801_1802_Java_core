package baiTap2.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Nguoi {
	private String hoTen;
	private Date ngaySinh;
	private int cmnd;
	public Nguoi(String hoTen, Date ngaySinh, int cmnd) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.cmnd = cmnd;
	}
	public Nguoi() {
		super();
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
		return "Nguoi [hoTen=" + hoTen + ", \tngaySinh=" + dateFormat.format(ngaySinh) + ", \tcmnd=" + cmnd + "]";
	} 



}

package asm6;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class NhanVien  extends ConNguoi{
	
	private String phongBan ;
	private int soNgayCong;
	private String chucVu;
	
	
	public NhanVien(int id, String name, double heSoLuong, String phongBan, int soNgayCong , String chucVu) {
		super();
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		this.chucVu = chucVu;
	}


	public String getPhongBan() {
		return phongBan;
	}


	public NhanVien() {
		
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
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	 
	public double getPhuCap() {
		
		if(getChucVu().equals("truong phong")) {
			return 2000;
		
			} else if (getChucVu().equals("pho phong")) {
			return 1000;
			
			} else if(getChucVu().equals("nhan vien")){
			return 500;
			}
			return 0;
		}
	
	
	public double getLuong() {
		return getHeSoLuong()*730 + getPhuCap()+ soNgayCong * 45;
	
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println(" phong ban :" + phongBan);
		System.out.println(" phong ban :" + soNgayCong);
		System.out.println(" phong ban :" + chucVu);	
	}
	
}

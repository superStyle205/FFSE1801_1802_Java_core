package model.bean;

import org.omg.CORBA.PRIVATE_MEMBER;

public class User {
	private String MaNV;
	private String MaBP;
	private String HoVaTen;
	private String DiaChi;
	private String DienThoai;
	private String UserName;
	private String PassWord;
	private String MaSoThue;
	private int isThuNgan;
	private int isKeToan;
	
	public User(String maNV, String maBP, String hoVaTen, String diaChi, String dienThoai, String userName,
			String passWord, String maSoThue, int isThuNgan, int isKeToan, String taiKhoan, String matKhau) {
		super();
		MaNV = maNV;
		MaBP = maBP;
		HoVaTen = hoVaTen;
		DiaChi = diaChi;
		DienThoai = dienThoai;
		UserName = userName;
		PassWord = passWord;
		MaSoThue = maSoThue;
		this.isThuNgan = isThuNgan;
		this.isKeToan = isKeToan;
	}

	
	
		public String getMaNV() {
		return MaNV;
	}



	public void setMaNV(String maNV) {
		MaNV = maNV;
	}



	public String getMaBP() {
		return MaBP;
	}



	public void setMaBP(String maBP) {
		MaBP = maBP;
	}



	public String getHoVaTen() {
		return HoVaTen;
	}



	public void setHoVaTen(String hoVaTen) {
		HoVaTen = hoVaTen;
	}



	public String getDiaChi() {
		return DiaChi;
	}



	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}



	public String getDienThoai() {
		return DienThoai;
	}



	public void setDienThoai(String dienThoai) {
		DienThoai = dienThoai;
	}



	public String getUserName() {
		return UserName;
	}



	public void setUserName(String userName) {
		UserName = userName;
	}



	public String getPassWord() {
		return PassWord;
	}



	public void setPassWord(String passWord) {
		PassWord = passWord;
	}



	public String getMaSoThue() {
		return MaSoThue;
	}



	public void setMaSoThue(String maSoThue) {
		MaSoThue = maSoThue;
	}



	public int getIsThuNgan() {
		return isThuNgan;
	}



	public void setIsThuNgan(int isThuNgan) {
		this.isThuNgan = isThuNgan;
	}



	public int getIsKeToan() {
		return isKeToan;
	}



	public void setIsKeToan(int isKeToan) {
		this.isKeToan = isKeToan;
	}

		public User() {
	}
}

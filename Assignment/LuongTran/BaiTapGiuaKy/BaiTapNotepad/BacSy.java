package BaiTapNotepad;
public class BacSy extends ConNguoi{
	private String codeBacSy;
	private String khoa;
	private String ngayVaoLam;
	private double luong;
	private double phuCap;

	public String getCodeBacSy(){ return codeBacSy;}
	public String getKhoa(){ return khoa;}
	public String getNgayVaoLam(){ return ngayVaoLam;}
	public Double getLuong(){return luong;}
	public Double getPhuCap(){ return phuCap;}
	
	public void setCodeBacSy(String codeBacSy){ this.codeBacSy = codeBacSy;}
	public void setKhoa(String khoa){ this.khoa =  khoa;}
	public void setNgayVaoLam(String ngayVaoLam){ this.ngayVaoLam = ngayVaoLam;}
	public void setLuong(Double luong){this.luong = luong;}
	public void setPhuCap(Double phuCap){ this.phuCap = phuCap;}
}
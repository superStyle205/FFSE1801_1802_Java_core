package HoSoBenhVien;

public class BacSy extends ConNguoi {
	private String ten;
	private double tuoi;
	private String gioiTinh;
	private double CMND;
	private String maBacSy;
	private String khoa;
	private String ngayBatDauVaoLam;
	private double luong;
	private double phuCap;
	public String getTen(){
		return ten;
	}
	public void setTen(String ten){
		this.ten = ten;
	}
	public String getGioiTinh(){
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh){
		this.gioiTinh = gioiTinh;
	}
	public String getMaBacSy(){
		return maBacSy;
	}
	public void setMaBacSy(String maBacSy){
		this.maBacSy = maBacSy;
	}
	public String getKhoa(){
		return khoa;
	}
	public void setKhoa(String khoa){
		this.khoa = khoa;
	}
	public String getNgayBatDauVaoLam(){
		return ngayBatDauVaoLam;
	}
	public void setNgayBatDauVaoLam(String ngayBatDauVaoLam){
		this.ngayBatDauVaoLam = ngayBatDauVaoLam;
	}
	public double getTuoi(){
		return tuoi;
	}
	public void setTuoi(double tuoi){
		this.tuoi = tuoi;
	}
	public double getCMND(){
		return CMND;
	}
	public void setCMND(double CMND){
		this.CMND = CMND;
	}
	public double getLuong(){
		return luong;
	}
	public void setLuong(double luong){
		this.luong = luong;
	}
	public double getPhuCap(){
		return phuCap;
	}
	public void setPhuCap(double phuCap){
		this.phuCap = phuCap;
	}
	public BacSy(String ten, double tuoi,String gioiTinh,double CMND,String maBacSy,String khoa,String ngayBatDauVaoLam,double luong,double phuCap) {
		super(ten,tuoi,gioiTinh,CMND);
		this.maBacSy=maBacSy;
		this.khoa=khoa;
		this.ngayBatDauVaoLam=ngayBatDauVaoLam;
		this.luong=luong;
		this.phuCap=phuCap;
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("mã bác sỹ : " + maBacSy);
		System.out.println("khoa : " + khoa);
		System.out.println("ngày bắt đầu vào làm : " + ngayBatDauVaoLam);
		System.out.println("luong : " + luong);
		System.out.println("phụ cấp : " + phuCap);
	}
}

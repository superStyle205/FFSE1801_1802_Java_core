package quanLiHoSo;

public class BenhNhan extends ConNguoi {
	private String maBN;
	private String benh;
	private String pPChua;
	private String ngayNhapVien;
	private String ngayRaVien;
	private double tien;
	
	public BenhNhan() {

	}
	public BenhNhan(String id, String name, int cmnd, int age, String gioiTinh,String maBN, String benh, 
						String pPChua, String ngayNhapVien, String ngayRaVien,double tien) {
		super(id,name,cmnd,age,gioiTinh);
		this.maBN = maBN;
		this.benh = benh;
		this.pPChua = pPChua;
		this.ngayNhapVien = ngayNhapVien;
		this.ngayRaVien = ngayRaVien;
		this.tien = tien;
	}
	
	public String getMaBN() {
		return maBN;
	}
	public void setMaBN(String maBN) {
		this.maBN = maBN;
	}
	
	public String getBenh() {
		return benh;
	}
	public void setBenh(String benh) {
		this.benh = benh;
	}
	
	public String getpPChua() {
		return pPChua;
	}
	public void setpPChua(String pPChua) {
		this.pPChua = pPChua;
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
	
	public double getTien() {
		return tien;
	}
	public void setTien(double tien) {
		this.tien = tien;
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("mã bệnh nhân :  "+maBN);
		System.out.println("tên bệnh :  "+benh);
		System.out.println("phương pháp chữa :  "+pPChua);
		System.out.println("ngày nhập viện :  "+ngayNhapVien);
		System.out.println("ngày ra viện :  "+ngayRaVien);
		System.out.println("tiền  :  "+tien);
		
		
		
	}

}

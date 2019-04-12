package HoSoBenhVien;

public class BenhNhan extends ConNguoi {
	private String ten;
	private double tuoi;
	private String gioiTinh;
	private double CMND;
	private String maBenhNhan;
	private String benh;
	private String phuongPhapChuaBenh;
	private String ngayNhapVien;
	private String ngayRaVien;
	private double tienThanhToan;
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
	public String getMaBenhNhan(){
		return maBenhNhan;
	}
	public void setMaBenhNhan(String maBenhNhan){
		this.maBenhNhan = maBenhNhan;
	}
	public String getBenh(){
		return benh;
	}
	public void setBenh(String benh){
		this.benh = benh;
	}
	public String getPhuongPhapChuaBenh(){
		return phuongPhapChuaBenh;
	}
	public void setPhuongPhapChuaBenh(String phuongPhapChuaBenh){
		this.phuongPhapChuaBenh = phuongPhapChuaBenh;
	}
	public String getNgayNhapVien(){
		return ngayNhapVien;
	}
	public void setNgayNhapVien(String ngayNhapVien){
		this.ngayNhapVien = ngayNhapVien;
	}
	public String getNgayRaVien(){
		return ngayRaVien;
	}
	public void setNgayRaVien(String ngayRaVien){
		this.ngayRaVien = ngayRaVien;
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
	public double getTienThanhToan(){
		return tienThanhToan;
	}
	public void setTienThanhToan(double tienThanhToan){
		this.tienThanhToan = tienThanhToan;
	}
	public BenhNhan(String ten, double tuoi,String gioiTinh,double CMND,String maBenhNhan,String benh,String phuongPhapChuaBenh,String ngayNhapVien,String ngayRaVien,double tienThanhToan) {
		super(ten,tuoi,gioiTinh,CMND);
		this.maBenhNhan=maBenhNhan;
		this.benh=benh;
		this.phuongPhapChuaBenh=phuongPhapChuaBenh;
		this.ngayNhapVien=ngayNhapVien;
		this.ngayRaVien=ngayRaVien;
		this.tienThanhToan=tienThanhToan;
	}	
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("mã bệnh nhân : " + maBenhNhan);
		System.out.println("bệnh : " + benh);
		System.out.println("phương pháp chữa bệnh : " + phuongPhapChuaBenh);
		System.out.println("ngày nhập viện : " + ngayNhapVien);
		System.out.println("ngày ra viện : " + ngayRaVien);
		System.out.println("tiền thanh toán : " + tienThanhToan);
	}
}

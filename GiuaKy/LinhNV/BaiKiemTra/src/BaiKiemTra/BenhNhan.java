package BaiKiemTra;

public class BenhNhan extends ConNguoi {
	private String maBenhNhan;
	private String benh;
	private String phuongPhapChuaBenh;
	private String ngayNhapVien;
	private String ngayRaVien;
	private double tienThanhToan;
	
	public BenhNhan(String ten, int tuoi, String gioiTinh, int cmnd, String maBenhNhan, String benh, String phuongPhapChuaBenh, String ngayNhapVien, String ngayRaVien, double tienThanhToan) {
		super(ten, tuoi, gioiTinh, cmnd);
		this.maBenhNhan =  maBenhNhan;
		this.benh = benh;
		this.phuongPhapChuaBenh = phuongPhapChuaBenh;
		this.ngayNhapVien = ngayNhapVien;
		this.ngayRaVien = ngayRaVien;
		this.tienThanhToan = tienThanhToan;
	}
	public BenhNhan() {
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
	public double getTienThanhToan() {
		return tienThanhToan;
	}
	public void setTienThanhToan(double tienThanhToan) {
		this.tienThanhToan = tienThanhToan;
	}
	public void xuat() {
		super.xuat();
		System.out.println("Mã bệnh nhân : " + getMaBenhNhan());
		System.out.println("Bệnh : " + getBenh());
		System.out.println("Phương pháp chữa bệnh : " + getPhuongPhapChuaBenh());
		System.out.println("Ngày nhập viện : " + getNgayNhapVien());
		System.out.println("Ngày ra viện : " + getNgayRaVien());
		System.out.println("Tiền thanh toán : " + getTienThanhToan());
	}


}	

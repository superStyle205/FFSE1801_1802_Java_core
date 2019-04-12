package assignment42;

public abstract class SinhVienFPT {
	protected String hoTen;
	protected String nganh;
	private SinhVienBiz svBIZ;
	private SinhVienIT svIT;

	public SinhVienBiz getSvBIZ() {
		return svBIZ;
	}

	public void setSvBIZ(SinhVienBiz svBIZ) {
		this.svBIZ = svBIZ;
	}

	public SinhVienIT getSvIT() {
		return svIT;
	}

	public void setSvIT(SinhVienIT svIT) {
		this.svIT = svIT;
	}

	public SinhVienFPT() {
		//
	}
	
	public SinhVienFPT(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getNganh() {
		return nganh;
	}
	
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	abstract double getDiem();
	public String getHocLuc() {
		if( 5 > getDiem()) {
			return "Yếu";
		}else if( 5 <= getDiem() && getDiem() < 6.5) {
			return "Trung Bình";
		}else if (6.5 <= getDiem() && getDiem() < 7.5) {
			return "Khá";
		}else if(7.5 <= getDiem() && getDiem() < 9) {
			return "Giỏi";
		}else if( 9 <= getDiem() && getDiem() <= 10) {
			return "Xuất Sắc";
		}else {
			return "Điểm không hợp lệ!!";
		}
	}

	public void xuat() {
		System.out.println("Họ Tên: " + getHoTen());
		System.out.println("Ngành: " + getNganh());	
	}
	
	
	
	
	
	
	
}

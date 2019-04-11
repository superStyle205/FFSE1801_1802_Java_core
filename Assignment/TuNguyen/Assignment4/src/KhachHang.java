

public class KhachHang {
	
	
	private String ten;
	private String soNha;
	private String maCongTo;
	
	public KhachHang() {
		
	}
	
	public KhachHang(String ten, String soNha, String maCongTo) {
		super();
		this.ten = ten;
		this.soNha = soNha;
		this.maCongTo = maCongTo;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSoNha() {
		return soNha;
	}

	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}

	public String getMaCongTo() {
		return maCongTo;
	}

	public void setMaCongTo(String maCongTo) {
		this.maCongTo = maCongTo;
	}
	
//	public void xuat() {
//		System.out.println("Tên khách hàng: " + getTen());
//		System.out.println("Địa chỉ nhà: " + getSoNha());
//		System.out.println("Mã công tơ: " + getMaCongTo());
//	}
}

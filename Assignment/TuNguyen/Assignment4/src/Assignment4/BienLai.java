package Assignment4;

public class BienLai extends KhachHang {

	private int chiSoCu;
	private int chiSoMoi;

	
	public BienLai() {
		
	}
	
	public BienLai(String ten, String soNha, String maCongTo, int chiSoCu, int chiSoMoi) {
		super(ten, soNha, maCongTo);
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
	}


	public int getChiSoCu() {
		return chiSoCu;
	}


	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}


	public int getChiSoMoi() {
		return chiSoMoi;
	}


	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}


	public double getTienPhaiTra() {
		return (getChiSoMoi() - getChiSoCu()) * 750;
	}
	
	
	
	


	public String toString() {
		return " Tên: " + getTen() + "\n Số nhà: " + getSoNha() + "\n Mã công tơ: " + getMaCongTo() + "\n Chỉ số cũ: " + chiSoCu + "\n Chỉ số mới: " + chiSoMoi + "\n Số tiền phải trả: " + getTienPhaiTra() + "ngàn VNĐ" + "\n --------------";
	}

//	@Override
//	public void xuat() {
//		super.xuat();
//		System.out.println("Chỉ số cũ: " + getChiSoCu());
//		System.out.println("Chỉ số mới: " + getChiSoMoi());
//		System.out.println("Số tiền phải trả: " + getTienPhaiTra());
//	}
	
}

package BenhVien;

public class BenhNhan extends ConNguoi{	
	private String ngayNhap;
	private String benh;
	private double tienTT;

	public String getNgayNhap(){
		return ngayNhap;
	}
	public String getBenh(){
		return benh;
	}
	public double getTienTT(){
		return tienTT;
	}
	public void setNgayNhap(String ngayNhap){
		this.ngayNhap=ngayNhap;
	}
	public void setBenh(String benh){
		this.benh=benh;
	}
	public void setTienTT(double tienTT){
		this.tienTT=tienTT;
	}

	public BenhNhan(String ten, int tuoi, String ID, String ngayNhap, String benh, double tienTT){
		super(ten, tuoi, ID);
		setNgayNhap(ngayNhap);
		setBenh(benh);
		setTienTT(tienTT);
	}

}
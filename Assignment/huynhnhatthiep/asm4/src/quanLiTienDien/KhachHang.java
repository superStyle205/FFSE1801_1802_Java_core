package quanLiTienDien;

public class KhachHang {
	 private String hoTen;
	 private String soNha;
	  String maSoCongToDien;
 
	
	public KhachHang(String hoTen, String soNha, String maSoCongToDien) {
		super();
		this.hoTen = hoTen;
		this.soNha = soNha;
		
		this.maSoCongToDien = maSoCongToDien;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getSoNha() {
		return soNha;
	}


	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}


	


	public String getMaSoCongToDien() {
		return maSoCongToDien;
	}


	public void setMaSoCongToDien(String maSoCongToDien) {
		this.maSoCongToDien = maSoCongToDien;
	}


	public void xuat() {
		System.out.println("họ ten: "+ hoTen);
		System.out.println("họ ten: "+ soNha);
		System.out.println("họ ten: "+ maSoCongToDien);
	 }

 
}

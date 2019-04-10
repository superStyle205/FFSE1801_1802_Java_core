package quanLiTienDien.model;

public class bienLai extends thongTinKhachHang {
	
	public bienLai() {
		super();
	}
	public bienLai(String hoTen, String diaChi, int maCongTo, int soDienCu, int soDienMoi) {
		super(hoTen,diaChi,maCongTo,soDienCu,soDienMoi);
	}

	public double tinhTienDien() {
		return (this.soDienMoi - this.soDienCu) * 750;
	}
	
	public void xuat() {
		System.out.println("================================");
		System.out.println("Biên lai thu tiền điện");
		System.out.println("Tên: "+this.getHoTen());
		System.out.println("Địa chỉ: "+this.getDiaChi());
		System.out.println("Mã công tơ: "+this.getMaCongTo());
		System.out.println("Số điện cũ: "+this.getSoDienCu());
		System.out.println("Số điện mới: "+this.getSoDienMoi());
		System.out.println("Tiền điện phải trả: "+this.tinhTienDien());
		System.out.println("================================");
	}
}

package Lab4;

public class TruongPhong extends NhanVien {
	private double trachNhiem;
	
	public TruongPhong(String hoTen, double luong, double trachNhiem) {
		super(hoTen, luong);
		this.trachNhiem = trachNhiem;
	}
	public double getThuNhap() {
		return getLuong() * 12 + trachNhiem * 12;
	}
	public void xuat() {
		super.xuat();
		System.out.println("tiền trách nhiệm " + trachNhiem);
		System.out.println("Thu nhập " + getThuNhap());

	}
}

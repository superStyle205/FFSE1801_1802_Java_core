package Lab4;

public class LaoCong extends NhanVien {
	private int soGioLamViec;
	public LaoCong(String hoTen, double luong, int soGioLamViec) {
		super(hoTen, luong);
		this.soGioLamViec = soGioLamViec;
	}
	public double getThuNhap() {
		return getLuong() * soGioLamViec;
	}
	public void xuat() {
		super.xuat();
		System.out.println("Số giờ làm việc " + soGioLamViec);
		System.out.println("Thu nhập " + getThuNhap());

	}
}

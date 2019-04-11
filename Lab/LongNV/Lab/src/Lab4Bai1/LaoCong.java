package Lab4Bai1;

public class LaoCong extends NhanVien {
	private int soGioLamViec;

	
	public LaoCong() {
		setTenJob("Lao Công");
	}

	public int getSoGioLamViec() {
		return soGioLamViec;
	}

	public void setSoGioLamViec(int soGioLamViec) {
		this.soGioLamViec = soGioLamViec;
	}
	
	
	public double ThuNhap() {
		return getLuong()*12 + (getLuong()/(24*8))*soGioLamViec ;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Số giờ làm \t:" + this.getSoGioLamViec());
		System.out.println("Thu nhập \t:" + this.ThuNhap());
	}
	
}

package Lab4Bai1;

public class TruongPhong extends NhanVien{
	private int TrachNhiem;

	public TruongPhong() {
		setTenJob("Trưởng Phòng");
	}
	
	public int getTrachNhiem() {
		return TrachNhiem;
	}

	public void setTrachNhiem(int trachNhiem) {
		TrachNhiem = trachNhiem;
	}

	public double ThuNhap() {
		return getLuong()*12 + TrachNhiem*12 ;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Tiền t/n \t:" + this.getTrachNhiem());
		System.out.println("Thu nhập \t:" + this.ThuNhap());
	}

}


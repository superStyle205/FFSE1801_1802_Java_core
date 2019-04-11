package lab4.bai2;

public class Vuong extends ChuNhat {

	public Vuong(double canh) {
		super(canh, canh);
	}

	public void xuat() {
		System.out.println("Hinh vuong:");
		System.out.println("Canh : " + getChieuDai());
		System.out.println("Dien tich : " + getDienTich());
		System.out.println("chu vi : " + getChuVi());
	}

	public static void main(String[] args) {
		ChuNhat chuNhat = new ChuNhat(4, 3);
		chuNhat.xuat();
		chuNhat = new Vuong(5);
		chuNhat.xuat();
	}
}

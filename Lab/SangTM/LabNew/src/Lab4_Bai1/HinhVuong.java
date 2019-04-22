package Lab4_Bai1;

public class HinhVuong extends HinhChuNhat{
	private int canh;

	public HinhVuong(int canh) {
		this.canh = canh;
	}
	
	@Override
	public void xuat() {
		System.err.println("~~~~~ Hình vuông ~~~~~");
		System.err.println("Cạnh: " + canh);
		System.err.println("Diện tích: " + getDienTich());
	}
	
	@Override
	public int getDienTich() {
		return (int) Math.pow(canh, 3);
	}
}

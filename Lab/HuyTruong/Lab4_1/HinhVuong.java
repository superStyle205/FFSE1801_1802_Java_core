package lab4model;

public class HinhVuong extends ChuNhat {
	private double canh;

	public HinhVuong() {
		super();
	}
	
	public HinhVuong(double canh) {
		super(canh, canh);
		this.canh = canh;
	}
	public double getCanh() {
		return canh;
	}
	/*public void setCanh(double canh) {
		this.canh = canh;
	}*/
	@Override
	public void xuat() {
		System.out.println("Cạnh hình vuông là: " + getCanh());
		System.out.println("Diện tích hình vuông: " + getDienTich());
		System.out.println("Chu vi hình vuông là: " + getChuVi());
	}
	public void xuat1() {
		System.out.println("xin chào");
	}
}

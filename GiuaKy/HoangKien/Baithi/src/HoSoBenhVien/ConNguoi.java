package HoSoBenhVien;

abstract public class ConNguoi {
	private String ten;
	private double tuoi;
	private String gioiTinh;
	private double CMND;
	public ConNguoi(String ten, double tuoi,String gioiTinh,double CMND) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh=gioiTinh;
		this.CMND=CMND;
		}
	public void xuat() {
		System.out.println("tên : " + ten);
		System.out.println("tuổi : " + tuoi);
		System.out.println("giới tính : " +gioiTinh);
		System.out.println("số CMND : " +CMND);
	}
}

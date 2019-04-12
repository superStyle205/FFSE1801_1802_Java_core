import java.util.Scanner;

public class SanPham {
	private static String tenSP;
	private static double gia;
	private static double giamGia;

	private double getThueNhapKhau() {
		return gia * 10 / 100;
	}
	
	public SanPham(String tenSP, double gia, double giamGia) {
		this.tenSP = tenSP;
		this.gia = gia;
		this.giamGia = giamGia;
	}
	public SanPham(String tenSP, double gia) {
		this(tenSP, gia, 0);
	}
	
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print(">> Ten Sp: ");
		this.tenSP = sc.nextLine();
		
		System.out.print(">> Gia sp ");
		this.gia = sc.nextDouble();
		
		System.out.print(">> Giam gia ");
		this.giamGia = sc.nextDouble();
	}
	
	

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	void xuat() {
		System.out.println(" Ten sp: " + tenSP + " gia sp " + gia + "giam gia" + giamGia +"%");
	}
	public static void main(String[] args) {
		SanPham sp1 = new SanPham(tenSP, gia);
		sp1.nhap();
		sp1.xuat();
		System.out.println(" Thue nhap khau " + sp1.getThueNhapKhau());
		SanPham sp2 = new SanPham(tenSP, gia, giamGia);
		sp2.nhap();
		sp2.xuat();
		System.out.println(" Thue nhap khau " + sp2.getThueNhapKhau());
	}
}

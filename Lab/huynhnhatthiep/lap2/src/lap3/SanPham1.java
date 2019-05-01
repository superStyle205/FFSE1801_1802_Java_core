package lap3;

import java.util.Scanner;

public class SanPham1 {
	
	private String sanPham;
	private String tenSP;
	private double donGia;
	private double giamGia;
	
	 public SanPham1() {
			super();
	 }
	
  public SanPham1(String sanPham, String tenSP, double donGia, double giamGia) {
		
		this.sanPham = sanPham;
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
  

	public String getSanPham() {
		return sanPham;
	}
	
	public void setSanPham(String sanPham) {
		this.sanPham = sanPham;
	}
	
	public String getTenSP() {
		return tenSP;
	}
	
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	
	public double getDonGia() {
		return donGia;
	}
	
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public double getGiamGia() {
		return giamGia;
	}
	
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	//			 --------------------------
	  public void input () {
				Scanner scanner = new Scanner(System.in);
				System.out.print("dfgInput name sp :");
				this.tenSP = scanner.nextLine();	
				System.out.print("Input đơn giá :");
				this.donGia = scanner.nextDouble();
				System.out.print("Input giảm giá  :");
				this.giamGia = scanner.nextDouble();
		    }
		public double getThueNhapKhau() {
			 return (donGia*10)/100;
		 }
		public double tongTien() {
			 return  (this.donGia - this.getThueNhapKhau());
		 }
		public void output() { 
			 System.out.println("Input name sp "+tenSP+ ".....Input đơn giá"+donGia+ ".....Input giảm giá" +giamGia);
		 }
		

}

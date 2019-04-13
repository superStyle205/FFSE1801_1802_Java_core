package lap3;
import java.util.Scanner;
public class SanPham2 {
	String tenSP;
	double donGia, giamGia;	
	
	public SanPham2() {
		
	}
	public SanPham2(String tenSp, double donGia, double giamGia) {
		this.tenSP = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public void input () {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Input name sp :");
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

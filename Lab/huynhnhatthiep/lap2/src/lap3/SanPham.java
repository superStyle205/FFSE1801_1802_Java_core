package lap3;

import java.util.Scanner;

import lap3.SanPham2;

public class SanPham {
	String tenSP;
	double donGia, giamGia;

	 void input () {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Input name sp :");
			this.tenSP = scanner.nextLine();	
			System.out.print("Input đơn giá :");
			this.donGia = scanner.nextDouble();
			System.out.print("Input giảm giá  :");
			this.giamGia = scanner.nextDouble();
	    }		
	 void output() { 
		 System.out.println(".....Input đơn giá"+donGia+ ".....Input giảm giá" +giamGia);
	 }
	 public static void main(String[] args) {
		 SanPham2 SP1 = new SanPham2();
		 SP1.input();
		 SP1.output();
		 System.out.println(" thuế nhập khẩu :"+SP1.getThueNhapKhau());
//		 =============================================
		 SanPham2 SP2 = new SanPham2();
		 SP2.input();
		 SP2.output();
		 System.out.println(" thuế nhập khẩu :"+SP1.getThueNhapKhau());
	 }
	
}

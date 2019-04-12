package lap3;

public class QuanLiSP {
	public static void main(String[] args) {
//		SẢN PHẨM (CLASS SanPham)
		SanPham2 SP1 = new SanPham2();
		SP1.input();
		SP1.output();
		System.out.println(" thuế nhập khẩu :"+SP1.getThueNhapKhau());
		System.out.println(" tổng tiền :"+SP1.tongTien());
//		SẢN PHẨM (CLASS SanPham1)
		SanPham1 SP2 = new SanPham1();
		SP2.input();
		SP2.output();
		System.out.println(" thuế nhập khẩu :"+SP2.getThueNhapKhau());
		System.out.println(" tổng tiền :"+SP2.tongTien());
	}	
}

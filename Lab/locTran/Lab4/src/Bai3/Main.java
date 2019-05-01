package Bai3;

public class Main {

	public static void main(String[] args) {

		SinhVienFpt svIT1 = new SinhVienIT("Trần Dức Lộc",5,7,2);
		SinhVienFpt svIT2 = new SinhVienIT("Trịnh Minh Sang",9,8,9);

		SinhVienFpt svBiz1 = new SinhVienBiz("Trương Phục Hưng",9,7);
		SinhVienFpt svBiz2 = new SinhVienBiz("Nguyễn Văn Linh",10,10);

		svIT1.show();
		svIT2.show();

		svBiz1.show();
		svBiz2.show();
	}
}
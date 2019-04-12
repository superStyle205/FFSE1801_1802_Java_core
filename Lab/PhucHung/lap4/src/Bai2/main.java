package Bai2;

public class main {
	public static void main(String[] args) {
		SinhVienFpt sFpt = new SinhVienFpt("hung","IT") {

			@Override
			public double getDiem() {
				
				return 0;
			}
		};
		sFpt.xuat();
	}
}

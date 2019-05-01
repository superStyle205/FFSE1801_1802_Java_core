package Lab4BaiTap;

public class mainSvFpt {
	public static void main(String[] args) {
		SinhVienFpt SV1 = new SinhVienIT("a", "Sinh viên IT", 5.6, 6.7, 7.8);
		SV1.xuat();
		
		SinhVienFpt SV2 = new SinhVienBiz("b", "Sinh viên Biz", 4.5, 5.6);
		SV2.xuat();
	}
}

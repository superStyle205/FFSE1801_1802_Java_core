package Lab4;

public class mainAbs {
	public static void main(String[] asrg) {
		System.out.println("Sinh viên IT");
		SinhVienIT sv1 = new SinhVienIT(5.7, 7.9);
		System.out.println(sv1.getDiemTB());
		
		System.out.println("Sinh viên Biz");
		SinhVienBiz sv2 = new SinhVienBiz(5.7, 7.9, 7.1);
		System.out.println(sv2.getDiemTB());
	}
}

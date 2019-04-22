package Lab2;
import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
		Scanner so = new Scanner(System.in);
		Scanner chu = new Scanner(System.in);
		
		System.err.println("Vui lòng nhập thông tin h�?c sinh");
		System.out.println("H�? và tên");
		String ten = chu.nextLine();
		
		System.out.println("�?iểm trung bình");
		float diem ;
		diem = so.nextFloat();
	
		
		if (diem >= 0.0 && diem <= 10.0) {
			System.err.println("H�? tên sinh viên : " + ten );
			System.err.println("�?iểm của sinh viên : " + diem );
			if (diem < 5.0) {
				String hocLuc = "Ngu như bò";
				System.err.println("Xếp loại : " + hocLuc );
			} else if (diem <= 6.5) {
				String hocLuc = "Con ngư�?i";
				System.err.println("Xếp loại : " + hocLuc );
			} else if (diem <= 7.5) {
				String hocLuc = "Thần đồng";
				System.err.println("Xếp loại : " + hocLuc );
			} else if (diem <= 9.0) {
				String hocLuc = "Phật tổ như lai";
				System.err.println("Xếp loại : " + hocLuc );
			} else {
				String hocLuc = "Ngư�?i ngoài hành tinh -- V�? với hành tinh của ngư�?i ";
				System.err.println("Xếp loại : " + hocLuc );
			}
		} else {
			System.err.println("Vui lòng nhập lại!" );
		}
	}
}

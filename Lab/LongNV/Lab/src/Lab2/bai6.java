package Lab2;
import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
		Scanner so = new Scanner(System.in);
		Scanner chu = new Scanner(System.in);
		
		System.err.println("Vui lòng nhập thông tin học sinh");
		System.out.println("Họ và tên");
		String ten = chu.nextLine();
		
		System.out.println("Điểm trung bình");
		float diem ;
		diem = so.nextFloat();
	
		
		if (diem >= 0.0 && diem <= 10.0) {
			System.err.println("Họ tên sinh viên : " + ten );
			System.err.println("Điểm của sinh viên : " + diem );
			if (diem < 5.0) {
				String hocLuc = "Ngu như bò";
				System.err.println("Xếp loại : " + hocLuc );
			} else if (diem <= 6.5) {
				String hocLuc = "Con người";
				System.err.println("Xếp loại : " + hocLuc );
			} else if (diem <= 7.5) {
				String hocLuc = "Thần đồng";
				System.err.println("Xếp loại : " + hocLuc );
			} else if (diem <= 9.0) {
				String hocLuc = "Phật tổ như lai";
				System.err.println("Xếp loại : " + hocLuc );
			} else {
				String hocLuc = "Người ngoài hành tinh -- Về với hành tinh của người ";
				System.err.println("Xếp loại : " + hocLuc );
			}
		} else {
			System.err.println("Vui lòng nhập lại!" );
		}
	}
}

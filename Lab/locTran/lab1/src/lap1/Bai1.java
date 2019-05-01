package lap1;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
		Scanner chu = new Scanner(System.in);
		Scanner so = new Scanner(System.in);
		
		System.out.println("Nhập tên sinh viên :");
		String ten = chu.nextLine();
		
		System.out.println("Nhập điểm trung bình");
		int diem = so.nextInt();
		
		System.out.printf("Tên Sinh viên : %s điểm Trung bình là :  %d" , ten , diem );
		
		
	}
}

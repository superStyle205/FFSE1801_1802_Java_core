package Lab1;
import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		Scanner chu = new Scanner(System.in);
		Scanner so = new Scanner(System.in);
		
		System.out.println("Nhập tên sinh viên :");
		String ten = chu.nextLine();
		
		System.out.println("Nhập điểm trung bình");
		int diem = so.nextInt();
		
		System.out.printf("Tên sinh viên : %s có điểm trung bình là %d" , ten , diem );
		
		
	}
}

package Lap1;
import java.util.Scanner;

public class nhapTenVaDiem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Moi nhap ten:");
		String name = scan.nextLine();
		System.out.println("Moi nhap diem toan:");
		int diemtoan = scan.nextInt();
		System.out.println("Moi nhap diem ly:");
		int diemly = scan.nextInt();
		System.out.println("Moi nhap diem hoa:");
		int diemhoa = scan.nextInt();
		double diemTrungBinh = (diemtoan + diemly + diemhoa) / 3;
		System.out.printf("Ban %s cos diem trung binh la %f", name, diemTrungBinh);
	}
}

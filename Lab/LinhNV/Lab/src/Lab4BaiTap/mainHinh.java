package Lab4BaiTap;
import java.util.Scanner;
public class mainHinh {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Hình chữ nhật");
		HinhChuNhat chunhat = new HinhChuNhat(5.4 , 6.7);
		chunhat.xuat();
		
		System.out.println("Hình vuông");
		HinhVuong hinhvuong = new HinhVuong(5.4);
		hinhvuong.xuat();
		
		System.out.println("Hình tròn");
		HinhTron hinhtron = new HinhTron(5.4);
		hinhtron.xuat();
	}
	
}

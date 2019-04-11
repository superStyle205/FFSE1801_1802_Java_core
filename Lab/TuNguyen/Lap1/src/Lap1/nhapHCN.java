package Lap1;
import java.util.Scanner;

public class nhapHCN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Moi nhap chieu rong");
		int chieuRong = scan.nextInt();
		System.out.println("Moi nhap chieu dai:");
		int chieuDai = scan.nextInt();
		System.out.println("Dien tich la:" + (chieuRong*chieuDai));
		System.out.println("chu vi la:" + ((chieuRong*chieuDai)*2));
		System.out.println("Canh nho nhat la:" + (Math.min(chieuRong, chieuDai)));
		}
}

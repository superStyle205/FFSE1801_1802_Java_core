package Lap3;
import java.util.Scanner;

public class Bai1Lap3 {
	String TenSP;
	int SL;
	double donGia;
	double GiamGia;
	public Bai1Lap3() {
		
	}
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ten San Pham:");
		TenSP = scan.nextLine();
		System.out.println("So Luong:");
		SL = scan.nextInt();
		System.out.println("Don gia:");
		donGia = scan.nextDouble();
		System.out.println("Giam gia:");
		GiamGia = scan.nextDouble();;
	}
	void output() {
		System.out.println("San pham: " + TenSP + " ---- So Luong: " + SL + " ---- Don gia: " + donGia + " ---- Giam gia: " + GiamGia);
	}
	double ThueNhapKhau() {
		return (donGia / 100 * 10);
	}
	double TongTien() {
		return ((donGia * SL)+ ThueNhapKhau() - GiamGia);
	}
	public static void main(String[] args) {
		Bai1Lap3 demo = new Bai1Lap3();
		demo.input();
		demo.output();
		System.out.println("Tien thue: " + demo.ThueNhapKhau());
		System.out.println("Tong tien: " + demo.TongTien());

	}
}

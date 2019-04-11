package Lap3;
import java.util.Scanner;

public class BT2Lap3 {

	String TenSP;
	int SL;
	double donGia;
	double GiamGia;
	public BT2Lap3() {
		
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
		System.out.println("San pham: " + TenSP +"\n"+ "So Luong: " + SL +"\n"+ "Don gia: " + donGia +"\n"+ "Giam gia: " + GiamGia);
	}
	double ThueNhapKhau() {
		return (donGia / 100 * 10);
	}
	double TongTien() {
		return ((donGia * SL)+ ThueNhapKhau() - GiamGia);
	}
	public static void main(String[] args) {
		BT2Lap3 demo = new BT2Lap3();
		demo.input();
		demo.output();
		System.out.println("Tien thue: " + demo.ThueNhapKhau());
		System.out.println("Tong tien: " + demo.TongTien());
		
		BT2Lap3 demo1 = new BT2Lap3();
		demo1.input();
		demo1.output();
		System.out.println("Tien thue: " + demo1.ThueNhapKhau());
		System.out.println("Tong tien: " + demo1.TongTien());

	}

}

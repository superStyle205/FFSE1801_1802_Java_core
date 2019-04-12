package Lap4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		HCN abc = new HCN();
//		abc.setChieuDai(20);
//		abc.setChieuRong(10);
//		abc.xuat();
//	
//		HV hv = new HV();
//		hv.setCanh(15);
//		hv.xuat();
		System.out.println("Nhap Chieu Dai:");
		double CD = new Scanner(System.in).nextDouble();
		System.out.println("Nhap chieu rong:");
		double CR = new Scanner(System.in).nextDouble();
		HCN S = new HCN(CD, CR);
		S.xuat();
		
		System.out.println("Nhap Canh:");
		double canh = new Scanner(System.in).nextDouble();
		HV SH = new HV(canh);
		SH.xuat();
	
}
}

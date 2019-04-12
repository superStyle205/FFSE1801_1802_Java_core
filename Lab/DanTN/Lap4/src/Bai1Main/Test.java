package Bai1Main;

import Bai1.ChuNhat;
import Bai1.Vuong;

public class Test {
	public static void main(String[] args) {
		ChuNhat hcn1 = new ChuNhat();
		hcn1.nhap();
		hcn1.xuat();
		System.out.println();
		ChuNhat hcn2 = new ChuNhat();
		hcn2.nhap();
		hcn2.xuat();
		System.out.println();
		ChuNhat hv = new Vuong();
		hv.nhap();
		hv.xuat();
	}
}

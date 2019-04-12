package Lab1;

import java.util.Scanner;

public class Lab1Bai2 {
	public static void main(String[] args) {
		Scanner doDai = new Scanner(System.in);
		System.out.println("Nhập chiều dài HCN");
		Double chieuDai = doDai.nextDouble();
		
		System.out.println("Nhập chiều rộng HCN");
		Double chieuRong = doDai.nextDouble();
		
		System.out.println("Chu vi HCN là : " + ((chieuDai + chieuRong) * 2));
		
		System.out.println("Diện tích HCN là : " + (chieuDai * chieuRong));
		
		System.out.println("Cạnh nhỏ nhất của HCN là : " + Math.min(chieuDai,chieuRong));
	}
}

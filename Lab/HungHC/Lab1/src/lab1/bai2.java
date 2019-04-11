package lab1;

import java.util.Scanner;

public class bai2 {
	static Scanner scanner = new Scanner(System.in);
	 public static void main(String[] args) {
		 System.out.print("Chiều dài: ");
		 double chieuDai = scanner.nextDouble();
		 System.out.print("Chiều rộng: "); 
		 double chieuRong = scanner.nextDouble();
		 double chuVi = (chieuDai + chieuRong )*2;
		 double dienTich = chieuDai * chieuRong;
		 double canhNN = Math.min(chieuDai, chieuRong);
		 System.out.printf("Chu vi của hình chữ nhật là %.0f %n Diện tích của hcn là %.0f %n Cạnh nn của hcn là %.0f %n",chuVi,dienTich,canhNN);
}
}
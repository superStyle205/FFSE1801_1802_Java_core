package Lap2;
import java.util.Scanner;
import java.util.Arrays;

public class xapXepHS {
	public static void main(String[] args) {
		String ten[] = new String[5];
		double diem[] = new double[5];
		
		ten[0] = "Tu";
		diem[0] = 10;
		
		ten[1] = "Van";
		diem[1] = 10;
		
		ten[2] = "a";
		diem[2] = 8;
		
		ten[3] = "b";
		diem[3] = 7;
		
		ten[4] = "c";
		diem[4] = 6;
		
		
		for (String i : ten) {
			for (double j : diem ) {
				if (j < 5) {
					System.out.println("Hoc sinh " + i + "co diem trung binh: " + j + "Xep loai yeu");
				}
				else	if (5 >= j && j < 6.5) {
					System.out.println("Hoc sinh " + i + "co diem trung binh : " + j + "Xep loai trung binh");
				}
				else	if (6.5 >= j && j < 8) {
					System.out.println("Hoc sinh " + i + "co diem trung binh :" + j + "Xep loai kha");
				}
				else	if (8 >= j && j < 9) {
					System.out.println("Hoc sinh " + i + "co diem trung binh :" + j + "Xep loai trung gioi");
				}
				else	if (9 >= j && j < 10) {
					System.out.println("Hoc sinh " + i + "co diem trung binh :" + j + "Xep loai xuat sac");
				}
				else {
					System.out.println("Khong co ket qua");
				}
			}

		}
		
	}
}

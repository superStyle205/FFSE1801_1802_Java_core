package lab2;

import java.util.Scanner;

public class bai6 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập số lượng học sinh:");
			int soLuong = sc.nextInt();
			String[] hoTen = new String[100];
			double[] diem = new double[100];
			String[] hocLuc = new String[100];
			for (int i = 0; i < soLuong; i++) {
				System.out.printf("Nhập tên học sinh thứ %d:%n", i + 1);
				sc.nextLine();
				hoTen[i] = sc.nextLine();
				System.out.println("Nhập điểm");
				diem[i] = sc.nextDouble();
				if (diem[i] < 5) {
					hocLuc[i] = "Yếu";
				} else if (diem[i] >= 5 && diem[i] < 6.5) {
					hocLuc[i] = "Trung bình";
				} else if (diem[i] >= 6.5 && diem[i] < 7.5) {
					hocLuc[i] = "Khá";
				} else if (diem[i] >= 7.5 && diem[i] < 9) {
					hocLuc[i] = "Giỏi";
				} else {
					hocLuc[i] = "Xuất sắc";
				}
			}
			double temp;
			String temp2;
			for (int i = 0; i < soLuong - 1; i++) {
				for (int j = i + 1; j < soLuong; j++) {
					if (diem[i] > diem[j]) {
						temp = diem[j];
						diem[j] = diem[i];
						diem[i] = temp;
						temp2 = hoTen[j];
						hoTen[j] = hoTen[i];
						hoTen[i] = temp2;
						temp2 = hocLuc[j];
						hocLuc[j] = hocLuc[i];
						hocLuc[i] = temp2;
					}
				}
			}
			System.out.println();
			System.out.println("Tên:	Điểm:	Học Lực:");
			for (int f = 0; f < soLuong; f++) {
				System.out.print(hoTen[f] + "	");
				System.out.print(diem[f] + "	");
				System.out.println(hocLuc[f]);
			}
		}
	}


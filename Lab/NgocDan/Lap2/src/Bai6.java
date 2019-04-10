import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng học sinh:");
		int soLuong = scanner.nextInt();
		String[] hoTen = new String[100];
		double[] diem = new double[100];
		String[] hocLuc = new String[100];
		for (int i = 0; i < soLuong; i++) {
			System.out.printf("Nhập tên học sinh thứ %d:%n", i + 1);
			scanner.nextLine();
			hoTen[i] = scanner.nextLine();
			System.out.println("Nhập điểm");
			diem[i] = scanner.nextDouble();
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
		double tam;
		String tam2;
		for (int i = 0; i < soLuong - 1; i++) {
			for (int j = i + 1; j < soLuong; j++) {
				if (diem[i] > diem[j]) {
					tam = diem[j];
					diem[j] = diem[i];
					diem[i] = tam;
					tam2 = hoTen[j];
					hoTen[j] = hoTen[i];
					hoTen[i] = tam2;
					tam2 = hocLuc[j];
					hocLuc[j] = hocLuc[i];
					hocLuc[i] = tam2;
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

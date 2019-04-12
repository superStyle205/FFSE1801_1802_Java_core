package assignment2;

import java.util.Scanner;

public class Task1 {
	private String soHangNghin;
	private String soHangTram;
	private String soHangChuc;
	private String soHangDonVi;
	public static void main(String[] args) {
		Scanner so = new Scanner(System.in);
		// Nhập giá trị cần chuyển đổi
		System.out.println("Nhập số : ");
		String soNhap = so.nextLine();

		// Chuyển chuổi mới nhập sang mảng(kiểu string)
		char[] mangStNhap = soNhap.toCharArray();
		int[] mangIntNhap = new int[mangStNhap.length];
		for (int i = 0; i < mangStNhap.length; i++) {
			mangIntNhap[i] = (int) mangStNhap[i] - '0';
		}

		

		if (soNhap.length() > 4 || soNhap.length() == 0) {
			System.err.println("Vui lòng nhập từ 0 -> 9999");
		} else {
			// tạo 1 biến để xét các giá trị của hàm trong switch
			int aaa = 0;
			int bbb = 1;
			int ccc = 2;
			int ddd = 3;
			if (soNhap.length() == 4) {
				hangNghin(mangIntNhap, aaa);
				hangTram(mangIntNhap, bbb);
				hangChuc(mangIntNhap, ccc);
				hangDonVi(mangIntNhap, ddd);
			} else if (soNhap.length() == 3) {
				hangTram(mangIntNhap, aaa);
				hangChuc(mangIntNhap, bbb);
				hangDonVi(mangIntNhap, ccc);
			} else if (soNhap.length() == 2) {
				hangChuc(mangIntNhap, aaa);
				hangDonVi(mangIntNhap, bbb);
			} else if (soNhap.length() == 1) {
				if (soNhap.equals("0")) {
					System.out.println("Không");
				} else {
					hangDonVi(mangIntNhap, aaa);
				}

			}
		}

	}

	public static void hangNghin(int hihi[], int i) {
		switch (hihi[i]) {
		case 9:
			String soHangNghin = "Chín nghìn ";
			System.out.print(soHangNghin);
			break;
		case 8:
			soHangNghin = "Tám nghìn ";
			System.out.print(soHangNghin);
			break;
		case 7:
			soHangNghin = "Bảy nghìn ";
			System.out.print(soHangNghin);
			break;
		case 6:
			soHangNghin = "Sáu nghìn ";
			System.out.print(soHangNghin);
			break;
		case 5:
			soHangNghin = "Năm nghìn ";
			System.out.print(soHangNghin);
			break;
		case 4:
			soHangNghin = "Bốn nghìn ";
			System.out.print(soHangNghin);
			break;
		case 3:
			soHangNghin = "Ba nghìn ";
			System.out.print(soHangNghin);
			break;
		case 2:
			soHangNghin = "Hai nghìn ";
			System.out.print(soHangNghin);
			break;
		case 1:
			soHangNghin = "Một nghìn ";
			System.out.print(soHangNghin);
			break;
		case 0:
			soHangNghin = "Không nghìn ";
			System.out.print(soHangNghin);
			break;

		default:
			System.out.println("Vui lòng nhập lại!");
			break;

		}
	}

	public static void hangTram(int hihi[], int i) {
		switch (hihi[i]) {
		case 9:
			String soHangTram = "Chín trăm ";
			System.out.print(soHangTram);
			break;
		case 8:
			soHangTram = "Tám trăm ";
			System.out.print(soHangTram);
			break;
		case 7:
			soHangTram = "Bảy trăm ";
			System.out.print(soHangTram);
			break;
		case 6:
			soHangTram = "Sáu trăm ";
			System.out.print(soHangTram);
			break;
		case 5:
			soHangTram = "Năm trăm ";
			System.out.print(soHangTram);
			break;
		case 4:
			soHangTram = "Bốn trăm ";
			System.out.print(soHangTram);
			break;
		case 3:
			soHangTram = "Ba trăm ";
			System.out.print(soHangTram);
			break;
		case 2:
			soHangTram = "Hai trăm ";
			System.out.print(soHangTram);
			break;
		case 1:
			soHangTram = "Một trăm ";
			System.out.print(soHangTram);
			break;
		case 0:
			soHangTram = "Không trăm ";
			System.out.print(soHangTram);
			break;

		default:
			System.out.println("Vui lòng nhập lại!");
			break;

		}
	}

	public static void hangChuc(int hihi[], int i) {
		switch (hihi[i]) {
		case 9:
			String soHangChuc = "Chín mươi ";
			System.out.print(soHangChuc);
			break;
		case 8:
			soHangChuc = "Tám mươi ";
			System.out.print(soHangChuc);
			break;
		case 7:
			soHangChuc = "Bảy mươi ";
			System.out.print(soHangChuc);
			break;
		case 6:
			soHangChuc = "Sáu mươi ";
			System.out.print(soHangChuc);
			break;
		case 5:
			soHangChuc = "Năm mươi ";
			System.out.print(soHangChuc);
			break;
		case 4:
			soHangChuc = "Bốn mươi ";
			System.out.print(soHangChuc);
			break;
		case 3:
			soHangChuc = "Ba mươi ";
			System.out.print(soHangChuc);
			break;
		case 2:
			soHangChuc = "Hai mươi ";
			System.out.print(soHangChuc);
			break;
		case 1:
			soHangChuc = "Mười ";
			System.out.print(soHangChuc);
			break;
		case 0:
			soHangChuc = "lẻ ";
			System.out.print(soHangChuc);
			break;

		default:
			System.out.println("Vui lòng nhập lại!");
			break;

		}
	}

	public static void hangDonVi(int hihi[], int i) {
		switch (hihi[i]) {
		case 9:
			String soHangDonVi = "Chín   ";
			System.out.print(soHangDonVi);
			break;
		case 8:
			soHangDonVi = "Tám   ";
			System.out.print(soHangDonVi);
			break;
		case 7:
			soHangDonVi = "Bảy   ";
			System.out.print(soHangDonVi);
			break;
		case 6:
			soHangDonVi = "Sáu   ";
			System.out.print(soHangDonVi);
			break;
		case 5:
			soHangDonVi = "Năm   ";
			System.out.print(soHangDonVi);
			break;
		case 4:
			soHangDonVi = "Bốn   ";
			System.out.print(soHangDonVi);
			break;
		case 3:
			soHangDonVi = "Ba   ";
			System.out.print(soHangDonVi);
			break;
		case 2:
			soHangDonVi = "Hai   ";
			System.out.print(soHangDonVi);
			break;
		case 1:
			soHangDonVi = "Một   ";
			System.out.print(soHangDonVi);
			break;
		case 0:
			soHangDonVi = "   ";
			System.out.print(soHangDonVi);
			break;

		default:
			System.out.println("Vui lòng nhập lại!");
			break;

		}
	}

}

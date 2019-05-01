package assignment2;
	import java.util.Scanner;
	public class NhapChuoiSo {
		public static void main(String[] args) {
			Scanner so = new Scanner(System.in);
			
			System.out.println("nhập số: ");
			String soNhap = so.nextLine();

			
			char[] mangStNhap = soNhap.toCharArray();

	
			int[] mangIntNhap = new int[mangStNhap.length];
			for (int i = 0; i < mangStNhap.length; i++){
				mangIntNhap[i] = (int)mangStNhap[i]-'0';
			} 


			System.out.println("độ dài : " + soNhap.length());


			String soHangNghin ;
			String soHangTram ;
			String soHangChuc ;
			String soHangDonVi ;



			if (soNhap.length() > 4 || soNhap.length() == 0) {
				System.err.println("vui lòng nhập từ 0 ->> 9999");
			} else {
				
				int aaa = 0;
				int bbb = 1;
				int ccc = 2;
				int ddd = 3;
				if (soNhap.length() == 4) {
					hangNghin(mangIntNhap,aaa);
					hangTram(mangIntNhap,bbb);
					hangChuc(mangIntNhap,ccc);
					hangDonVi(mangIntNhap,ddd);
				} else if (soNhap.length() == 3) {
					hangTram(mangIntNhap,aaa);
					hangChuc(mangIntNhap,bbb);
					hangDonVi(mangIntNhap,ccc);
				} else if (soNhap.length() == 2) {
					hangChuc(mangIntNhap,aaa);
					hangDonVi(mangIntNhap,bbb);
				} else if (soNhap.length() == 1){
					if(soNhap.equals("0")) {
						System.out.println("Không");
					}else {
						hangDonVi(mangIntNhap,aaa);
					}
					
				}
			}

		}

		public static void hangNghin(int hihi[],int i) {
			switch (hihi[i]) {
			case 9:
				String soHangNghin = "Chín Nghìn ";
				System.out.print(soHangNghin);
				break;
			case 8:
				soHangNghin = "Tám Nghìn ";
				System.out.print(soHangNghin);
				break;
			case 7:
				soHangNghin = "Bảy Nghìn ";
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
				soHangNghin = "Một Nghìn ";
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
		public static void hangTram(int hihi[],int i) {
			switch (hihi[i]) {
			case 9:
				String soHangTram = "chín Trăm ";
				System.out.print(soHangTram);
				break;
			case 8:
				soHangTram = "Tám Trăm";
				System.out.print(soHangTram);
				break;
			case 7:
				soHangTram = "Bảy Trăm ";
				System.out.print(soHangTram);
				break;
			case 6:
				soHangTram = "Sáu Trăm ";
				System.out.print(soHangTram);
				break;
			case 5:
				soHangTram = "Năm Trăm ";
				System.out.print(soHangTram);
				break;
			case 4:
				soHangTram = "Bốn Trăm ";
				System.out.print(soHangTram);
				break;
			case 3:
				soHangTram = "Ba Trăm ";
				System.out.print(soHangTram);
				break;
			case 2:
				soHangTram = "Hai Trăm ";
				System.out.print(soHangTram);
				break;
			case 1:
				soHangTram = "Một Trăm ";
				System.out.print(soHangTram);
				break;
			case 0:
				soHangTram = "Không Trăm ";
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
				String soHangChuc = "chín mươi ";
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
				soHangChuc = "mười ";
				System.out.print(soHangChuc);
				break;
			case 0:
				soHangChuc = "lẻ ";
				System.out.print(soHangChuc);
				break;

			default:
				System.out.println("Vui lòng nhập lại");
				break;

			}
		}
		public static void hangDonVi(int hihi[],int i) {
			switch (hihi[i]) {
			case 9:
				String soHangDonVi = "Chínn   ";
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
				soHangDonVi = "  không ";
				System.out.print(soHangDonVi);
				break;

			default:
				System.out.println("Vui lòng nhập lại");
				break;

			}
		}

	}




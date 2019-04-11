package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class MangSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> listSo = new ArrayList<Integer>();
		int size = 0;
		while(true) {
			System.out.print("Nhập số thứ " + (++size) + " ");
			String so = sc.nextLine();
			if (so.equals("exit")) {
				System.out.println("Đã dừng nhập");
				break;
			} else {
				listSo.add(Integer.parseInt(so));
			}
		}
		
		int soNhap = sc.nextInt();
		boolean lap = true;
		if (size != 0) {
			do {
				switch(soNhap) {
//				case 1 : 
//					themSo(listSo, size);
//					break;
//				case 2 : 
//					themSoTaiViTriYeuCau(listSo, size);
//					break;
				case 3 : 
					hienThiListSo(listSo, size);
					break;
				}
			} while(true);
		} else {
				System.out.println("Bạn không nhập phần tử nào hết");
				}
		}
		
		// Thêm một số vào mảng
//		public static void themSo(ArrayList<Integer> listSo, int size) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("Nhập số thứ " + (size) + " ");
//			size++;
//			listSo.add(sc.nextInt());
//		}
//		// Thêm một số vào vị trí yêu cầu
//		public static void themSoTaiViTriYeuCau(ArrayList<Integer> listSo, int size) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Nhập vị trí bạn muốn thêm ");
//			int soNhap = sc.nextInt();
//			System.out.print("Nhập số muốn thêm");
//			listSo.add(soNhap, sc.nextInt());
//		}
		// Hiển thị danh sách số
		public static void hienThiListSo(ArrayList<Integer> listSo, int size) {
			for (int i = 0; i < listSo.size(); i++) {
				System.out.print(listSo.get(i) + " ");
			}
		}


	}

package Lap5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class MainSinhVien extends SinhVien {
	
	public static void main(String[] args) {
		ArrayList<SinhVien> listSv = new ArrayList<SinhVien>();
		
//		SinhVien sv1 = new SinhVien("Nguyen" , "A");
//		SinhVien sv2 = new SinhVien("Nguyen" , "B");
//		SinhVien sv3 = new SinhVien("Nguyen" , "C");
//		SinhVien sv4 = new SinhVien("Nguyen" , "D");
//		SinhVien sv5 = new SinhVien("Nguyen" , "E");
//		SinhVien sv6 = new SinhVien("Nguyen" , "F");
//		
//		listSv.add(sv1);
//		listSv.add(sv2);
//		listSv.add(sv3);
//		listSv.add(sv4);
//		listSv.add(sv5);
//		listSv.add(sv6);
		
		boolean lap = true;
		do {
			System.out.println("Chọn thao tác");
			Scanner sc = new Scanner(System.in);
			int soNhap = sc.nextInt();
			switch (soNhap) {
			case 1 : 
				xuat(listSv);
				break;
			case 2 : 
				themSv(listSv);
				break;
			case 3 : 
				xuatNgauNhien(listSv);
				break;
			case 4 : 
				sapXepGiamDan(listSv);
				break;
			case 5 :
				xoaHoTen(listSv);
				break;
			case 6 : 
				System.out.println("kết thúc");
				System.exit(0);
			default : System.out.println("Không có trong thao tác");
			}
		} while (lap);
	}
	public static void xuat(ArrayList<SinhVien> listSv) {		
		for (int i = 0 ; i < listSv.size() ; i++) {
			System.out.println("FirstName : " + listSv.get(i).getFirstName() + " - LastName : " + listSv.get(i).getLastName());
		}
	}
	public static void themSv(ArrayList<SinhVien> listSv) {
		SinhVien sv = new SinhVien();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên Sv");
		sv.setFirstName(sc.nextLine());
		System.out.println("Nhập họ Sv");
		sv.setLastName(sc.nextLine());
		listSv.add(sv);
	}
	public static void xuatNgauNhien(ArrayList<SinhVien> listSv) {
		Collections.shuffle(listSv);
		for (int i = 0 ; i < listSv.size() ; i++) {
			System.out.println("FirstName : " + listSv.get(i).getFirstName() + " - LastName : " + listSv.get(i).getLastName());
		}
	}
	public static void sapXepGiamDan(ArrayList<SinhVien> listSv) {
		Collections.sort(listSv, new Comparator<SinhVien>() {
			public int compare(SinhVien o1, SinhVien o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		for (int i = 0 ; i < listSv.size() ; i++) {
			System.out.println("FirstName : " + listSv.get(i).getFirstName() + " - LastName : " + listSv.get(i).getLastName());
		}
	}
	public static void xoaHoTen(ArrayList<SinhVien> listSv) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên mà bạn muốn xóa");
		String ten = sc.nextLine();
		for (int i = 0 ; i < listSv.size() ; i++) {
			if (listSv.get(i).getLastName().equals(ten)) {
				listSv.remove(i);
			} else {
				System.out.println("Không tìm thấy tên");
			}
		}
	}
	
}

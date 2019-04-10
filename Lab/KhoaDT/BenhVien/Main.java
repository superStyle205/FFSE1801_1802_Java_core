package BenhVien;

import java.util.*;
import BenhVien.ConNguoi;
import BenhVien.BenhNhan;
import BenhVien.BacSi;

public class Main{
	static private Database database = new Database();
	static Scanner scanner = new Scanner(System.in);
	public static void main(String... args){
		ArrayList<BacSi> dsBacSi;
		ArrayList<BenhNhan> dsBenhNhan;

		System.out.println("Chon hanh dong tu menu:");
		System.out.println("1/ Them moi ho so benh nhan");
		System.out.println("2/ Hien thi thong tin tat ca benh nhan");
		System.out.println("3/ Hien thi ho so cua benh nhan voi ma benh nhan nhap tu ban phim");
		System.out.println("4/ Tinh tong cac so tien cua tat ca benh nhan");
		System.out.println("5/ Tim benh nhan co tien tra nhieu nhat");
		System.out.println("6/ TIm cac benh nhan co benh tuong ung nhap tu ban phim");
		System.out.println("7/ Them moi nhan vien");
		System.out.println("8/ Hien thi tat ca bac sy");
		System.out.println("9/ Hien thi bac sy voi khoa tuong ung nhap tu ban phim");
		System.out.println("10/ Sua phu cap cho bac sy tuong ung voi ma bac sy nhap tu ban phim");
		System.out.println("11/ Xoa bac sy voi ma tuong ung");
		System.out.println("12/ Thoat chuong trinh");
		while (true){
			dsBacSi=database.getDSBS();
			dsBenhNhan=database.getDSBN();

			switch(scanner.nextLine()){
				case "1":
					BenhNhan bn1=new BenhNhan();
					database.addBN(bn1);
					break;
				case "2":
					for (BenhNhan bn2 : dsBenhNhan){
						bn2.hienThiHoSoBN();
					}
					break;
				case "3":
					System.out.println("Nhap ma benh nhan can tim: ");
					database.hienThiBN(scanner.nextLine());
					break;
				case "4":
					System.out.println("Tong tien cac benh nhan: "+database.tongTien());
					break;
				case "5":
					if (database.bnTraNhieu()!=null){
						database.bnTraNhieu().hienThiHoSoBN();} else{System.out.println("Khong co benh nhan nao trong database");}
					
					break;
				case "6":
					System.out.println("Nhap benh can tim: ");
					database.bnBiBenh(scanner.nextLine());
					break;
				case "7":
					BacSi bs1=new BacSi();
					database.addBS(bs1);
					break;
				case "8":
					for (BacSi bs2 : dsBacSi){
						bs2.hienThiHoSoBS();
					}
					break;
				case "9":
					System.out.println("Nhap khoa can tim: ");
					database.hienThiBSKhoa(scanner.nextLine());
					break;
				case "10":
					System.out.println("Nhap ma BS can tim: ");
					database.hienThiBSID(scanner.nextLine()).setPhuCap();
					break;
				case "11":
					dsBacSi.remove(database.hienThiBSID(scanner.nextLine()));
					break;
				case "12":
					System.out.println("Thoat chuong trinh...");
					System.exit(0);
				default:
					System.out.println("Vui long chon hanh dong tu menu ");
			}
			System.out.println("Chon hanh dong tiep theo:... ");
		}
	}
}	







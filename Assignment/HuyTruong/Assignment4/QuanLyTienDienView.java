package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTienDienView { 
	private Scanner sc;
	private ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
	
	public void nhapKH(){
		sc = new Scanner(System.in);
		System.out.println("Nhập số lượng khách hàng muốn thêm: ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			KhachHang kh = new KhachHang();
			BienLai bill = new BienLai();
			System.out.println("Nhập Họ Tên Khách Hàng: ");
			kh.setHoTen(sc.nextLine());
			System.out.println("Nhập địa chỉ Khách Hàng: ");
			kh.setDiaChi(sc.nextLine());
			
			System.out.println("Nhập chỉ số điện cũ: ");
			bill.setChiSoCu(Double.parseDouble(sc.nextLine()));
			System.out.println("Nhập chỉ số điện mới: ");
			bill.setChiSoMoi(Double.parseDouble(sc.nextLine()));
			bill.setCost((bill.getChiSoMoi() - bill.getChiSoCu())*750);	
			kh.setBienLai(bill);
			listKH.add(kh);
			System.out.println("Đã thêm khách hàng thành công!!");
		}
		chooseMenu();
	}
	public void showAllBill() {
		if(listKH.size() == 0) {
			System.out.println("Không có khách hàng nào!!");
			return;
		
		}else {
			for(int i = 0; i < listKH.size(); i++) {
				System.out.println("Họ Tên KH: " + listKH.get(i).getHoTen());
				System.out.println("Địa chỉ KH: " + listKH.get(i).getDiaChi());
				System.out.println("Chỉ số cũ: " + listKH.get(i).getBienLai().getChiSoCu());
				System.out.println("Chỉ số mới: " + listKH.get(i).getBienLai().getChiSoMoi());
				System.out.println("Tiền phải trả là : " + listKH.get(i).getBienLai().getCost());
			}
		}
		
		chooseMenu();
	}
	public void nhapBL(){
	//
		
	}
	
	public void chooseMenu() {
		System.out.println("1.Nhập Các Thông Tin cho n hộ sử dụng điện. ");
		System.out.println("2.Hiển thị các biên lai đã nhập");
		System.out.println("3.Tiền điện phải trả cho mỗi hộ dân");
		System.out.println("<----------------------------------------->");
		System.out.print("Mời Bạn nhập chức năng muốn sử dụng: ");
		sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
			switch(number) {
			case 1: nhapKH();
					break;
			case 2: showAllBill(); 
					break;
			case 3: showAllBill();
				break;
				default: System.out.println("Chức năng không phù hợp!!");
				break;
			}
		
	}
	
}

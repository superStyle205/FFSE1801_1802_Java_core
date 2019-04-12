package assignment42;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
	private Scanner sc;
	private ArrayList<SinhVienFPT> listSV = new ArrayList<SinhVienFPT>();
	public  void menu() {
		System.out.println("1.Nhập danh sách sinh viên: ");
		System.out.println("2.Xuất thông tin danh sách sinh viên");
		System.out.println("3.Xuất danh sách sinh viên có học lực giỏi");
		System.out.println("4.Sắp xếp danh sách sinh viên theo điểm");
		System.out.println("5.Kết thúc");
		System.out.println("<---------------------------------------------->");
	}
	public void chooseMenu() {
		sc = new Scanner(System.in);
		System.out.println("Nhập chức năng bạn muốn sử dụng: ");
		int number = Integer.parseInt(sc.nextLine());
		switch(number) 
		{
			case 1: addSV();
					break;
			case 2: showAllSV();
					break;
			case 3: showHSG();
					break;
			case 4: sortDiem();
					break;
			
		}
	}
	public void addSV() {
		sc = new Scanner(System.in);
		while(true) {
		System.out.println("1.Thêm sinh viên IT \n2.Thêm sinh viên Biz \n3. Quay lại menu chức năng");
		System.out.println("Chọn loại sinh viên muốn thêm: ");
		String type = sc.nextLine();
		switch(type) {
		case "1" : addSVIT();
					break;
		case "2" : addSVBiz();
					break;
		case "3":	menu();
					chooseMenu();
					break;
		default:  System.out.println("Lựa chọn không phù hợp!!");
			}
		}
	}
	public void addSVIT() {
		sc = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên muốn thêm: ");
		int soLuong = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < soLuong; i++) {
			SinhVienIT svit = new SinhVienIT();
			System.out.println("Nhập tên sinh viên: ");
			svit.setHoTen(sc.nextLine());
			svit.setNganh("IT");
			System.out.println("Nhập điêm Java: ");
			svit.setDiemJava(Double.parseDouble(sc.nextLine()));
			System.out.println("Nhập điêm CSS: ");
			svit.setDiemCss(Double.parseDouble(sc.nextLine()));
			System.out.println("Nhập điêm Html: ");
			svit.setDiemHtml(Double.parseDouble(sc.nextLine()));
			((SinhVienFPT)svit).setSvIT(svit);
			listSV.add(svit);
			System.out.println("Thêm thành công Sinh Viên IT");
		}
	}
	public void addSVBiz() {
		sc = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên muốn thêm: ");
		int soLuong = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < soLuong; i++) {
			SinhVienBiz svbiz = new SinhVienBiz();
			System.out.println("Nhập tên sinh viên: ");
			svbiz.setHoTen(sc.nextLine());
			svbiz.setNganh("Business");
			System.out.println("Nhập điểm Maketing: ");
			svbiz.setDiemMaketing(Double.parseDouble(sc.nextLine()));
			System.out.println("Nhập điểm Sale: ");
			svbiz.setDiemSale(Double.parseDouble(sc.nextLine()));
			((SinhVienFPT) svbiz).setSvBIZ(svbiz);
			listSV.add(svbiz);
			System.out.println("Thêm thành công sinh viên BIZ");
		}
	}
	public void showAllSV() {
		for(int i = 0; i < listSV.size(); i++) {
			System.out.println("Họ và Tên: " + listSV.get(i).getHoTen());
			System.out.println("Ngành: " + listSV.get(i).getNganh());
			if(listSV.get(i).getNganh().equals("IT")) {
				System.out.println("Điểm Java: " + listSV.get(i).getSvIT().getDiemJava());
				System.out.println("Điểm CSS: " + listSV.get(i).getSvIT().getDiemCss());
				System.out.println("Điểm HTML: " + listSV.get(i).getSvIT().getDiemHtml());
				System.out.println("Điểm Trung Bình: " + listSV.get(i).getSvIT().getDiem());
				System.out.println("Xếp Loại: "  + listSV.get(i).getSvIT().getHocLuc());
				System.out.println("<-------------------------------------->");
			}
			if(listSV.get(i).getNganh().equals("Business")) {
				System.out.println("Điểm Marketting: " + listSV.get(i).getSvBIZ().getDiemMaketing());
				System.out.println("Điểm Sales: " + listSV.get(i).getSvBIZ().getDiemSale());
				System.out.println("Điểm Trung Bình: " + listSV.get(i).getSvBIZ().getDiem());
				System.out.println("Xếp Loại: " + listSV.get(i).getSvBIZ().getHocLuc());
				System.out.println("<-------------------------------------->");
			}
		}
	}
	public void sortDiem() {
		SinhVienFPT temp;
		System.out.println(listSV.size());
		for(int i = 0; i < listSV.size(); i++) {
			for(int j = i+1; j < listSV.size(); j++) {
				if(listSV.get(i).getDiem() > listSV.get(j).getDiem()) {
					temp = listSV.get(i);
					listSV.set(i, listSV.get(j));
					listSV.set(j, temp);
				}	
			}
		}
		showAllSV();
	}
	public void showHSG() {
		for(int i = 0; i < listSV.size(); i++) {
			if(listSV.get(i).getHocLuc().equals("Giỏi")) {
				if(listSV.get(i).getNganh().equals("IT")) {
					System.out.println("Điểm Java: " + listSV.get(i).getSvIT().getDiemJava());
					System.out.println("Điểm CSS: " + listSV.get(i).getSvIT().getDiemCss());
					System.out.println("Điểm HTML: " + listSV.get(i).getSvIT().getDiemHtml());
					System.out.println("Điểm Trung Bình: " + listSV.get(i).getSvIT().getDiem());
					System.out.println("Xếp Loại: "  + listSV.get(i).getSvIT().getHocLuc());
					System.out.println("<-------------------------------------->");
				}
				if(listSV.get(i).getNganh().equals("Business")) {
					System.out.println("Điểm Marketting: " + listSV.get(i).getSvBIZ().getDiemMaketing());
					System.out.println("Điểm Sales: " + listSV.get(i).getSvBIZ().getDiemSale());
					System.out.println("Điểm Trung Bình: " + listSV.get(i).getSvBIZ().getDiem());
					System.out.println("Xếp Loại: " + listSV.get(i).getSvBIZ().getHocLuc());
					System.out.println("<-------------------------------------->");
				}
			}
		}
	}
	public static void main(String[] args) {
		QuanLySinhVien qlsv = new QuanLySinhVien();
		qlsv.menu();
		qlsv.chooseMenu();
	}
}

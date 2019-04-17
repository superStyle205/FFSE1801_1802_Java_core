package Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {
	private ArrayList<CanBo> quanLyCanBo;
	private Scanner scanner;
	
	public MyClass() {
		quanLyCanBo = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	public void inMenu() {
		while(true) {
			System.err.println("Chọn chức năng[1_5]");
			System.err.println("1. Nhập thông tin danh sách cán bộ trong trường.");
			System.err.println("2. Xuất danh sách giảng viên khoa x, hoặc nhân viên phòng ban y nào đó.");
			System.err.println("3. Tổng số lương trường phải trả cho cán bộ.");
			System.err.println("4. Sắp xếp cán bộ theo lương, nếu lương bằng thì sắp xếp theo tên. ");		
			System.err.println("5. Tạm biệt!!!");
			System.err.print("Mời chọn: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				addCanBo();
				break;
				
			case 2:
				hienThiCanBo();
				break;
				
			case 3:
				tinhTongLuong();
				break;
		
			case 4:
				sortLuong();
				break;
		
			case 5:
				System.err.println("Tạm biệt!!!");
				System.exit(0);
				break;
	
			default:
				System.err.print("Mời chọn lại: ");
				break;
			}
		}
	}
    
	public void addCanBo() {
		CanBo canBo = null;
		int choose;
	    System.out.print("Nhập số lượng cán bộ trong trường: ");
	    int soCanBo = scanner.nextInt();
	    for (int i = 0; i < soCanBo; i++) {
	        System.out.println("Nhập thông tin cán bộ thứ " + (i + 1) + ":");
	        do {
	            System.out.print("Chọn loại cán bộ (1 - Giảng viên, 2 - Nhân viên): ");
	            choose = scanner.nextInt();
	            switch (choose) {
	                case 1:
	                    canBo = new GiangVien();
	                    canBo.nhap();
	                    quanLyCanBo.add(canBo);
	                    break;
	                case 2:
	                    canBo = new NhanVienHanhChinh();
	                    canBo.nhap();
	                    quanLyCanBo.add(canBo);
	                    break;
	                default:
	                    System.out.println("Chọn không hợp lệ.");
	                    break;
	                }
	        } while (choose < 1 || choose > 3);
	    }
	}
    
	public void hienThiCanBo() {
	    System.err.println("Hiển thị danh sách cán bộ trong trường: ");
	    for (CanBo cb : quanLyCanBo) {
	        cb.xuat();
	    }
	}
     
	public void tinhTongLuong() {
		double tongLuong = 0;
		double luong;
	    for (CanBo cb : quanLyCanBo) {
	        luong = cb.getTinhLuong();
	        tongLuong += luong;
	    }
	    System.err.println("Tổng lương phải trả cho cán bộ trong trường = " + tongLuong); 
	}
	
	public void sortLuong() {
		CanBo canBo;
	    for (int i = 0; i < quanLyCanBo.size() - 1; i++) {
			for (int j = 0; j < quanLyCanBo.size() - 1 - i; j++) {
				if (quanLyCanBo.get(j).getTinhLuong() > quanLyCanBo.get(j + 1).getTinhLuong()) {
					canBo = quanLyCanBo.get(j);
					quanLyCanBo.set(j, quanLyCanBo.get(j + 1));
					quanLyCanBo.set(j + 1, canBo);
				}
			}
		}
	    System.err.println("Sắp xếp danh sách cán bộ theo lương: ");
	    for (CanBo cb : quanLyCanBo) {
			cb.xuat();
		}
	}
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.inMenu();
	}
}

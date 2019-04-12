package quanlisinhvien.test;

import java.util.Scanner;

import quanlisinhvien.model.quanlisinhvien;

public class test {
	public static int size = 0;
	public static quanlisinhvien a[] = new quanlisinhvien[100];
		
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}
	
	public static void menu() {
		System.out.println(""
				+ "/****************************************/ \r\n" + 
				"1. Thêm sinh viên. (+2 điểm) \r\n" + 
				"2. Cập nhật thông tin sinh viên theo ID ( + 2 điểm) . \r\n" + 
				"3. Xóa sinh viên theo ID ( + 2 điểm ). \r\n" + 
				"4. Sắp sếp sinh viên theo tên ( + 2 điểm ). \r\n" + 
				"5. Hiển thị danh sách sinh viên ( +2 điểm ). \r\n" + 
				"0. Kết thúc chương trình. \r\n" + 
				"/****************************************/");
		int n = new Scanner(System.in).nextInt();
		switch (n) {
		case 1:
			themSinhVien();
			break;
		case 2:
			capNhat();
			break;
		case 3:
			xoaSinhVien();
			break;
		case 4:
			sapXepTheoTen();
			break;
		case 5:
			hienThiSinhVien();
			break;
		case 0:
			System.err.println("THANKS");
			System.exit(0);
			break;
		
		default:
			break;
		}
	}
	public static void sapXepTheoTen() {
		quanlisinhvien tg;
		for (int i = 0; i < size - 1; i++){
            String[] ary_1 = a[i].getTen().split(" ");
            String[] ary_2 = a[i + 1].getTen().split(" ");
            
            //int result = ary_1[ary_1.length - 1].compareTo(ary_2[ary_2.length - 1]);
            int result = ary_1[ary_1.length - 1].compareTo(ary_2[ary_2.length - 1]);
            if(result > 0){
                // ary_1 > ary_2
                tg = a[i];
                a[i] = a[i + 1];
                a[i + 1] = tg;
            }/*else if(result < 0){
                // ary_1 < ary_2
                
            }else{
                // a[i] == a[i+1]
                String s1_s2[] = new String[2];
                s1_s2[0] = ary_1[ary_1.length - 1];
                s1_s2[1] = ary_2[ary_2.length - 1];
                for (int j = 0; j < s1_s2.length - 1; i++){
                    String[] s1_ten_1 = s1_s2[j].split("");
                    String[] s2_ten_2 = s1_s2[j + 1].split("");
                    int result_2 = s1_ten_1[1].compareTo(s2_ten_2[1]);
                    if(result_2 > 0){
                        // ary_1 > ary_2
                        tg = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = tg;
                        break;
                    }else if(result_2 < 0){
                        // ary_1 < ary_2
                        
                    }else{
                        continue;
                    }
                }
            }*/
            
        }  
	}
	public static void themSinhVien() {
			
			System.out.println("Nhap id");
			int id = new Scanner(System.in).nextInt();
			System.out.println("Nhap name");
			String name = new Scanner(System.in).nextLine();
			System.out.println("Nhap tuoi");
			int age = new Scanner(System.in).nextInt();
			System.out.println("Nhap adress");
			String adress = new Scanner(System.in).nextLine();
			System.out.println("Nhap gpa");
			double gpa = new Scanner(System.in).nextDouble();
			a[size] = new quanlisinhvien(id, khongTrang(name), age, adress, gpa);
			size++;
	
	}
	public static String khongTrang(String str) {
		str = str.trim();
        str = str.replaceAll("\\s+"," ");
        return str.toUpperCase();
	}
	public static void hienThiSinhVien() {
		for (int j = 0; j < size; j++) {
			System.out.println(a[j].toString());
		}
	}
	public static void capNhat() {
		System.out.println("moi nhap id sinh vien");
		int idCheck = new Scanner(System.in).nextInt();
		int status = 0;
		for (int i = 0; i < size; i++) {
			if(a[i].getId() == idCheck) {
				System.out.println("Nhap ten moi");
				String ten = new Scanner(System.in).nextLine();
				a[i].setName(ten);
				status = 0;
			}else {
				status = -1;
			}
		}
		if(status == -1) {
			System.out.println("khong co sinh vien");
		}
	}
	public static void xoaSinhVien() {
		System.out.println("moi nhap id sinh vien");
		int idCheck = new Scanner(System.in).nextInt();
		int c = 0, i;
		for (i = 0; i < size; i++) {
			if(a[i].getId() != idCheck) {
				a[i] = a[i];
				c++;
			}
		}
		size = c;
	}

}

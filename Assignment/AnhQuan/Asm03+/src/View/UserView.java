package View;

import java.util.Scanner;

public class UserView {
	 final int ADD = 1;
	 final int UPDATE = 2;
	 final int DEL = 3;
	 final int SORT =4;
	 final int SHOWALL =5;
	 final int SHOWONE =6;
Scanner sc = new Scanner(System.in);
	 public int menu() {

	System.out.println("-----------menu------------");
    System.out.println(ADD+ ". Them sinh vien");
	System.out.println(UPDATE+ ". Cap nhat thong tin sinh vien theo ID");
	System.out.println(DEL+ ". Xoa sinh vien");
	System.out.println(SORT+ ". Sap xep sinh vien theo ten");
	System.out.println(SHOWALL+ ". Hien thi danh sach sinh vien");
	System.out.println(SHOWONE+". Hien thi sinh vien");
    System.out.println("---------------------------");
return Integer.parseInt(sc.nextLine());

}
	 public String nhapID() {
		 System.out.println("Nhap id sinh vien ");
		 return sc.nextLine();
	 }
	 public String nhapTen() {
		 System.out.println("Nhap ten sinh vien ");
		 return sc.nextLine();
	 }
	 public String nhapDiaChi() {
		 System.out.println("Nhap code sinh vien ");
		 return sc.nextLine();
	 }
	 public String nhapEmail() {
		 System.out.println("Nhap email sinh vien ");
		 return sc.nextLine(); 
	 }
	 public String nhapSex() {
		 System.out.println("Nhap sex sinh vien ");
		 return sc.nextLine(); 
	 }
     public void showAll() {
     }
     public void showOne() {
    	 
     }
}


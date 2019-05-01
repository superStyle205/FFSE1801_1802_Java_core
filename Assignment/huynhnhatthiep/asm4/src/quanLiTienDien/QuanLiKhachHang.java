package quanLiTienDien;
 import java.util.Scanner;
public class QuanLiKhachHang{
	

	public int size = 0;
	BienLai khachHang[] = new BienLai[100];
	Scanner sc = new Scanner(System.in);
	
   public void showKhachHang() {
	   for (int i = 0; i < size; i++) {
		   khachHang[i].xuat();
	}
   }
   public void  nhapKhachHang() {
	    System.out.println("nhập tên khác hàng:  ");
		String hoTen =  sc.nextLine();
		System.out.println("nhập địa chỉ nhà:  ");
		String soNha =  sc.nextLine();
		System.out.println("nhập mã công tơ điện: ");
		String maSoCongToDien =  sc.nextLine();
		System.out.println("nhập chỉ số cũ:  ");
		int chiSoCu =Integer.parseInt( sc.nextLine());
		System.out.println(" nhập chỉ số mới:  ");
		int chiSoMoi = Integer.parseInt(sc.nextLine());
		khachHang[size++] = new BienLai(hoTen, soNha, maSoCongToDien, chiSoCu, chiSoMoi);
		
   }
   
   
   public void menu() {
	while(true) {
		System.out.println(" 1 nhập danh sách khách hàng ");
		System.out.println("2 hiện thị biên lai");
		int n = Integer.parseInt(sc.nextLine());
		switch (n) {
		case 1:
			nhapKhachHang();
			break;
		case 2:
			showKhachHang();
			break;

		default:
			break;
		}
	}
}

   public static void main(String[] args) {
	 QuanLiKhachHang quanLiKhachHang = new QuanLiKhachHang();
	 quanLiKhachHang.menu();
   }
}

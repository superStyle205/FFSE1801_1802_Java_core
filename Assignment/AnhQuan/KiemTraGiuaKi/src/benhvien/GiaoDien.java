package benhvien;

import java.util.Scanner;

public class GiaoDien {
public static void main(String[] args) {
	HamGoi hg= new HamGoi();
	hg.giaoDien();
Scanner sc = new Scanner(System.in);
while (true) {
int roll = sc.nextInt();
hg.giaoDien();
	
switch(roll){
	case 1: 
		hg.themmoibn();
		break;
	case 2:
		hg.hienthitatcabenhnhan();
		break;
	case 3:
		hg.timbenhnhantheoma();
		break;
	case 4:
		hg.tinhtongtien();
		break;
	case 5:
		hg.tiennhieunhat();
		break;
	case 6:
		hg.timbenhnhantheobenh();
		break;
	case 7:
		hg.themmoinhanvien();
		break;
	case 8:
		hg.hienthibacsi();
		break;
	case 9:
		hg.timbacsitheokhoa();
		break;
		default: System.out.println("ko hop le");
		
}
}

}
	

}


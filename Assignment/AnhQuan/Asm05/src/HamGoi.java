import java.util.*;
public class HamGoi {
	Scanner sc= new Scanner(System.in);
	ArrayList<GiangVien> gv= new ArrayList<GiangVien>();
	ArrayList<NhanVien> nv= new ArrayList<NhanVien>();
	public void themGiangVien() {
		GiangVien gvx = new GiangVien();
	System.out.print("nhap ten");
	String a;
	a= sc.nextLine();
	gvx.setHoTen(a);
	System.out.print("nhap khoa");
	
	a= sc.nextLine();
	gvx.setKhoa(a);
System.out.print("nhap trinh do");
	
	a= sc.nextLine();
	gvx.setTrinhDo(a);
switch(gvx.getTrinhDo()) {
case "cu nhan" :
	gvx.setPhuCap(300);
	break;
case "thac si" :
	gvx.setPhuCap(500);
	break;
case "tien si" :
	gvx.setPhuCap(500);
	break;
}

System.out.print("nhap so tiet day trong thang");
	int x;
	x= sc.nextInt();
	gvx.setSoTietDay(x);
	System.out.print("nhap he so luong");
	double  y;
	y= sc.nextDouble();
	gvx.setHeSoLuong(y);
	gv.add(gvx);
	}
	public void themNhanVien() {
		NhanVien nvx = new NhanVien();
	System.out.println("nhap ten");
	String a;
	a= sc.nextLine();
	a= sc.nextLine();
	nvx.setHoTen(a);
	System.out.println("nhap phong ban");
	
	a= sc.nextLine();
	nvx.setPhongBan(a);
System.out.println("nhap chuc vu");
	
	a= sc.nextLine();
	nvx.setChucVu(a);
switch(nvx.getPhongBan()) {
case "truong phong" :
	nvx.setPhuCap(2000);
	break;
case "pho phong" :
	nvx.setPhuCap(1000);
	break;
case "nhan vien" :
	nvx.setPhuCap(500);
	break;
}

System.out.print("nhap so ngay cong");
	int x;
	x= sc.nextInt();
	nvx.setSoNgayCong(x);
	System.out.print("nhap he so luong");
	double  y;
	y= sc.nextDouble();
	nvx.setHeSoLuong(y);
	nv.add(nvx);
	}
	public void tongLuong() {
		double luong=0 ;
		for(int i =0; i<gv.size();i++) {
			luong= luong +gv.get(i).heSoLuong*730+gv.get(i).phuCap+gv.get(i).soTietDay*45;

		}
		for(int j =0; j<nv.size();j++) {
			luong=nv.get(j).heSoLuong*730+nv.get(j).phuCap+nv.get(j).soNgayCong*30;

		}
		System.out.println("Tong luong la"+ luong);
	}
	
}

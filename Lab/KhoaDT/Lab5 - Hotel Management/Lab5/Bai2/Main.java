package Lab5.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    private static  ArrayList<KhachSan> data= new ArrayList<>();

    public static void main (String... args){
        init();
        System.out.println("Chon hanh dong tu menu:");
        System.out.println("1/ Nhap khach hang");
        System.out.println("2/ Hien thi danh sach KH");
        System.out.println("3/ Tinh tien khach hang");
        System.out.println("4/ Thoat chuong trinh");

        while (true){
            switch (scanner.nextLine()){
                case "1":
                    KhachSan record=new KhachSan();
                    data.add(record);
                    break;
                case "2":
                    for (KhachSan recordx : data){
                        recordx.xuatThongTin();
                    }
                    break;
                case "3":
                    System.out.println("Nhap CMND Khach hang can tinh");
                    String input=scanner.nextLine();
                    for (KhachSan recordx : data){
                        if(recordx.getKhachHang().getCMND().equals(input)){
                            recordx.getTienPhong();
                            break;
                        } else {
                            System.out.println("Thong tin khach khong ton tai.");
                        }
                    }
                    break;
                case "4":
                    System.out.println("See you later!");
                    System.exit(0);
                default:
                    System.out.println("Vui long chon hanh dong tu menu");
            }
            System.out.println("Chon hanh dong tiep theo");
        }
    }

    static public void init(){
        Nguoi khach1=new Nguoi("Khoa Do","20/12/2017","201392565");
        Nguoi khach2=new Nguoi("Viet Nguyen","20/12/2017","201392567");
        Nguoi khach3=new Nguoi("Tam Luong","02/11/2016","201392555");
        Nguoi khach4=new Nguoi("Hoang Kien","20/12/2017","201392525");
        KhachSan record1=new KhachSan(5,"1",5000,khach1);
        KhachSan record2=new KhachSan(7,"2",900,khach2);
        KhachSan record3=new KhachSan(2,"3",5200,khach3);
        KhachSan record4=new KhachSan(4,"1",300,khach4);
        data.add(record1);
        data.add(record2);
        data.add(record3);
        data.add(record4);
    }
}

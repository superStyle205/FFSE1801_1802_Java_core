package Lab5;

import java.util.*;

public class Bai1 {
    static Scanner scanner = new Scanner(System.in);
    private String nameSV;
    static private ArrayList<String> danhSach=new ArrayList<String>();

    static public void init(){
        danhSach.add("Khoa Do");
        danhSach.add("Viet Nguyen");
        danhSach.add("Tam Luong");
        danhSach.add("Ngoc An");
        danhSach.add("Huynh Tu");
        danhSach.add("Ngoc Dan");
        danhSach.add("Ha Duy");
        danhSach.add("Khoa Do");
        danhSach.add("Ha Duy");
        danhSach.add("Khoa Do");
    }

    static public void nhapSV(){
        System.out.println("Nhap ho va ten sinh vien");
        danhSach.add(scanner.nextLine());
        System.out.println("Nhap thanh cong!");
        System.out.println();
    }

    static public void xuatSV(){
        int i=1;
        for (String sinhvien : danhSach){
            System.out.println("Sinh vien thu "+(i++)+": "+sinhvien);
        }
    }

    static public void sapXep(){
        Collections.sort(danhSach);
        xuatSV();
    }

    static public void ngauNhien(){
        Collections.shuffle(danhSach);
        xuatSV();
    }
    static public void xoaValue(String value){
        int vitri=danhSach.indexOf(value);
        if (vitri>=0){
            danhSach.remove(vitri);
            xoaValue(value);
        }
    }


    public static void main(String args[]) {
        init();
        System.out.println("Chon hanh dong tu menu:");
        System.out.println("1/ Nhap sinh vien");
        System.out.println("2/ Hien thi danh sach");
        System.out.println("3/ Hien thi danh sach ngau nhien");
        System.out.println("4/ Sap xep danh sach");
        System.out.println("5/ Xoa sinh vien theo vi tri");
        System.out.println("6/ Xoa sinh vien theo ho ten");
        System.out.println("7/ Thoat chuong trinh");

        while (true){
            switch (scanner.nextLine()){
                case "1":
                    nhapSV();
                    break;
                case "2":
                    xuatSV();
                    break;
                case "3":
                    ngauNhien();
                    break;
                case "4":
                    sapXep();
                    break;
                case "5":
                    System.out.println("Nhap vi tri sinh vien can xoa");
                    danhSach.remove(Integer.parseInt(scanner.nextLine())-1);
                    xuatSV();
                    break;
                case "6":
                    System.out.println("Nhap ten sinh vien can xoa");
                    xoaValue(scanner.nextLine());
                    xuatSV();
                    break;
                case "7":
                    System.out.println("See you later!");
                    System.exit(0);
                default:
                    System.out.println("Vui long chon hanh dong tu menu");
            }
            System.out.println("Chon hanh dong tiep theo");
        }
    }
}


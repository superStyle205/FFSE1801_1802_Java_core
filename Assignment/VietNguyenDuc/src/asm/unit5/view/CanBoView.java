package asm.unit5.view;


import asm.unit5.model.bean.CanBo;

import java.util.List;
import java.util.Scanner;

public class CanBoView {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    Scanner sc = new Scanner(System.in);

    public String getType() {
        System.out.println("1.Giang vien.\n2.Nhan vien hanh chinh.");
        return sc.nextLine();
    }

    public void setType(int type) {
        if (type == 1) {
            System.out.println("Giang vien.");
        } else if (type == 2) {
            System.out.println("Nhan vien hanh chinh.");
        }
    }

    public String getTen() {
        System.out.println("Nhap ten: ");
        return sc.nextLine();
    }

    public void setTen(String ten) {
        System.out.println("Ten: " + ten);
    }

    public String getKhoa() {
        System.out.println("Nhap khoa:");
        return sc.nextLine();
    }

    public void setKhoa(String khoa) {
        System.out.println("Khoa: " + khoa);
    }

    public String getTrinhdo() {
        System.out.println("Nhap trinh do:");
        return sc.nextLine();
    }

    public void setTrinhdo(String trinhdo) {
        System.out.println("Trinh do: " + trinhdo);
    }

    public double getPhucap() {
        System.out.println("Nhap phu cap:");
        return sc.nextDouble();
    }

    public void setPhucap(double phucap) {
        System.out.println("Phu cap: " + phucap);
    }

    public int getSotietday() {
        System.out.println("Nhap so tiet day:");
        return sc.nextInt();
    }

    public void setSotietday(int sotietday) {
        System.out.println("So tiet day: " + sotietday);
    }

    public int getHesoluong() {
        System.out.println("Nhap he so luong:");
        return sc.nextInt();
    }

    public void setHesoluong(int hesoluong) {
        System.out.println("He so luong: " + hesoluong);
    }

    public String getPhongban() {
        System.out.println("Nhap phong ban:");
        return sc.nextLine();
    }

    public void setPhongban(String phongban) {
        System.out.println("Phong ban: " + phongban);
    }

    public int getSongaycong() {
        System.out.println("Nhap so ngay cong: ");
        return sc.nextInt();
    }

    public void setSongaycong(int songaycong) {
        System.out.println("So ngay cong: " + songaycong);
    }

    public String getChucvu() {
        System.out.println("Nhap chuc vu: ");
        return sc.nextLine();
    }

    public void setChucvu(String chucvu) {
        System.out.println("Chuc vu: " + chucvu);
    }

    public void setThongbao(String key, String thongbao) {
        switch (key) {
            case "red":
                System.out.println(ANSI_RED + thongbao + ANSI_BLACK);
                break;
            case "blue":
                System.out.println(ANSI_BLUE + thongbao + ANSI_BLACK);
                break;
            case "green":
                System.out.println(ANSI_GREEN + thongbao + ANSI_BLACK);
                break;
            case "cyan":
                System.out.println(ANSI_CYAN + thongbao + ANSI_BLACK);
                break;
        }
    }

    public void menu() {
        System.out.println(ANSI_BLACK + "1.Nhập thông tin danh sách cán bộ trong trường:\n" +
                "2.Xuất danh sách giảng viên khoa x, hoặc nhân viên phòng ban y nào đó:\n" +
                "3.Tổng số lương trường phải trả cho cán bộ:\n" +
                "4.Sắp xếp cán bộ theo lương, nếu lương bằng thì sắp xếp theo tên:\n");
    }

}

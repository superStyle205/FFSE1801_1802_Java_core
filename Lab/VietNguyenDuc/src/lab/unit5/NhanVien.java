package lab.unit5;

import java.util.Scanner;

public class NhanVien extends CanBo {
    Scanner sc = new Scanner(System.in);
    private String phongBan;
    private int soNgayCong;
    private String chucVu;

    public void input() {
        System.out.println("Nhập tên nhân viên: ");
        setName(sc.nextLine());
        System.out.println("Nhập phòng ban: ");
        this.phongBan = sc.nextLine();
        System.out.println("Nhập chức vụ: \n 1. Trưởng phòng \n 2. Phó phòng \n 3. Nhân viên");
        int chonChucVu = sc.nextInt();

        switch (chonChucVu) {
            case 1:
                this.chucVu = "Trưởng phòng";
                setPhuCap(2000);
                break;
            case 2:
                this.chucVu = "Phó phòng";
                setPhuCap(1000);
                break;
            case 3:
                this.chucVu = "Nhân viên";
                setPhuCap(500);
                break;
            default:
                break;
        }
        System.out.println("Nhập số ngày công: ");
        this.soNgayCong = sc.nextInt();
        System.out.println("Nhập hệ số lương: ");
        setHeSoLuong(sc.nextDouble());
    }

    public void output() {
        System.out.printf("\n%n|%-30s|%-20s|%-20s|%-15s|%-15s|%-20s|%n", "Tên", "Phòng ban", "Chức vụ", "Hệ số lương",
                "Số ngày công", "Phụ cấp");
        System.out.printf("\n%n|%-30s|%-20s|%-20s|%-15s|%-15s|%-20s|%n", getName(), phongBan, chucVu,
                getHeSoLuong(), soNgayCong, getPhuCap());
    }

    public void findNhanVien(String phongBan) {
        if (phongBan.equals(this.phongBan)) {
            output();
        }
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        double luong = getHeSoLuong() * 730 + getPhuCap() + soNgayCong * 30;
        return luong;
    }
}

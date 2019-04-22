package Lab5.Bai2;

import java.util.Scanner;

public class KhachSan {
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private Nguoi khachHang;
    Scanner scanner=new Scanner(System.in);

    public KhachSan() {
        nhapThongTin();
    }

    public KhachSan(int soNgayTro, String loaiPhong, double giaPhong, Nguoi khachHang) {
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.khachHang = khachHang;
    }

    public void nhapThongTin(){
        Nguoi khachHang=new Nguoi();
        setKhachHang(khachHang);
        System.out.println("Nhap so ngay tro");
        setSoNgayTro(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap loai phong");
        setLoaiPhong();
        System.out.println("Nhap gia phong");
        setGiaPhong(Double.parseDouble(scanner.nextLine()));
    }

    public void xuatThongTin(){
        getKhachHang().xuatThongTin();
        System.out.println("So ngay tro: "+ getSoNgayTro());
        System.out.println("Loai phong: " + getLoaiPhong());
        System.out.println("Gia phong: " + getGiaPhong());
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhong() {
        switch (this.loaiPhong){
            case "1":
                return "Phong vip";
            case "2":
                return "Phong thuong";
            case "3":
                return "Phong re";
            default:
                return "Khong co phong";
        }
    }

    public void setLoaiPhong() {
        System.out.println("Chon loai phong:");
        System.out.println("1/ Phong vip");
        System.out.println("2/ Phong thuong");
        System.out.println("3/ Phong re");
        String loaiPhong=scanner.nextLine();
        while (! (loaiPhong.equals("1")||loaiPhong.equals("2")||loaiPhong.equals("3"))){
            System.out.println("Vui long chon loai phong tu danh sach");
            loaiPhong=scanner.nextLine();
        }
        switch (loaiPhong){
            case "1":
                this.loaiPhong="Phong vip";
                break;
            case "2":
                this.loaiPhong="Phong thuong";
                break;
            case "3":
                this.loaiPhong="Phong re";
                break;
        }
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public Nguoi getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(Nguoi khachHang) {
        this.khachHang = khachHang;
    }

    public void getTienPhong(){
        double tienPhong=getGiaPhong()*getSoNgayTro();
        System.out.println("Tien phong la: "+tienPhong);
    }
}

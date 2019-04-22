package Lab5.Bai2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Nguoi {
    private String hoTen;
    private Date ngaySinh;
    private String CMND;
    Scanner scanner=new Scanner(System.in);

    public Nguoi() {
        nhapThongTin();
    }

    public Nguoi(String hoTen, String ngaySinh, String CMND) {
        this.hoTen = hoTen;
        this.ngaySinh = chuyenStringDate(ngaySinh);
        this.CMND = CMND;
    }

    public void nhapThongTin(){
        System.out.println("Nhap ho ten");
        setHoTen(scanner.nextLine());
        System.out.println("Nhap ngay sinh");
        setNgaySinh(chuyenStringDate(scanner.nextLine()));
        System.out.println("Nhap CMND");
        setCMND(scanner.nextLine());
    }

    public void xuatThongTin(){
        System.out.println("Ho ten:"+ getHoTen());
        System.out.println("Ngay sinh:" + getNgaySinh());
        System.out.println("CMND:" + getCMND());
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public Date chuyenStringDate(String str)
    {
        Date ns=null;
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            ns=sdf.parse(str);
        }
        catch(Exception e)
        {
            System.out.println("Loi dinh dang thoi gian.!");
        }
        return ns;
    }


    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }
}

package Products;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SanPham {

    static Scanner scanner=new Scanner(System.in);
    private String productName="";
    private double price=0;
    private double saleOff=0;

    public SanPham(String productName, double price, double saleOff){
        this.productName=productName;
        this.price=price;
        this.saleOff=saleOff;
    }
    public SanPham(String productName, double price){
        this.productName=productName;
        this.price=price;
    }

    private double getImportTax(double price){
        double tax=price*0.1;
        return tax;
    }
    public void input(){
        System.out.println("Nhập tên sản phẩm");
        this.productName=scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        String price=scanner.nextLine();
        while (!validate(price)){
            System.out.println("Vui lòng nhập giá trị số!");
            price=scanner.nextLine();
        }
        this.price=Double.parseDouble(price);
        System.out.println("Nhập mức giảm giá");
        String saleOff=scanner.nextLine();
        while (!validate(saleOff)){
            System.out.println("Vui lòng nhập giá trị số!");
            saleOff=scanner.nextLine();
        }
        this.saleOff=Double.parseDouble(saleOff);
    }
    public void output(){
        System.out.println("Tên sản phẩm: " + this.productName);
        System.out.println("Giá sản phẩm: " + this.price);
        System.out.println("Mức giảm giá: " + this.saleOff);

        System.out.println("Thuế nhập khẩu: " + getImportTax(this.price));
    }

    private boolean validate(String string){
        Pattern pattern = Pattern.compile("\\d*");
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
    private static boolean conti(){
        System.out.println("Tiếp tục? (Y/N) ");
        String conti=scanner.nextLine();
        if(conti.equals("n")){
            System.exit(0);
        }
        return true;
    }
    public static void main(String[] args) {
        while (conti()){
            SanPham sanPham1=new SanPham("Vinamilk",12345,123);
//            sanPham1.input();
            sanPham1.output();
            SanPham sanPham2=new SanPham("Ovaltine",12345);
//            sanPham2.input();
            sanPham2.output();
        }
    }
}

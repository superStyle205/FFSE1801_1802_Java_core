package ThuTienDien;

import java.util.Scanner;

public class Main {
    private static CustomerManagement customer=new CustomerManagement();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Chon hanh dong tu menu");
        System.out.println("1/ Nhap thong tin KH moi");
        System.out.println("2/ Hien thi thong tin tat ca KH");
        System.out.println("3/ Thoat chuong trinh");

        while (true){
            switch (scanner.nextLine()){
                case "1":
                    customer.addChuHo();
                    break;
                case "2":
                    customer.getChuHo();
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("Vui long chon so tu menu!");
            }
            System.out.println("Chon hanh dong tiep theo");
        }
    }


}

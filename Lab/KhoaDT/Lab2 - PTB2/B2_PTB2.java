package Lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class B2_PTB2 {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String exit="y";
        while (exit.equals("y")){
            System.out.println("Nhập hệ số A:");
            int hsA =Integer.parseInt(scanner.nextLine().replaceAll("\\s",""));
            System.out.println("Nhập hệ số B:");
            int hsB =Integer.parseInt(scanner.nextLine().replaceAll("\\s",""));
            System.out.println("Nhập hệ số C:");
            int hsC =Integer.parseInt(scanner.nextLine().replaceAll("\\s",""));
            ptb2(hsA,hsB,hsC);
            System.out.println("Nhập Y để tiếp tục:");
            exit=scanner.nextLine().replaceAll("\\s","");
        }
        System.out.println("Bye bye!");
    }
    public static void ptb2 (double hsA, double hsB, double hsC){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double delta=hsB*hsB - 4*hsA*hsC;
        if (delta>0){
            System.out.println("Phương trình có 2 nghiệm phân biệt là:");
            System.out.println("x1: "+decimalFormat.format((-hsB-Math.sqrt(delta))/(2*hsA)));
            System.out.println("x2: "+decimalFormat.format((-hsB+Math.sqrt(delta))/(2*hsA)));
        } else if (delta==0){
            System.out.println("Phương trình có 1 nghiệm kép là:");
            System.out.println("x: "+decimalFormat.format((-hsB/(2*hsA))));
        } else {
            System.out.println("Phương trình vô nghiệm:");
        }
    }
}


























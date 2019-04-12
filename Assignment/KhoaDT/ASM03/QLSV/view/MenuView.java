package QLSV.view;

import QLSV.model.bean.Student;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

import QLSV.controller.StudentManager;

public class MenuView {
    static Scanner scanner=new Scanner(System.in);
    String regexDecimal = "^-?\\d*\\.\\d+$";
    String regexInteger = "^-?\\d+$";
    String regexDouble = regexDecimal + "|" + regexInteger;
    Pattern pattern1 = Pattern.compile(regexDouble);
    Pattern pattern2 = Pattern.compile(regexInteger);
    Matcher matcher;

    public MenuView() {
    }

    public String getInput(){
        String input=(scanner.nextLine());
        return input;
    }
    public String menu(){
        String input;
        System.out.println("Chọn hành động từ menu bên dưới:\n"+
            "1/ Liệt kê danh sách sinh viên\n"+
            "2/ Thêm sinh viên\n"+
            "3/ Sửa thông tin sinh viên\n"+
            "4/ Xóa sinh viên\n"+
            "5/ Sắp xếp theo tên\n"+
            "6/ Thoát chương trình");
        input=(scanner.nextLine());
        return input;
    }

    public String getIdView(){
        String ID;
        System.out.println("Nhập ID sinh viên");
        ID=scanner.nextLine();
        return ID;
    }

    public String nameView(){
        String input;
        System.out.println("Cập nhật tên sinh viên");
        input=scanner.nextLine();
        return input;
    }
    public int ageView(){
        System.out.println("Cập nhật tuổi sinh viên");
        String input;
        int age;
        while (true){
            input=scanner.nextLine().trim();
            matcher= pattern2.matcher(input);
            if(matcher.find()){
                age=Integer.parseInt(input);
                if (age>0 && age<200) {
                    break;
                }else {
                    System.out.println("Tuổi không hợp lệ, vui lòng nhập lại");
                }
            }
            else {
                System.out.println("Tuổi không hợp lệ, vui lòng nhập lại");
            }
        }
        return age;
    }
    public String addressView(){
        String input;
        System.out.println("Cập nhật địa chỉ sinh viên");
        input=scanner.nextLine();
        return input;

    }
    public double gpaView(){
        System.out.println("Nhập GPA sinh viên");
        String input;
        double gpa;
        while (true){
            input=scanner.nextLine().trim();
            matcher= pattern1.matcher(input);
            if(matcher.find()){
                gpa=Integer.parseInt(input);
                if (gpa>0 && gpa<=4) {
                    break;
                }else {
                    System.out.println("GPA không hợp lệ, vui lòng nhập lại");
                }
            }
            else {
                System.out.println("GPA không hợp lệ, vui lòng nhập lại");
            }
        }
        return gpa;
    }


    public void listView (Student studentTemp, int i){
        System.out.println("Sinh viên thứ "+(i+1)+":");
        System.out.println("   +ID: "+studentTemp.getId());
        System.out.println("   +Tên: "+studentTemp.getName());
        System.out.println("   +Tuổi: "+studentTemp.getAge());
        System.out.println("   +Địa chỉ: "+studentTemp.getAddress());
        System.out.println("   +GPA: "+studentTemp.getGpa());
    }

    public boolean validate(String str){
        boolean numeric = true;
        try {
            Double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        return numeric;
    }

    public void message(String mes){
        System.out.println("***"+mes);
    }
}

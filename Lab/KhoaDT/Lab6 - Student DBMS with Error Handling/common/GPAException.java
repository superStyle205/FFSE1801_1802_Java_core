package Lab6.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GPAException extends Exception{
    String regexDecimal = "^-?\\d*\\.\\d+$";
    String regexInteger = "^-?\\d+$";
    String regexDouble = regexDecimal + "|" + regexInteger;
    Pattern pattern1 = Pattern.compile(regexDouble);
    Matcher matcher;
    private String message;
    public GPAException(){

    }

    GPAException (int a){
        if (a==0){
            message="GPA khong dung dinh dang so";
        } else {
            message="Vui long nhap so tu 0-4";
        }
    }

    public String toString(){
        return message;
    }

    public void checkGPA(String gpa) throws GPAException {
        matcher= pattern1.matcher(gpa);
        if (!matcher.find()){
            throw new GPAException(0);
        }
        if (Double.parseDouble(gpa)<0 || Double.parseDouble(gpa)>4){
            throw new GPAException(1);
        }
    }

    public String gpaCheck(String gpa){
        try{
            checkGPA(gpa);
        } catch(GPAException e){
            System.out.println(e);
            System.out.println("Vui long nhap lai");
            gpa="";
        }
        return gpa.trim();
    }

}

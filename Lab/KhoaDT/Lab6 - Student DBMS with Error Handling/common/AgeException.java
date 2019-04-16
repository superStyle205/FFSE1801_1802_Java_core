package Lab6.common;

public class AgeException extends Exception {

    private String message;
    public AgeException(){

    }
    AgeException (int a){
        if (a==0){
            message="Vui long nhap chuoi so";
        } else {
            message="Vui long nhap so tu 0-100";
        }

    }

    public String toString(){
        return message;
    }

    public void checkAge(String name) throws AgeException {
        boolean check = name.matches("[- 0-9]*");
        if (check==false){
            throw new AgeException(0);
        }
        if (Integer.parseInt(name)<0 || Integer.parseInt(name)>100){
            throw new AgeException(1);
        }
    }

    public String ageCheck(String age){
        try{
            checkAge(age);
        } catch(AgeException e){
            System.out.println(e);
            System.out.println("Vui long nhap lai");
            age="";
        }
        return age.trim();
    }
}

package Lab6.common;

public class NameException extends Exception{
    private String message;
    public NameException(){

    }

    NameException (String a){
        message=a;
    }

    public String toString(){
        return "Chuoi chi duoc chua ky tu chu va space";
    }

    public void checkName(String name) throws NameException {
        boolean check = name.matches("[a-zA-Z \\t\\n\\x0b\\r\\f]*");
        if (check==false){
            System.out.println(check);
            throw new NameException(name);
        }
    }

    public String nameCheck(String input){
        try{
            checkName(input);
        } catch(NameException e){
            System.out.println(e);
            System.out.println("Vui long nhap lai");
            input="";
        }
        return input;
    }

}

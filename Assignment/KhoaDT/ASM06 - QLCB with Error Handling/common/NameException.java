package ASM06.common;

public class NameException extends Exception{
    private String message;
    public NameException(){}
    NameException(int a){
        if (a==0){
            message="Vui long nhap ky tu chu";
        } else {
            message="Vui long nhap chuoi duoi 40 ky tu";
        }
    }

    public String toString(){
        return message;
    }

    public void checkName(String name) throws NameException {
        boolean check = name.matches("[a-zA-Z \\t\\n\\x0b\\r\\f]*");
        if (check==false){
            throw new NameException(0);
        }
        if (name.length()>40){
            throw new NameException(1);
        }
    }

    public String nameCheck(String input){
        String name=input;
        try{
            checkName(name);
        } catch (NameException e){
            System.out.println(e);
            System.out.println("Vui long nhap lai");
            name="";
        }
        return name;
    }

}

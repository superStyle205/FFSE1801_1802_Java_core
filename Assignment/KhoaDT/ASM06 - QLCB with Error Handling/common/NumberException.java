package ASM06.common;

public class NumberException extends Exception {

    private String message;
    public NumberException(){

    }
    NumberException (int a){
        if (a==0){
            message="Vui long nhap dung dinh dang so";
        } else {
            message="Vui long nhap so lon hon 0";
        }

    }

    public String toString(){
        return message;
    }

    public void checkNumberInt(String name) throws NumberException {
        boolean check = name.matches("[- 0-9]*");
        if (check==false){
            throw new NumberException(0);
        }
        if (Integer.parseInt(name)<0){
            throw new NumberException(1);
        }
    }

    public void checkNumberDouble(String name) throws NumberException {
        boolean check = name.matches("^-?\\d*\\.\\d+$*");
        if (check==false){
            throw new NumberException(0);
        }
        if (Double.parseDouble(name)<0){
            throw new NumberException(1);
        }
    }

    public int intCheck(String input){
        int number;
        while (true){
            try {
                checkNumberInt(input);
                number= Integer.parseInt(input);
                break;
            } catch (NumberException e) {
                System.out.println(e);
                number=-1;
                break;
            }
        }
        return number;
    }

    public double doubleCheck(String input){
        double number;
        try {
            checkNumberDouble(input);
            number= Double.parseDouble(input);
        } catch (NumberException e) {
            System.out.println(e);
            number=-1;
        }
        return number;
    }

}

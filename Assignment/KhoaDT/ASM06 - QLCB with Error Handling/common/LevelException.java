package ASM06.common;

import java.util.Arrays;

public class LevelException extends Exception {
    String [] levelArray;
    private String message="Vui long nhap trinh do theo yeu cau";
    public LevelException(){
        levelArray=new String []{"CU NHAN","THAC SI","TIEN SI"};
    }

    public String toString(){
        return message;
    }

    public void checkLevel(String level) throws LevelException {
        if(!Arrays.asList(levelArray).contains(level.trim().toUpperCase())){
            throw new LevelException();
        }
    }

    public String levelCheck(String input){
        String level;
        try{
            checkLevel(input.trim());
            if (input.trim().toUpperCase().equals("CU NHAN")){
                level="1";
            } else if (input.toUpperCase().equals("THAC SI")) {
                level="2";
            } else {
                level="3";
            }
        } catch (LevelException e){
            System.out.println(e);
            System.out.println("Vui long nhap lai");
            level="";
        }
        return level;
    }
}

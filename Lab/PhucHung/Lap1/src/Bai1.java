import java.util.Scanner;

public class Bai1 {
	 public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("Moi ban nhap ten : ");
	    	String ten = sc.nextLine();
	    	
	    	System.out.print("Moi ban nhap DTB :");
	    	double DTB = sc.nextDouble();
	    	
	    	System.out.printf("%s%fdiem",ten,DTB);
	    }
}

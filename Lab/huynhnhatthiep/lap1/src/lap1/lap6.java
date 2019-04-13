package lap1;


import java.util.Scanner;
import java.text.DecimalFormat;
public class lap6 {
	public static void main(String[] args) {
		int a,b;
		double nghiem;

		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		Scanner scanner = new Scanner(System.in);
		System.out.print("a");
		a = scanner.nextInt();
		System.out.print("b");
		b = scanner.nextInt();
		System.out.println("phương trình: "+a+"x +"+b+"=0.");
		if(a==0) {
			if(b==0) {
				System.out.println("phương trình vô số nghiệm");
			}
			else {
				System.out.println("phương trình vô nghiệm");
			}
		}	else {
			 
			 System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem= (double)-b/a) + ".");
		} 

	}
}


package lap1;
//package demo;
//import java.util.Scanner;
//import java.text.DecimalFormat;
//public class lap7 {
//	public static void main(String[] args) {
//		int a,b,c;
//		double nghiem;
//		float delta;
//		DecimalFormat decimalFormat = new DecimalFormat("#.##");
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("a");
//		a = scanner.nextInt();
//		System.out.print("b");
//		b = scanner.nextInt();
//		System.out.print("c");
//		c = scanner.nextInt();
//		System.out.println("phương trình: "+a+"x^2 +"+c+"=0.");
//		System.out.println("phương trình: "+a+"x +"+b+"=0.");
//		if(a==0) {
//			if(b==0) {
//				System.out.println("phương trình vô số nghiệm");
//			}
//			else {	
//				 nghiem= (double)-b/a;
//				 System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
//				
//			}
//		}
//		delta = b*b - 4*a*c ;
//		float x1;
//		float x2;
//			 if (delta > 0) {
//		            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
//		            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
//		            System.out.println("Phương trình có 2 nghiệm là: "
//		                    + "x1 = " + x1 + " và x2 = " + x2);
//		        } else if (delta == 0) {
//		            x1 = (-b / (2 * a));
//		            System.out.println("Phương trình có nghiệm kép: "
//		                    + "x1 = x2 = " + x1);
//		        } else {
//		            System.out.println("Phương trình vô nghiệm!");
//		        }
//	} 
//}

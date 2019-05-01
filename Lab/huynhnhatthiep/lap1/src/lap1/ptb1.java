package lap1;
import java.util.Scanner;
public class ptb1 {
	public static void main(String[]args) {
		System.out.println(PTB1(8,4));
		System.out.println(PTB2(1,45,2));
	
	}
		public static  String PTB1 (double heSoA, double heSoB) {
			if(heSoA == 0){
				if(heSoB == 0) {
					return "phương trình vô  nghiệm";			
				}
				else{
					return"phương trình vô sô nghiệm ";	
				}				
			}else{
				return"phương trình có 2 nghiệm:" +(-heSoB/heSoA);
				}	
		} 	 
		public static String PTB2 (double heSoA, double heSoB, double heSoC) {
			if(heSoA == 0) {
				return "phương trình vô  nghiệm";		
			} else {
				double delta = heSoB*heSoB - 4*heSoA*heSoC;
				if(delta == 0) {
					return" pt có hai nghiệm kép x1 =x2 = "+(-heSoB/(2*heSoA));
				} else if( delta<0) {
					return "phương trình vô nghiệm";
				} else {
					return "pt có 2 nghiệm phân biệt x1 ,x2 ";
				}
			}
			
			
		}
}

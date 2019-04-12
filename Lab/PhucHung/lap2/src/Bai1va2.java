
public class Bai1va2 {
	public static void main(String[] args) {
		System.out.println(PTBac1(4, 3));
		System.out.println(PTBac2(1, 3, -1));
	}

	public static String PTBac1(double a, double b) {
		if (a == 0) {
			if (b == 0) {
				return "Phuong trinh vo so nghem";
			} else{
				return "phuong trinh vo nghiem";
			}
		}
		else{
			return "Phuong trinh co 1 nghem la : x = " + (-b / a);
		}
	}

	public static String PTBac2(double a, double b, double c) {
		if (a == 0) { 
			return PTBac1(b ,c);
		} else {
			double delta = b*b - 4*a*c;
			double x1;
			double x2;
		    if(delta > 0) {
				x1 = (-b + Math.sqrt(delta)/2*a);
				x2 = (-b - Math.sqrt(delta)/2*a);
				return "Phuong trinh co 2 nghiem la:" + "x1 = " + x1 + "x2 = " + x2;
		    } else if(delta == 0) {
		    	x1 = -b / 2 * a;
		    	return "PT co 2 nghiem kep la :" + "x1 = x2 = " + x1 ;
		    } else {
		    	return "PT vo nghiem";
		    }
		}
	}
}

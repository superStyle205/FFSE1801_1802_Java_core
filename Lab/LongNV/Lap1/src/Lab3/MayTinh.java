package Lab3;

public class MayTinh {
	 double SUM(double a,double b) {
		return a + b;
	}
	 
	 double SUM(double a,double b,double c) {
		return a + b + c;
	}
	 
	double SUM(double[] numbers) {
		double SUM = 0;
		for(double i : numbers) {
			SUM += i;
		}
		return SUM;
	}

	public static void main(String[] args) {
		MayTinh mt = new MayTinh();
		System.out.println(mt.SUM(3,5));
		System.out.println(mt.SUM(3,5,8));
		System.out.println(mt.SUM(new double[] {1,2,3,4,5,6,7,8,9,9,8,7,5,2,4,7,5,6,2,1,4,7,8,5,6,2,5,9,4,9,5,4,2,1,5,4,7,5}));
		
	}
}

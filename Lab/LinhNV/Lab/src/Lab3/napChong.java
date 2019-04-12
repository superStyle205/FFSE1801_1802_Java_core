package Lab3;

public class napChong {
	double sum(double a , double b) {
		return a + b;
	}
	double sum(double a , double b, double c) {
		return a + b + c;
	}
//	double sum(double[] numbers) {
//		double sum =0;
//		for (double num : numbers) {
//			sum += num;
//		}
//		return sum;
//	}
	double sum(double... numbers) {
		double sum =0;
		for (double num : numbers) {
			sum += num;
		}
		return sum;
	}
	public static void main(String[] args) {
		napChong demo = new napChong();
		System.out.println(demo.sum(2, 3));
		System.out.println(demo.sum(2, 3));
		System.out.println(demo.sum(new double[] {1, 2, 4, 5, 6}));
		System.out.println(demo.sum(1, 2, 4, 5, 6));
	}
}

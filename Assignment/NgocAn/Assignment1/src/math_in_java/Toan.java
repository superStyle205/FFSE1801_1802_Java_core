package math_in_java;

import java.lang.Math;

public class Toan {
	public static void math() {
		System.out.println("Pi = " + Math.PI);
		System.out.println("e = " + Math.E);
		System.out.println(Math.max(22, 65));
		System.out.println(Math.min(22, 65));
		System.out.println(Math.abs(-3));
		System.out.println(Math.abs(-2.243));
		System.out.println(Math.addExact(322, -64));
		System.out.println(Math.ceil(-4.7));
		System.out.println(Math.exp(34));
		System.out.println(Math.sin(1));
		System.out.println(Math.cos(0.5));
		System.out.println(Math.tan(2));
		System.out.println(Math.atan(1));
		System.out.println(Math.floorDiv(5, 3));
		System.out.println(Math.floorMod(6, 4));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.log(2));
		System.out.println(Math.toRadians(2));
		System.out.println(Math.round(5.6));
	}

	public static void main(String[] args) {
		math();
	}

}

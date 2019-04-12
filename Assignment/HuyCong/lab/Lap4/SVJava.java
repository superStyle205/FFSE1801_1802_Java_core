package Lap4;

public class SVJava extends SVFPT{
	
	private double java;
	private double html;
	private double css;
	
	
	public SVJava() {
		
	}
	
	public SVJava(String hoTen, String nganh, double java, double html, double css) {
		super(hoTen, nganh);
		this.java = java;
		this.html = html;
		this.css = css;
	}


	public double getJava() {
		return java;
	}


	public void setJava(double java) {
		this.java = java;
	}


	public double getHtml() {
		return html;
	}


	public void setHtml(double html) {
		this.html = html;
	}


	public double getCss() {
		return css;
	}


	public void setCss(double css) {
		this.css = css;
	}
	
	public double getDiem() {
		return (2 * this.getJava() + this.getHtml() + this.getCss()) / 4;
	}
	
	@Override
	public void xuat1() {
		super.xuat1();
		System.out.println("Diem Java: " + getJava());
		System.out.println("Diem Html: " + getHtml());
		System.out.println("Diem Css: " + getCss());
		System.out.println("Diem trung binh: " + getDiem());
	}
}

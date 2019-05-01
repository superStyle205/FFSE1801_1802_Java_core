package Bai3;

public class SinhVienIT extends SinhVienFpt {
	private double java;
	private double css;
	private double html;
	
	public SinhVienIT() {
	}
	
	public SinhVienIT(String name,double java, double css, double html) {
		super();
		setName(name);
		this.java = java;
		this.css = css;
		this.html = html;
		setJob("IT");
	}

	public double getJava() {
		return java;
	}
	public void setJava(double java) {
		this.java = java;
	}
	public double getCss() {
		return css;
	}
	public void setCss(double css) {
		this.css = css;
	}
	public double getHtml() {
		return html;
	}
	public void setHtml(double html) {
		this.html = html;
	}
	
	public double getDiem() {
		return (getJava()*2 + getHtml() + getCss())/4;
	}
	
	public String getHocLuc() {
		return super.xetHocLuc();
	}
	
}

package sinhVien.model;

public class sinhVienIT extends sinhVienFpt {

	private double java;
	private double css;
	private double html;
	
	public sinhVienIT() {
		super();
	}

	public sinhVienIT(String hoTen, String nganh) {
		super(hoTen,nganh);
	}

	public sinhVienIT(String hoTen, String nganh, double java, double css, double html) {
		super(hoTen,nganh);
		this.java = java;
		this.css = css;
		this.html = html;
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

	@Override
	public double getDiemTB() {
		return (2 * this.java + this.html + this.css) / 4;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}

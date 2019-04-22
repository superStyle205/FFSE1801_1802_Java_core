public class Student {
	private int id;
	private String name;
	private int age;
	private String adress;
	private double diemTB;
	
	public Student(int id, String name, int age, String adress, double diemTB) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.diemTB = diemTB;
	}
	public String show() {
		return "Id:\t" + id + "\n"+ 
			   "name:\t" + name + "\n"+ 
			   "age :\t" + age + "\n"+ 
			   "adress :\t" + adress + "\n"+ 
			   "diemTB:\t " + diemTB;
		
	}
	public Student() {
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
}
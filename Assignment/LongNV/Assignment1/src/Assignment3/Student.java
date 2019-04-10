package Assignment3;

public class Student {
	public int ID;
	public String name;
	public int age;
	public String address;
	public double gpa;

	//constructor

	public Student(int ID,String name,int age, String address,double gpa) {
		this.setID(ID);
		this.setName(name);
		this.setAge(age);
		this.setAddress(address);
		this.setGpa(gpa);
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String showInfo() {
		//		System.out.println("Infomation");
		//		System.out.println("-ID \t: " + this.getID());
		//		System.out.println("-Name \t: " + this.getName());
		//		System.out.println("-Age \t: " + this.getAge());
		//		System.out.println("-Address \t: " + this.getAddress());
		//		System.out.println("-Gpa \t: " + this.getGpa());		
		//		
		String sv = "ID-----------------" + ID 
				+"\n - Name \t : " + name 
				+"\n - Age \t\t : " + age 
				+"\n - Address \t : " + address 
				+"\n - Gpa \t\t : " + gpa;
		return sv;
	}
}

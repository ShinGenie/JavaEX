package net.itbank.Day0408;

public class Student {
	private String name;
	private int java; // 자바과목
	private int C; // C언어과목
	protected int tot;
	protected double avg;
	
	public Student( ) { }
	

	public Student(String name, int java, int C) {
		this.name = name;
		this.java = java;
		this.C = C;
		this.getTot();
		this.getAvg();
		this.disp();
	}


	public String getName() {return name;}
	public void setName(String name) { this.name=name;}
	
	public int getJava() {	return java;}
	public void setJava(int java) {this.java=java;}

	public int getC() {	return C;	}
	public void setC(int c) {this.C=c;}

	public int getTot() {
		tot = java + C;
		return tot;	}
	public void setTot() {
		
	}

	public double getAvg() {
		avg=tot/2.0;
		return avg;}
	public void setAvg() {
		
	}//end
	
	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("자바 " + java);
		System.out.println("c언어 : " + C);
		System.out.println("=========================");
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}//end


	
	
}//class END

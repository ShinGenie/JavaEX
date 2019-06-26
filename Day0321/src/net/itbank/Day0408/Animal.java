package net.itbank.Day0408;


public class Animal {  //부모조상클래스
	
	private String name;
	
	public Animal( ) {  }  //기본생성자

	public Animal(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println("동물명 : " + name);
	}
	
	public void bark() {
		System.out.println(" Animal bark소리 ");
	}

}//class END

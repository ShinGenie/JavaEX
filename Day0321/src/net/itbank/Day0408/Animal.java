package net.itbank.Day0408;


public class Animal {  //�θ�����Ŭ����
	
	private String name;
	
	public Animal( ) {  }  //�⺻������

	public Animal(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println("������ : " + name);
	}
	
	public void bark() {
		System.out.println(" Animal bark�Ҹ� ");
	}

}//class END

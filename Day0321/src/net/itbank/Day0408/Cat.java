package net.itbank.Day0408;

public class Cat extends Animal{

    public Cat( ){ }

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void bark() {
		System.out.println("�߿˾߿�~~~�߿�");
	}
	
	public void eat() { 
		System.out.println("�ļ� : ����");
	}
	
	public void kind() {
		System.out.println("���� : ������");
	}
	
}//class END

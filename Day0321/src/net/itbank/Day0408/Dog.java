package net.itbank.Day0408;

public class Dog extends Animal{

   public Dog( ){ }

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void bark() {
		System.out.println("�۸۸۸�~~~�۸�");
	}
	
	public void eat() {
		System.out.println("�ļ� : ���ٱ�");
	}
	
	public void kind() {
		System.out.println("���� : ������");
	}
	
}//class END

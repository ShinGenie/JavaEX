package net.itbank.Day0408;

public class CatDogMain {

	public static void bark(Animal a) {
		a.bark();
	}
	
	public static void main(String[] args) {
		//������ polymorphism
		// - �پ��� ������ �����̳� ���...
		// - �ϳ��� Ŭ������ ���������� Ŭ�����ν� ǥ���Ҽ� �ְ� ����°��̴�...
		// - ��ɺ��� Ŭ������ ������ ��ӹ޾Ƽ� ��ӹ���Ŭ�������� ����
		// - ��ĳ���� ���� ��������ǥ���ϰ� �ȴ�..
		
		
		//Ÿ�� ��ġ��
		Dog d = new Dog("������");
		Cat c = new Cat("�����");
		CatDogMain.bark(d);
		CatDogMain.bark(c);
		
		System.out.println();
		d.info();
		d.bark();
		d.eat();
		d.kind();
		
		System.out.println();
		//Ÿ�� ����ġ
		Animal a = new Dog("������");// - ��ĳ���� Upcasting
		// - ����Ŭ���� ������ ������ ����Ŭ������ ��ü ������ ������ ��� ����ϴ°�.
		a.info();//�θ�Ŭ���� info����
		a.bark();//�θ�Ŭ���� bark����, �ڽ�Ŭ���� �������̵� ȣ�Ⱑ��
		//a.eat();  //�ڽ�Ŭ���� ������ ��ɸ޼ҵ�   ȣ�⿡��
		//a.kind();	//�ڽ�Ŭ���� ������ ��ɸ޼ҵ�	 ȣ�⿡��

		//�����߿�java.lang.ClassCastException , Animal cannot be cast
		//Dog b = (Dog)new Animal("������");//Downcasting X  Animal cannot be cast to
		//b.info(); //�����ǿ�������
		//b.bark(); //�����ǿ�������
	}//end
}//class END





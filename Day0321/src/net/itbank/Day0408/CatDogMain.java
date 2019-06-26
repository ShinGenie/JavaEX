package net.itbank.Day0408;

public class CatDogMain {

	public static void bark(Animal a) {
		a.bark();
	}
	
	public static void main(String[] args) {
		//다형성 polymorphism
		// - 다양한 형태의 성질이나 기능...
		// - 하나의 클래스를 여러가지의 클래스로써 표현할수 있게 만드는것이다...
		// - 기능별로 클래스를 나누어 상속받아서 상속받은클래스에서 구현
		// - 업캐스팅 통해 다형성을표현하게 된다..
		
		
		//타입 일치형
		Dog d = new Dog("강아지");
		Cat c = new Cat("고양이");
		CatDogMain.bark(d);
		CatDogMain.bark(c);
		
		System.out.println();
		d.info();
		d.bark();
		d.eat();
		d.kind();
		
		System.out.println();
		//타입 불일치
		Animal a = new Dog("강아지");// - 업캐스팅 Upcasting
		// - 상위클래스 참조형 변수에 하위클래스의 객체 공간의 정보를 담아 사용하는것.
		a.info();//부모클래스 info존재
		a.bark();//부모클래스 bark존재, 자식클래스 오버라이딩 호출가능
		//a.eat();  //자식클래스 고유한 기능메소드   호출에러
		//a.kind();	//자식클래스 고유한 기능메소드	 호출에러

		//실행중에java.lang.ClassCastException , Animal cannot be cast
		//Dog b = (Dog)new Animal("강아지");//Downcasting X  Animal cannot be cast to
		//b.info(); //문법의에러없음
		//b.bark(); //문법의에러없음
	}//end
}//class END





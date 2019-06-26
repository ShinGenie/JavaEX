package net.itbank.Day0403;

class Dog{

	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String tostring() {
		return this.name+":"+this.age;
	}
}//class end



public class ObjectArrayMain {
	
	public static void main(String[]args) {
		Dog[] dog=new Dog[5];
		
		dog[0]= new Dog("����",1);
		dog[1]= new Dog("����",3);
		dog[2]= new Dog("����",7);
		dog[3]= new Dog("�ֺ�",5);
		dog[4]= new Dog("���",8);
		
		for(int i=0;i<dog.length;i++) {	
			System.out.println("Dog["+i+"]:"+dog[1]);
		}
	}//main end
	
}//class end

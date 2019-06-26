package net.itbank.Day0403;

import java.util.Scanner;

class Cat{
	private String name;
	private int age;
	private double weight;

	public String disp() {
		return this.name+":"+this.age+this.weight;
	}

	public Cat() {}


	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public double getWeight() {return weight;}
	public void setWeight(double weight) {this.weight = weight;}


}//class end


public class ObjectArrayMainCat {

	public static void main(String[]args) {

		Cat ct = new Cat();
		Scanner sc = new Scanner(System.in);
		System.out.println("고양이 이름:");
		String a=sc.next();
		System.out.println("고양이 나이:");
		int b=sc.nextInt();
		System.out.println("고양이 무게:");
		double c=sc.nextDouble();

		ct.setName(a);
		ct.setAge(b);
		ct.setWeight(c);
		System.out.println(ct.disp());

		Cat ca= new Cat();
		System.out.print("이름 나이?");
		String aa = sc.next();
		int bb=sc.nextInt();
		ca.setName(aa);
		ca.setAge(bb);

		Cat[] cc=new Cat[3];
		for(int i=0;i<cc.length;i++) {
			cc[i]=new Cat();
			System.out.print("이름 나이?");
			String aaa = sc.next();
			int bbb = sc.nextInt();
			cc[i].setName(aaa);
			cc[i].setAge(bbb);
		}
	}//main end
}//class end

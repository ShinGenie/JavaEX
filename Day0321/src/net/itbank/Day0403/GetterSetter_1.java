package net.itbank.Day0403;

import java.util.Scanner;

/**
 * @author jn
 * Cat2 Ŭ���� �����
 * ����� �̸� ������ ������ ���ϱ�
 * get set �޼ҵ� �̿�
 * �����ڸ����
 */

class Cat2{

	String Name;
	int Age;
	double weight;

	Cat2(){}

	public String getName() {return Name;}
	public void setName(String name) {Name = name;}
	public int getAge() {return Age;}
	public void setAge(int age) {Age = age;}
	public double getWeight() {return weight;}
	public void setWeight(double weight) {this.weight = weight;}

	public void disp(){
	getName();
	getAge();
	getWeight();
	System.out.println("����� �̸� ���� ������?"+getName()+getAge()+getWeight());
	}
}

public class GetterSetter_1 {

	public static void main(String[] args) {



		Cat2[] Cat2 = new Cat2[3];

		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=0;i++){
			Cat2[i]=new Cat2();
			System.out.println("����� �̸�?");
			String a = sc.next();
			System.out.println("����� ����");
			int b = sc.nextInt();
			System.out.println("����� ������?");
			double c = sc.nextDouble();
			Cat2[i].setName(a);
			Cat2[i].setAge(b);
			Cat2[i].setWeight(c);
			Cat2[i].disp();
		}
		
		
	}
}//class end

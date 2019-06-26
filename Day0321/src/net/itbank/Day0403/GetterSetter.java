package net.itbank.Day0403;

import java.util.*;

class Cat1{ // 고양이 이름 나이 생일
	String name;
	int age;
	double weight;
	
	Cat1(){}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void disp() {
		System.out.println("고양이 이름: "+this.name+"\t나이: "+this.age+"\t몸무게:"+this.weight);
	}
	
}



public class GetterSetter {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("고양이 이름 나이 몸무게는?");
//		String a=sc.next();
//		int b=sc.nextInt();
//		double c=sc.nextDouble();
//		
//		Cat1 ct=new Cat1();
//		ct.setName(a);
//		ct.setAge(b);
//		ct.setWeight(c);
//		ct.disp();
		
		
		Cat1 [] ca = new Cat1[3];
		
		for(int i=0;i<3;i++) {
			ca[i]=new Cat1();
			String aa=sc.next();
			int bb=sc.nextInt();
			double cc=sc.nextDouble();
			ca[i].setName(aa);
			ca[i].setAge(bb);
			ca[i].setWeight(cc);
			ca[i].disp();
		}
		
	}//main end
}//class end

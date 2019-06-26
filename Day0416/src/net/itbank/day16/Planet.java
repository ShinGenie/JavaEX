package net.itbank.day16;

public enum Planet { //Planet.java, Planet.class
   MERCURY(542.98, 3.234), EARTH(23.12, 5.932);
	
	double weight;
	double radius;

  Planet(double r, double w){ //생성자제한자 public기술하면 에러발생 
		radius = r;
		weight = w;
	}
	
	public double getGravity() { //무게 가져오는것
		return 6.16-11*weight/(radius*radius);
	}
}//행성 열거형

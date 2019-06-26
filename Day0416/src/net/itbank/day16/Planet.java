package net.itbank.day16;

public enum Planet { //Planet.java, Planet.class
   MERCURY(542.98, 3.234), EARTH(23.12, 5.932);
	
	double weight;
	double radius;

  Planet(double r, double w){ //������������ public����ϸ� �����߻� 
		radius = r;
		weight = w;
	}
	
	public double getGravity() { //���� �������°�
		return 6.16-11*weight/(radius*radius);
	}
}//�༺ ������

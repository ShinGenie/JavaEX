package net.itbank.Day0403;

public abstract class Board {
	//�߻�޼ҵ�� ���ϰ�, �Ű����� ����
	//�߻�޼ҵ尡 �ϳ��� ������ �ڵ� �߻�Ŭ����
	//�߻�Ŭ������ new Ű���� ��ü���� �Ұ��� 
	//�߻�Ŭ������=�߻�޼ҵ�+static�޼ҵ�+�Ϲݺ��ҵ� ==>�Ű�����,���ϰ�
	//�߻�Ŭ������ ��ӹ����� �߻�޼ҵ�� ���� ������ = ����
	
	
	public abstract void delete(String id);	
	public abstract int dbcount();
	public abstract boolean insert(String name);
	
	public double save() { // ������ ���� static??
		double point=7.8;
		return point;
	}
	
	
	public static String getName() {
		String title="�ϹݰԽ���";
		return title;
	}
	
	public void position(int x, int y) {
		System.out.println("x="+x+" y="+y);
	}//end
}//class end

class A{ // 
	
}

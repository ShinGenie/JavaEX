package net.itbank.Day0327;

public class Lotto {

	public static void main(String[] args) { // static ����  // �����Լ��� ������ static���� ����
		// TODO Auto-generated method stub
		// note();  ������ ������ static �������� non-static �Լ��� ȣ���Ҽ� ����
		// main �Լ� �ȿ����� ����Ҽ� �ִ�.
		new Lotto(); // ��ü�� �����ϱ⸸ �� = Ȱ�����
		Lotto lucky = new Lotto(); // lucky��� ��ü�� ���� 
		lucky.title(); // ��Ű���� Ŭ������ �޸𸮿� �Ҵ��ϰ� ��Ʈ�� �ҷ��´� - static�� ���� �ͳ��� �ҷ��ü� �ִ�. 
		String a=lucky.title();
		System.out.println("å�̸��� "+ a +" �Դϴ�"); 
		
		System.out.println("å������ "+ Lotto.price()+" �Դϴ�");
		Lotto.auto();


		Lotto.note();
		lucky.anote();
		// book(), price() �޼ҵ带 main�Լ����� ���� ȣ��
	}//main end

	private void anote() {
		// TODO Auto-generated method stub
		
	}

	private static void auto() {
		// TODO Auto-generated method stub
		
	}

	public String title() {
		String title="������";
		return title;
	}//end
	
	public static int price() {
		int money=2500;
		return money;
	}//end
	
	//���� Ŭ�������� non-static �Լ����� ȣ�Ⱑ�� 
	public static void note() {
	}
	
	
}//class end

package net.itbank.Day0408;

public  class MobileEx extends Mobile {
	  //MobileŬ������ӹ޾Ƽ� �ڽ��� �׸��߰�
	  //���� String card
	  //�Ⱓ int month(12��)
	private String card; //����ī��
	private int month; // �����Ⱓ
	
	public MobileEx() {	}
	public MobileEx(String card, int month,String name, String tel, int price) {
		super(name, tel, price); // �θ��� ������   - �θ��� �����ڴ� ���� �� ���� ��ġ �ؾ� ��������
		this.card=card;
		this.month=month;
	}
	
	@Override
	public void display() {
		super.display(); // �θ��� disp()  // ��ġ ��������� �θ�ϱ� ���ϼ� �����ֱ�
		System.out.println("����ī��:"+this.card);
		System.out.println("�����Ⱓ:"+this.month);
	}
	
	public String getCard() {return card;}
	public void setCard(String card) {this.card = card;}
	public int getMonth() {return month;}
	public void setMonth(int month) {this.month = month;}
	

}//class END

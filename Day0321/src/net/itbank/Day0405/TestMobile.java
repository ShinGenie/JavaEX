package net.itbank.Day0405;

public class TestMobile {
	
	private String name;//��Ż��̸�
	private String tel;//����ȣ
	private int price;//�����
	
	public TestMobile() {}
	
	public TestMobile(String name, String tel, int price) {
		this.setName(name);
		this.setTel(tel);
		this.setPrice(price);
	}//end
	
	public TestMobile(String name) {
		super();
		this.setName(name);
		this.setPrice(20);
	}//end
	
	public String getName() { return name;}
	public void setName(String name) {this.name = name;}
	public String getTel() {return tel;}
	public void setTel(String tel) {this.tel = tel;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	
	public void disp() { // �Լ��ߺ� = overloading
		this.setName(name);
		this.setTel(tel);
		this.setPrice(price);
		System.out.println("�� : "+this.name);
		System.out.println("��ȣ : "+this.tel);
		System.out.println("���� : "+this.price);
	}
	public void disp(int y) { // �Լ��ߺ� = overloading		
	System.out.println("["+y+"��]"+this.name+" "+this.tel+" "+this.price);
	}
	public void disp(String com, int y) { // �Լ��ߺ� = overloading
	System.out.println("��Ż� "+com+"["+y+"��]"+this.name+" "+this.tel+" "+this.price);	
	}
	
	//��Ŭ�� -> source-> Generate Getters and Setters... click
}//class end





























package net.itbank.Day0408;

public  class Mobile {
	private String name; //������
	private String tel;  //������
	private int price;  //��������
	
	// �����ڵ� �ߺ����� = overloading �޼ҵ� �ߺ�.�����ڵ� �ߺ����� 
	public Mobile() { } //�⺻������
	public Mobile(String name) { 
		this.name = name;
	}
	public Mobile(String name, String tel, int price) {
		this.name=name;
		this.tel=tel;
		this.price=price;
	}
	
	public String getName() {return name;	}
	public void setName(String name) {this.name = name;	}
	public String getTel() {return tel;	}
	public void setTel(String tel) {this.tel = tel;	}
	public int getPrice() {return price;	}
	public void setPrice(int price) {this.price = price;}
	
	public void display( ) {//�Լ��ߺ�=OverLoading
		System.out.println("������:"+this.name); //this��������
		System.out.println("���ȸ��:"+this.tel); //this��������
		System.out.println("��������:"+this.price +"��"); //this��������
	}//end
	
	
	public void display(int y) {//�Լ��ߺ�=OverLoading
		System.out.println("["+y+"��] " +this.name+" "+ this.tel+" "+this.price);
	}
	
	public void display(String com, int y) { //�Լ��ߺ�=OverLoading
		System.out.println("[��Ż�:"+com+"  �⵵:"+y+"]"+name+" "+tel+" "+price);
	}//end
	
}//class END

package net.itbank.Day0405;

public class TestMobile {
	
	private String name;//통신사이름
	private String tel;//폰번호
	private int price;//요금제
	
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
	
	public void disp() { // 함수중복 = overloading
		this.setName(name);
		this.setTel(tel);
		this.setPrice(price);
		System.out.println("모델 : "+this.name);
		System.out.println("번호 : "+this.tel);
		System.out.println("가격 : "+this.price);
	}
	public void disp(int y) { // 함수중복 = overloading		
	System.out.println("["+y+"년]"+this.name+" "+this.tel+" "+this.price);
	}
	public void disp(String com, int y) { // 함수중복 = overloading
	System.out.println("통신사 "+com+"["+y+"년]"+this.name+" "+this.tel+" "+this.price);	
	}
	
	//우클릭 -> source-> Generate Getters and Setters... click
}//class end





























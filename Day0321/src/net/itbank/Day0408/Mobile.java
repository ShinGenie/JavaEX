package net.itbank.Day0408;

public  class Mobile {
	private String name; //신형모델
	private String tel;  //신형모델
	private int price;  //최적가격
	
	// 생성자도 중복가능 = overloading 메소드 중복.생성자도 중복가능 
	public Mobile() { } //기본생성자
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
	
	public void display( ) {//함수중복=OverLoading
		System.out.println("신형모델:"+this.name); //this생략가능
		System.out.println("통신회사:"+this.tel); //this생략가능
		System.out.println("최적가격:"+this.price +"원"); //this생략가능
	}//end
	
	
	public void display(int y) {//함수중복=OverLoading
		System.out.println("["+y+"년] " +this.name+" "+ this.tel+" "+this.price);
	}
	
	public void display(String com, int y) { //함수중복=OverLoading
		System.out.println("[통신사:"+com+"  년도:"+y+"]"+name+" "+tel+" "+price);
	}//end
	
}//class END

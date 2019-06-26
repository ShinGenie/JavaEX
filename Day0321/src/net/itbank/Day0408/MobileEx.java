package net.itbank.Day0408;

public  class MobileEx extends Mobile {
	  //Mobile클래스상속받아서 자식이 항목추가
	  //결재 String card
	  //기간 int month(12월)
	private String card; //제휴카드
	private int month; // 약정기간
	
	public MobileEx() {	}
	public MobileEx(String card, int month,String name, String tel, int price) {
		super(name, tel, price); // 부모의 생성자   - 부모의 생성자는 가장 맨 위에 위치 해야 에러없음
		this.card=card;
		this.month=month;
	}
	
	@Override
	public void display() {
		super.display(); // 부모의 disp()  // 위치 상관없으나 부모니까 통일성 지켜주기
		System.out.println("제휴카드:"+this.card);
		System.out.println("약정기간:"+this.month);
	}
	
	public String getCard() {return card;}
	public void setCard(String card) {this.card = card;}
	public int getMonth() {return month;}
	public void setMonth(int month) {this.month = month;}
	

}//class END

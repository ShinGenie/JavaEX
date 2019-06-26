package net.itbank.Day0408;

public  class MobileTest {
	public static void main(String[] args) {
		MobileEx me = new MobileEx();
		me.setName("갤럭시");
		me.setPrice(520000);
		me.setTel("0275DAE");
		me.setMonth(24);
		me.setCard("국민카드");
		me.display();
		//set메소드(값) 메소드 사용해서 데이터 주입
		//변경데이터는 필드로 전달 
		//필드의 리턴값을 getXXX();
		
		//프로그램 작성에서 데이터변경담당 setter(변경되는 값)
		//프로그램 작성에서 데이터리턴담당 getter()
	}//end
	
}//class END

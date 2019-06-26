package net.itbank.Day0327;

public class Lotto {

	public static void main(String[] args) { // static 영역  // 메인함수는 무조건 static으로 간다
		// TODO Auto-generated method stub
		// note();  에러인 이유는 static 영역에서 non-static 함수를 호출할수 없음
		// main 함수 안에서만 출력할수 있다.
		new Lotto(); // 객체를 생성하기만 함 = 활용못함
		Lotto lucky = new Lotto(); // lucky라는 객체를 생성 
		lucky.title(); // 럭키에다 클래스를 메모리에 할당하고 노트를 불러온다 - static이 없는 것끼리 불러올수 있다. 
		String a=lucky.title();
		System.out.println("책이름은 "+ a +" 입니다"); 
		
		System.out.println("책가격은 "+ Lotto.price()+" 입니다");
		Lotto.auto();


		Lotto.note();
		lucky.anote();
		// book(), price() 메소드를 main함수에서 직접 호출
	}//main end

	private void anote() {
		// TODO Auto-generated method stub
		
	}

	private static void auto() {
		// TODO Auto-generated method stub
		
	}

	public String title() {
		String title="보물섬";
		return title;
	}//end
	
	public static int price() {
		int money=2500;
		return money;
	}//end
	
	//같은 클래스에서 non-static 함수끼리 호출가능 
	public static void note() {
	}
	
	
}//class end

package net.itbank.Day0329;
import java.util.*;

public class GameAi {

		//기본생성자=생략가능,new키워드 다음에 기술, 리턴값 없어도 void 기술안함.
		//생성자는 클래스와 동일
		//생성자는 여러개 기술가능=중복가능=영어로 OverLoading=오버로딩
	//public GameAi() {System.out.println("GameAi기본생성자");}//생략가능
	public GameAi(String nic,int year) {}
//	public GameAi1(String name,int month) {}
	
		public void make() {
			System.out.println("non-static영역 make메소드");
			System.out.println("non-static영역 make스마트");
		}//end

}//class end

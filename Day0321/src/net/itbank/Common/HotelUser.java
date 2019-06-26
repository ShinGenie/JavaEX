package net.itbank.Common;
import java.util.*;

class Hotel{

	boolean[]sk=new boolean[5];
	int roomsu=5;
	String sm="";// 현재클래스를 가르키는 키워드 this

	public Hotel() {}
	public Hotel(String name) {this.sm=name;}

	void input(int rn) {
		if(sk[rn-1]==true) {
			System.out.println("퇴실취소성공, 방은 이미 예약한 상태입니다");
		}else {
			sk[rn-1]=true; //예약했으니 true로 저장
			System.out.println(rn+"방 예약 성공하셨습니다");
		}
	}
	void output(int rn) {
		if(sk[rn-1]==true) {
			System.out.println(rn+"방 예약 취소하셨습니다");
			sk[rn-1]=false;// 초기화
		}else {
			sk[rn-1]=true;
			System.out.println(rn+"방 빈방이라서 예약취소 안됩니다");
		}
	}
	void list() {
		System.out.println("***"+sm+"예약현황***");
		for(int i=0;i<sk.length;i++) {
			if(sk[i]==true) {
				System.out.println(" "+(i+1)+"좌석 사용중입니다");
			}else {
				System.out.println(" "+(i+1)+"좌석 사용중입니다");
			}
		}//for end
	}

}//class end


class HotelUser{
	public HotelUser(){}


	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Hotel ht=new Hotel();
		HotelUser hu = new HotelUser();
		int ret=1;
		while(true) {
			System.out.print("1.입실2.퇴실3.예약현황4.종료");
			int select= sc.nextInt();
			if(select==1) {ret=hu.user("입실", 5); ht.input(ret);}
			else if(select==2) {ret=hu.user("퇴실", 5); ht.output(ret);}
			else if(select==3) {ht.list();}
			else if(select==4) {break;}
		}
	}//main end

	public int user(String msg,int max) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		do{
			System.out.println(">>> " + msg +"할 방번호입력? ");
			a=sc.nextInt();
		}
		while(a<1||a>max);
		return a;
	}
}




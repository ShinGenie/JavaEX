package net.itbank.Common;
import java.util.*;

class Hotel{

	boolean[]sk=new boolean[5];
	int roomsu=5;
	String sm="";// ����Ŭ������ ����Ű�� Ű���� this

	public Hotel() {}
	public Hotel(String name) {this.sm=name;}

	void input(int rn) {
		if(sk[rn-1]==true) {
			System.out.println("�����Ҽ���, ���� �̹� ������ �����Դϴ�");
		}else {
			sk[rn-1]=true; //���������� true�� ����
			System.out.println(rn+"�� ���� �����ϼ̽��ϴ�");
		}
	}
	void output(int rn) {
		if(sk[rn-1]==true) {
			System.out.println(rn+"�� ���� ����ϼ̽��ϴ�");
			sk[rn-1]=false;// �ʱ�ȭ
		}else {
			sk[rn-1]=true;
			System.out.println(rn+"�� ����̶� ������� �ȵ˴ϴ�");
		}
	}
	void list() {
		System.out.println("***"+sm+"������Ȳ***");
		for(int i=0;i<sk.length;i++) {
			if(sk[i]==true) {
				System.out.println(" "+(i+1)+"�¼� ������Դϴ�");
			}else {
				System.out.println(" "+(i+1)+"�¼� ������Դϴ�");
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
			System.out.print("1.�Խ�2.���3.������Ȳ4.����");
			int select= sc.nextInt();
			if(select==1) {ret=hu.user("�Խ�", 5); ht.input(ret);}
			else if(select==2) {ret=hu.user("���", 5); ht.output(ret);}
			else if(select==3) {ht.list();}
			else if(select==4) {break;}
		}
	}//main end

	public int user(String msg,int max) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		do{
			System.out.println(">>> " + msg +"�� ���ȣ�Է�? ");
			a=sc.nextInt();
		}
		while(a<1||a>max);
		return a;
	}
}




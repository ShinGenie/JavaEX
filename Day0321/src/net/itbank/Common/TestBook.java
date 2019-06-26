package net.itbank.Common;
import java.util.*;
public class TestBook {
// �ʵ弱�� 3���ǹ�*5���� 
	int floor;//��
	int room;//ȣ	
	String[][] name=new String[3][5];
	String title, msg;
	int sel=0;
	Scanner sc=new Scanner(System.in);
	//1.���� 2.��� 3.�� 4.�� 5.����
	
	public TestBook() {} //������
	public TestBook(String name) {
		System.out.println("********************************");
		System.out.println(name+"�� ���� �� ȯ���մϴ�");
		System.out.println("********************************");
	}
	
	
	public void checkIn() {//�Խ� �� �������
		System.out.println("��ǿ� �Խ��Ͻðھ��?");
		int floor=Integer.parseInt(sc.next());
		System.out.println("��ȣ�� �Խ��Ͻðھ��?");
		int room=Integer.parseInt(sc.next());
		if(name[floor-1][room-1]!=null){
			System.out.println("�̹� ����� ���Դϴ�");
			}else{
				System.out.println("�����Ͻ� ������ �˷��ּ���");
				name[floor][room]=sc.next();
				System.out.println("����Ǿ����ϴ�");}
	}//checkOut end
	
	public void checkOut() {// ��ǹ� �����ּ�
		System.out.print("����Ͻ� ���� ������ �����ּ���");
		String user=sc.next();
		for(int i=0;i<name.length;i++){
			for(int j=0;j<name[0].length;j++){
				if(user.equals(name[i][j])){
					System.out.println("��ǿϷ�Ǽ̽��ϴ�");
					name[i][j]=null;
					return;
				}else if(!user.equals(name[i][j])){
					System.out.println("�ʱ�ȭ������ ���ư��ϴ�");
					return;
					}
			}
		}
	}//checkOut end
	
	public void showStatus() { // map()�Լ������ ����
		System.out.println("[������Ȳ]");
		String msg="";
		int i,j=0;
		
		for(i=0;i<name.length;i++) {
			for(j=0;j<name[0].length;j++) {
				System.out.print((i+1)+"0"+(j+1)+"\t");
				}
				System.out.println();
			for(j=0;j<name[0].length;j++) {	
				if(name[i][j]==null){
					System.out.print(msg+"\t");
					}else {
						msg=name[i][j];
						System.out.print(msg+"\t");
					}
			}
					System.out.println();
			
			System.out.println("\n------------------------------------");
		}
		
	}//ShowStatus end
	
	public void map() {// showStatus()�Լ������ ����
		
	}//map end
	
	public void process() {
		TestBook tb = new TestBook();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("1.���� 2.���3.show 4.����?");
		int su=sc.nextInt();
		
		if(su==1) {
			checkIn();
		}
		if(su==2) {
			checkOut();
		}
		if(su==3) {
			showStatus();
		}
		if(su==4) {break;}
		
		}//while end
		
	}//process end
	
	public static void main(String[] args) {
		TestBook tb = new TestBook("������ �ι�");
		tb.process();
	}//end

}//class end

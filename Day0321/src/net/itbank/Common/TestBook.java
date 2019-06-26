package net.itbank.Common;
import java.util.*;
public class TestBook {
// 필드선언 3층건물*5개방 
	int floor;//층
	int room;//호	
	String[][] name=new String[3][5];
	String title, msg;
	int sel=0;
	Scanner sc=new Scanner(System.in);
	//1.투숙 2.퇴실 3.맵 4.쇼 5.종료
	
	public TestBook() {} //생성자
	public TestBook(String name) {
		System.out.println("********************************");
		System.out.println(name+"에 오신 걸 환영합니다");
		System.out.println("********************************");
	}
	
	
	public void checkIn() {//입실 및 예약취소
		System.out.println("몇실에 입실하시겠어요?");
		int floor=Integer.parseInt(sc.next());
		System.out.println("몇호에 입실하시겠어요?");
		int room=Integer.parseInt(sc.next());
		if(name[floor-1][room-1]!=null){
			System.out.println("이미 예약된 방입니다");
			}else{
				System.out.println("예약하실 성함을 알려주세요");
				name[floor][room]=sc.next();
				System.out.println("예약되었습니다");}
	}//checkOut end
	
	public void checkOut() {// 퇴실및 예약최소
		System.out.print("퇴실하실 고객님 성함을 적어주세요");
		String user=sc.next();
		for(int i=0;i<name.length;i++){
			for(int j=0;j<name[0].length;j++){
				if(user.equals(name[i][j])){
					System.out.println("퇴실완료되셨습니다");
					name[i][j]=null;
					return;
				}else if(!user.equals(name[i][j])){
					System.out.println("초기화면으로 돌아갑니다");
					return;
					}
			}
		}
	}//checkOut end
	
	public void showStatus() { // map()함수기능이 동일
		System.out.println("[예약현황]");
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
	
	public void map() {// showStatus()함수기능이 동일
		
	}//map end
	
	public void process() {
		TestBook tb = new TestBook();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("1.투숙 2.퇴실3.show 4.종료?");
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
		TestBook tb = new TestBook("스페인 민박");
		tb.process();
	}//end

}//class end

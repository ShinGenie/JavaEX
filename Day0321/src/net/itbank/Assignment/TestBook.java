package net.itbank.Assignment;

import java.util.Scanner;

public class TestBook {
	Scanner sc = new Scanner(System.in);
	TestBook(){}
	TestBook(String name){
		System.out.println("====" + name  + "에 오신 것을 환영합니다====");
	}

	int floor=0;
	int room=0;
	String[][] hotel = new String [3][5];
	String name;

		public void checkIn(){//1.몇층2.몇호3.성함4.예약되셨습니다.
			System.out.println("몇층예약?");
			floor=sc.nextInt();
			System.out.println("몇호예약?");
			room=sc.nextInt();

//			String hotel[floor][room]=name;
		
			if(!(hotel[floor-1][room-1]==null)){//**
				System.out.println("이미 예약되셨습니다");
			}else if(hotel[floor-1][room-1]==null){//**
				System.out.println("성함이 무엇입니까?");
				String msg=sc.next();
				hotel[floor-1][room-1]=msg;
				System.out.println(msg+"님 "+floor+"0"+room+"호 예약되셨습니다");
			}
		}//end

		
		public void checkOut(){//1.성함확인2.일치하면-퇴실,불일치-일치안한다 리턴
			System.out.println("성함이 무엇입니까???");
			name=sc.next(); 
			for(int a=0;a<hotel.length;a++) {
				for(int b=0;b<hotel[0].length;b++) {
					if(name.equals(hotel[a][b])){//** String String 비교는 name.equals()
						System.out.println("퇴실하셨습니다");
						hotel[a][b]=null;//**
					}
				}//end
			}
		}//end

			public void status(){//케이스문 1.예약2.퇴실3.예약상황4.종료
				while(true){
				System.out.println("1.예약 2.퇴실 3.예약상황 4.종료");
				String user=sc.next();
				switch(user){
				case "1":
					checkIn();break;
				case "2":
					checkOut();break;
				case "3":
					map();break;
				case "4": System.exit(0);break;
				default : break;
				}
			}
		}//class end

		public void map(){//map
			for(int a=0;a<hotel.length;a++){
				for(int b=0;b<hotel[0].length;b++){
					System.out.print((a+1)+"0"+(b+1)+"\t");
				}
				System.out.println();
				for(int b=0;b<hotel[0].length;b++){
					if(hotel[a][b]==null){
						System.out.print(" \t");
					}else{
						System.out.println(hotel[a][b]+" \t");}//**
				}
				System.out.println();
			}
			}//method end

		public static void main(String[]args){
			TestBook tb = new TestBook("스페인민박");
//			tb.checkIn();
//			tb.checkOut();
			tb.status();
		}//main end

		}//class end





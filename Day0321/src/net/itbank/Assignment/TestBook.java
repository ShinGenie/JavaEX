package net.itbank.Assignment;

import java.util.Scanner;

public class TestBook {
	Scanner sc = new Scanner(System.in);
	TestBook(){}
	TestBook(String name){
		System.out.println("====" + name  + "�� ���� ���� ȯ���մϴ�====");
	}

	int floor=0;
	int room=0;
	String[][] hotel = new String [3][5];
	String name;

		public void checkIn(){//1.����2.��ȣ3.����4.����Ǽ̽��ϴ�.
			System.out.println("��������?");
			floor=sc.nextInt();
			System.out.println("��ȣ����?");
			room=sc.nextInt();

//			String hotel[floor][room]=name;
		
			if(!(hotel[floor-1][room-1]==null)){//**
				System.out.println("�̹� ����Ǽ̽��ϴ�");
			}else if(hotel[floor-1][room-1]==null){//**
				System.out.println("������ �����Դϱ�?");
				String msg=sc.next();
				hotel[floor-1][room-1]=msg;
				System.out.println(msg+"�� "+floor+"0"+room+"ȣ ����Ǽ̽��ϴ�");
			}
		}//end

		
		public void checkOut(){//1.����Ȯ��2.��ġ�ϸ�-���,����ġ-��ġ���Ѵ� ����
			System.out.println("������ �����Դϱ�???");
			name=sc.next(); 
			for(int a=0;a<hotel.length;a++) {
				for(int b=0;b<hotel[0].length;b++) {
					if(name.equals(hotel[a][b])){//** String String �񱳴� name.equals()
						System.out.println("����ϼ̽��ϴ�");
						hotel[a][b]=null;//**
					}
				}//end
			}
		}//end

			public void status(){//���̽��� 1.����2.���3.�����Ȳ4.����
				while(true){
				System.out.println("1.���� 2.��� 3.�����Ȳ 4.����");
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
			TestBook tb = new TestBook("�����ιι�");
//			tb.checkIn();
//			tb.checkOut();
			tb.status();
		}//main end

		}//class end





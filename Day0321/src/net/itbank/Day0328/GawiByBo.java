package net.itbank.Day0328;

import java.util.Scanner;
import java.util.Random;

public class GawiByBo {

	public static void main(String[] args) {
		//��� �������� ��
		Scanner sc=new Scanner(System.in);
		while(true){
			try{

				System.out.println("����:1�� ����:2�� ��:3�� �� ���� �ϳ��� �����Ͻÿ�\n");
				int user=Integer.parseInt(sc.nextLine());
				if(user==0){System.exit(0);}

				//���� �ļ� 1,2,3
				int com=(int)(Math.random()*3)+1;


				switch(user){
				case 1:
					System.out.println("user���� �����Դϴ�");
					break;
				case 2:
					System.out.println("user���� �����Դϴ�");
					break;
				case 3:
					System.out.println("user���� ���Դϴ�");
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�");
					continue;
				}

				switch(com){
				case 1:
					System.out.println("com���� �����Դϴ�");
					break;
				case 2:System.out.println("com���� �����Դϴ�");break;
				case 3:System.out.println("com���� ���Դϴ�");break;
				}


				//�ε���
				System.out.print("\n��ø� ��ٷ��ּ���!...");
				try{
					Thread.sleep(1000);
					}catch(InterruptedException e){
						
					};			
				System.out.println("��ø� ��ٷ��ּ���!...");
				try{
					Thread.sleep(1000);
					}catch(InterruptedException e){};


				//����ȳ���
				System.out.println("���������� ����Դϴ�\n");

				//�������ǰ��
				if(user==com){
					System.out.println("�����ϴ�\n");
					}

				if(user==1 && com==3){
					System.out.println("user���� �̰���ϴ�\n");
				}else if(user==1 && com==2){
					System.out.println("���� �̰���ϴ�\n");
				}

				if(user==2 && com==1){
					System.out.println("user���� �̰���ϴ�\n");
				}
				else if(user==2 && com==3){
					System.out.println("���� �̰���ϴ�\n");
				}

				if(user==3 && com==2){
					System.out.println("user���� �̰���ϴ�\n");
				}else if((user==3 && com==1)){
					System.out.println("���� �̰���ϴ�\n");
				}
				System.out.println("�����Ϸ��� ���� 0�� �����ּ���"); 

				//�ε���
				try{Thread.sleep(4000);}catch(InterruptedException e){}; continue;	

			}catch(Exception e){System.out.println("���ڷθ� �Է����ּ���");}continue;



		}//while end




	}//main end
}//class end

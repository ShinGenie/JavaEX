package net.itbank.Day0322;
import java.util.Random;
import java.util.Scanner;
public class TestArrayInput {
	public static void main(String[] args) {

		//while, for�ݺ��� ����� ������ ����
		//Integer.parseInt(StringŸ��)
		//�ζǼ��� 6�� ���� 1~45 ���ڸ� �Է�, �����Է�, �Ǽ��Է��ϸ� ���Է½õ�

		int su[]=new int[6];
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<6; i++) {	
			
			System.out.print("su ["+(i+1)+"] =");
			try {
				su[i]=Integer.parseInt(sc.nextLine());
				if(su[i]<=0 || su[i]>46) {
					System.out.println("1~45 ������ ���� �����ÿ�");--i;continue;}
			}catch(NumberFormatException e) {System.out.println("�Ǽ����� ���� 1~45 ���� ���Է��Ͻÿ�");
			--i;
			continue;
			}catch(Exception e) {System.out.println("���ڸ��� ���� 1~45 ���� ���Է��Ͻÿ�");
			e.printStackTrace();
			--i;
			continue;
			} 
			}
			for(int i=0;i<6;i++) {
				System.out.print(su[i]+"\t");
			}
			//for�� ���� ����ó�� ���߿� --i�� ������Ѵ�. 
			//while�� ������ ���⶧���� for�� ���� ����ó�� ���߿� --i�� ���� �ʿ䰡 ����. 


	}//main end
}//class 

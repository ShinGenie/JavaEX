package net.itbank.Day0322;
import java.util.Random;
import java.util.Scanner;
public class TestWhile {
	public static void main(String[] args) {

		//while, for�ݺ��� ����� ������ ����
		//Integer.parseInt(StringŸ��)
		//�ζǼ��� 6�� ���� 1~45 ���ڸ� �Է�, �����Է�, �Ǽ��Է��ϸ� ���Է½õ�

		int su[]=new int[6];
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<6) {
			System.out.print("su["+i+"]=");
			//i++;
			try {
				su[i]=Integer.parseInt(sc.nextLine());
				if(su[i]<=0 || su[i]>46) {
					System.out.println("1~45 ������ ���� �����ÿ�");
					continue;
				}
			}catch(Exception e) {
				System.out.println("�����Է��Ͻÿ�");
				continue; 
			}
			i++;
			if(i==6) {break;}
		}//while end	
		
		
	 for(i=0; i<6; i++) {
	  System.out.print(su[i] + " ");
	}

		 
		
	}//main end
}//class END


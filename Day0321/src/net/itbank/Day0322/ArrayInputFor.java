package net.itbank.Day0322;
import java.util.Scanner;
public class ArrayInputFor {
	public static void main(String[] args) {

		//while, for�ݺ��� ����� ������ ����
		//Integer.parseInt(StringŸ��)
		//�ζǰ��� ���߱� if(count==3){�����������}else if(count==5){�ζǻ��}

		int dap[]= {7,11,12,34,38,42};
		int count=0;
		
		System.out.println("for �ݺ��� ������ �Է�\n");
		
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
			}//for end
			for(int i=0;i<6;i++) {
				System.out.print(su[i]+"\t");
		}
			


	}//main end
}//class 

package net.itbank.Day0325;
import java.util.Scanner;
public class First {

	public static void main(String[] args) {
		// 5���� ���� �ִ� 
		// ����� �����ϰڽ��ϱ�? 
		// 3�� 5�� �����ϰ� 1���� �����ϰ� 
		// 1�� ����ߴ�  - ����Դϴ�

		boolean flag[] = new boolean [5];
		String bang[] = {"101","102","103","104","105"};
		Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("��� �� �����Ͻðڽ��ϱ�?");
		int b =Integer.parseInt(sc.nextLine());

			if(flag[b-1]==true){
				System.out.println("�̹� ����Ǿ���\n");continue;
			}else {
				flag[b-1]=true; 
			}
			System.out.println(b+"�� ����Ǽ̽��ϴ�\n");


			for(int i=0; i<5; i++) {
				System.out.print(bang[i]+"\t");
			}
			System.out.println();
			for(int a=0; a<5; a++){
				if(flag[a]==true) {
					System.out.print("�����\t"); 
				}else{
					System.out.print("���¼�\t");
				} 
			}
			System.out.println("\n");
		}//while end
	}//main end
}//class end

	package net.itbank.Day0328;
	
	import java.util.Scanner;
	import java.util.Random;
	
	public class StudentJumsu {
	
		public static void main(String[] args) {
		// �̸� abc ���� �� �� �� ���� 
			// Scanner�� ���� �Է¹޴� ���
//			Scanner sc =new Scanner(System.in);
//			int gab=Integer.parseInt(sc.nextLine());
			
			int st[][]={{1,2,3},{3,4,5}};
			
			System.out.println("��\t��\t��\t����\t���");
			// �̸�
//			System.out.println("a,b,c");
			
			while(true){
								
				//��������
				for(int a=0; a<2; a++){
					int b=0;
					for(b=0; b<2; b++){
						int gab=st[a][b];
					} System.out.print(st[a][b]+"\t");
				}System.out.println();

//				//���� ��
//				for(int a=0; a<2; a++){
//					int gab=0;
//					for(int b=0; b<2; b++){
//						gab=+st[a][b];
//						System.out.print(gab+"\t");
//					}
//					System.out.println();
//				}
//				System.out.println();
//				
//				//������
//				for(int a=0; a<2; a++){
//					int gab=0;
//					for(int b=0; b<2; b++){
//						gab=+st[b][a];
//					}
//					System.out.print(gab+"\t");
//				}
				break;
			}//while end
			
			
	}//main end
}//class end

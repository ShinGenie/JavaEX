package net.itbank.Day0322;
	
	import java.util.Scanner;
	import java.util.Random;
	
	public class LottoHomework {
	
		public static void main(String[] args) {
			//6�� ���� �ޱ� 
	int su [] = new int [6];
	Scanner sc = new Scanner(System.in);
	int i=0, count=0;
	
	
	for (i=0; i<6; i++){
		try{
			System.out.print("su + [" + i + "] = ");
			su[i] = Integer.parseInt(sc.nextLine());
	
			if(su[i]<=0 || su[i]>45){
				System.out.println("1~45������ ���� �Է����ּ���");
				continue;}
		}
		catch(Exception ex){System.out.println("���ڷ�");};
	}
	
	for(i=0; i<su.length; i++){
		System.out.print(su[i]+" ");
	}
	
	
	System.out.println("\n\n\n=========�ζǺ�============\n");
	//�ζǹ�ȣ�� ���Ѵ�.
	
	int comSu [] = {1,2,4,5,6,7};
	
	//su[0]==1 ���ٸ�, 2�� ���ٸ� ...
	//su[1]==1 ���ٸ�,
	//su[2]==1 ���ٸ�, 2�� ���ٸ� ...
	//su[3]==1 ���ٸ�, 2�� ���ٸ� ...
	//su[4]==1 ���ٸ�, 2�� ���ٸ� ...
	
		for (i=0; i<su.length; i++){
			if(su[i]==comSu[i]){
				count++;
				}
			}
		System.out.println(count+"�� ���߼̽��ϴ�.");
			if(count==1){System.out.println("����������");}
			else if(count==2){System.out.println("�׵����� �����������\n");}
			else if(count==3){System.out.println("��Ÿ��\n");}
			else if(count==4){System.out.println("�� ��Ű\n");}
			else if(count==5){System.out.println("����\n");}
			else if(count==6){System.out.println("�ζǸ� �ϼ���\n");}
			else {return;}
			
	}//main end
}//class end

package net.itbank.Day0321;
import java.util.Scanner;
public class Gugudan {

	public static void main(String[] args) {

	int dan=0;
	while(true){
		Scanner sc=new Scanner(System.in); 
		try {
			System.out.println("1~9���� �� �Է���");
			String data=sc.nextLine();
			dan=Integer.parseInt(data);// next�� �ƴ϶� "Line" 24���� ���ͱ��� ����ϴ� next"Line"���� �ؾ��Ѵ�.
		
		if(dan<0 || dan>9) {System.out.println("�ٽ�");continue;}
		if(dan==0) {System.exit(0);}
			}
		catch(Exception e) {System.out.print("���ڸ� ");continue;} // String ���ð�� exception ������  ó��.
		
		System.out.println("========������=========");
		for(int i=1; i<10; i++) {
			int gab=dan*i;
			System.out.println(dan+"*"+i+"="+gab);}break;//for end
	}//while end
	
	
	System.out.println("=======�Ƕ�̵�=======");
	
	int i=0; // �� 
	int j=0; // ��
	
	for(i=0; i<5; i++) {
		for(j=0; j<4-i; j++) {System.out.print(" ");}
		for(j=0; j<2*i+1; j++) {System.out.print("*");}
			System.out.println();
		}

}
}

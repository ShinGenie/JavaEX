package net.itbank.Day0321;
import java.util.Scanner;
public class Gugudan {

	public static void main(String[] args) {

	int dan=0;
	while(true){
		Scanner sc=new Scanner(System.in); 
		try {
			System.out.println("1~9사이 수 입력해");
			String data=sc.nextLine();
			dan=Integer.parseInt(data);// next가 아니라 "Line" 24엔터 엔터까지 흡수하는 next"Line"으로 해야한다.
		
		if(dan<0 || dan>9) {System.out.println("다시");continue;}
		if(dan==0) {System.exit(0);}
			}
		catch(Exception e) {System.out.print("숫자만 ");continue;} // String 들어올경우 exception 문구로  처리.
		
		System.out.println("========구구단=========");
		for(int i=1; i<10; i++) {
			int gab=dan*i;
			System.out.println(dan+"*"+i+"="+gab);}break;//for end
	}//while end
	
	
	System.out.println("=======피라미드=======");
	
	int i=0; // 행 
	int j=0; // 열
	
	for(i=0; i<5; i++) {
		for(j=0; j<4-i; j++) {System.out.print(" ");}
		for(j=0; j<2*i+1; j++) {System.out.print("*");}
			System.out.println();
		}

}
}

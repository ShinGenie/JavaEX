package net.itbank.Day0321;
import java.util.Scanner;
public class Scanner_01 {

	public static void main(String[] args) {
		int dan=1;

		Scanner sc = new Scanner(System.in);
		System.out.print("구구단입력?");
		dan=sc.nextInt();
		// dan 입력범위 1-9 사이 숫자 입력 받고 싶다. 음수 0 9보다 큰수는 재입력하거나 기본값출력
		
		//if(dan<=9) {for(int a=1; a<10; a++) {System.out.println(dan+"*"+a+"="+(dan*a));}}
		
		/*while(true) {
		if(dan<=0 || dan>9) 
		{System.out.println("벗어났다");
		System.out.print("구구단입력?");
		dan=sc.nextInt();}
		else {
		for(int a=1; a<10; a++)
		{System.out.println(dan+"*"+a+"="+(dan*a));}
		break;
		}
		
	}*/
		while(dan<=0 || dan>9) {
			System.out.println("벗어났다");
			System.out.print("구구단입력?");
			dan=sc.nextInt();
		}
		
		for(int a=1; a<10; a++)
		{System.out.println(dan+"*"+a+"="+(dan*a));}
		
		
		
		
	} // main end
} // class end

package net.itbank.Day0321;
import java.util.Scanner;
public class TestEmp1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름입력?");
		//String name=sc.next(); // 공백있을때 짤라버린다. 공백으로 데이터를 분리 홍길동시 홍만
		/*String data=sc.nextLine(); // 공백까지 가져간다
		int dan=Integer.parseInt(data);
		System.out.println(data+78); 
		System.out.println(dan+78); // 문자열이 int형변환 연산가능*/
		
		//sc.close();//자원의 반납
	} // main end
} // class end

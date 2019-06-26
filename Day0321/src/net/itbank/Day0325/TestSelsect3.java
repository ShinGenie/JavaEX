package net.itbank.Day0325;

public class TestSelsect3 {

	public static void main(String[] args) {
		int su[] = new int[5];
		//Math클래스 random()메소드 함수 이용해서 1~10 사이 숫자 발생
		for(int a=0; a<5; a++) {
			su[a]=(int)(Math.random()*10)+1;
			System.out.print(su[a]+"\t");
		} // 난수의 단점은 숫자가 중복될수 있다

		
//		for(int data : su) {
//			System.out.println(data+"");
//		}
	}//main end

}//class end

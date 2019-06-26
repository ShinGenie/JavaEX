package net.itbank.Day0325;

public class TestStar {

	public static void main(String[] args) {
		// 별 출력		
		for(int i=0; i<5; i++) {
			for(int j=6; j>i+1; j--) { //i+1은 열
				System.out.print("☆");
				}
			System.out.println();
		}

	}//main end
}//class end

package net.itbank.Day0326;

public class TestSelect {
	//book price note(); 세개 함수로 호출이용

	// 배열 소트하기 
	public static void main(String [] args) {
		//5 행 * 5열
		//2중 for문 
		int [][] su = new int[5][5]; // 소트하기 
		int count=0;

		for(int i=0; i<su.length; i++) {
			for(int j=0; j<su.length;  j++) {
				count++;
				su[i][j]=count;
				System.out.print(su[i][j]+"\t");
			} System.out.println();
		}


	}//main end
}//class end

package net.itbank.Day0326;

public class TestBuilding3 {
	//book price note(); 세개 함수로 호출이용

	// 배열 소트하기 
	public static void main(String [] args) {
		//5 행 * 5열
		//2중 for문 
		int [][] map = {
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,2,4,5},
				{1,2,34,4,5},
				{1,2,34,4,5}
		};
		
		for(int a=0; a<5; a++) {
			for(int b=0; b<map[a].length; b++) { // 그 행의 개수만큼
				System.out.print(map[a][b]);
			}
			System.out.println();
		}

		
	
               
	}//main end
}//class end

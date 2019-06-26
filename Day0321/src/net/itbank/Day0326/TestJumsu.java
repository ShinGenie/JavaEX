package net.itbank.Day0326;

public class TestJumsu {
	//book price note(); 세개 함수로 호출이용

	// 배열 소트하기 
	public static void main(String [] args) {
		String[] name = {"aa","bb","cc","dd","ee"};
		int[] su = {1,2,3,4,5};
		int [][] jumsu = {
				{3,2,1,0},{8,8,8,0},{10,10,10,0},
				{5,5,5,0},{10,10,10,0}
				};
		int gab=0;
		int hap=0;
		int b=0;
		int [] rank= {1,1,1,1,1};
		int subhap[]=new int[3];
		int Gtotal=0; //개개인 총점
		//Scanner 입력받는 대신 초기값으로 대체
		// 1개인당 총점, 등수, 과목별 총점 구하기 처리후 출력
		//				gab=+jumsu[a][b];
		// for 반복문 기준 먼저 정해서 연산처리하세요
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t등수\t평균\t학점\t결과");
		System.out.println("==============================================================================");
		
		for(int a=0; a<5; a++) {
			//hap=+jumsu[a][b];
			System.out.print(su[a]+"\t");
			System.out.print(name[a]+"\t");
				for(b=0; b<3; b++){
					System.out.print(jumsu[a][b]+"\t");		
				}
			gab=jumsu[a][0]+jumsu[a][1]+jumsu[a][2];
			
			System.out.print(gab);
			System.out.print("\t\t"+gab/3);
			System.out.println();
		} 
		for(int a=0; a<3; a++) {
			for(b=0; b<5; b++) {
				subhap[a]+=jumsu[b][a];
			}
	
		}
		System.out.println("==============================================================================");
		System.out.println("\t총점\t"+subhap[0]+"\t"+subhap[1]+"\t"+subhap[2]);

		
		
		
		
		
		
	}//main end
}//class end

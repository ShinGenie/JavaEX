package net.itbank.day18;

/*
 * 학습 목표: 출력 , 환경설정
 * 자바언어의 특징(대소문자구별, 출력, 환경설정)
 * 자바향상 교재참고 4~5페이지
 * 작성자:신진이
 * ------
 * 자바에서 특수문자 \n, \t, \\ 
 *\n 라인개행 enter 역할 t탭 7칸 오른쪽 이동탭
 * \\ String path="C:\dev\work"; 에러발생
 * 에러이유가 \d 특수문자 \w 특수문자없어
 * String path="C:\\dev\\work"; \\2개 표현이 \ 루트 역할
 */



public class Test {
	public static void main(String[] args) {
		int a=0, b=0, hap=0; 
		double avg=0.0;
		 a=90;
		 b=85;
		 hap=a+b;
		 avg=(double)hap/2; //몫
		 //총점=175 평균=87.5
		System.out.println("총점=" + hap );
		System.out.println("평균=" + avg );
	} //main End
} // Two class End
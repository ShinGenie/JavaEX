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



public class First {
	public static void main(String[] args) {
		/*자바문법기술 출력, 연산, 제어
		 * 주석처리 여러줄
		  public static void main(String[] args) 이것은 기본중에 기본 반드시 외워야함*/
		System.out.println("신진이 4:39 4:42 ");
		System.out.print("동네:서대문\n"); // 개행안됨
		System.out.print("동네:종로구"); // 개행안됨
		System.out.println();
		//System.out.print();// 이 매소드는 argument 가 꼭 들어가야한다. 문법에러
		int kor=90; // int 정수형 음수, 제로, 양수 -21억~ +21억 ---> 나이, 민번 등에 많이 쓰임
		int eng=85;
		int hap=0;
		hap=kor+eng;
		System.out.println("국어=" + kor);
		System.out.println("영어=" + eng);
		System.out.println("합계=" + hap);
	}
} // class END 자바는 
/*대소문자 구별 class First {저장도 반드시 First.java F로 저장해야함} 자바는 안내문 문자열 "" 표현 자바는 연결역할이 + 더하기로 */
// 자바에서 한줄주석 , 자바에서 문장마지막 ; 세미콜론  런 - 실행 컨트롤 f11 단축키 
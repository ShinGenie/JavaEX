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



public class Two {
	public static void main(String[] args) {
		int eng=85;
		char grade='F'; // 문자열 String은 "" 스트링은 캐릭터가 안됩니다. cannot covert to string 
		String city="서울LA"; // String은 반드시 더블 ""로 해야한다. 문자열 배열
		boolean gender=false;
		double avg=3.4; // 변수를 선언만 하면 안됨 반드시 값도 저장해야함. 출력은 실수형으로 출력됨.
		System.out.println("영어=" + eng);
		System.out.println("avg=" + avg);
		System.out.println("등급=" + grade);
		System.out.println("동네=" + city);
		System.out.println("성별=" + gender);

	} //main End
} // Two class End
package net.itbank.Day0322;

public class Lotto {
	public static void main(String[] args) {
		//  자바에서 배열길이 배열이름.length, for 반복문으로 출력 권장.
		//  자바에서 배열은 같은 타입으로 구성 
		//  자바에서 배열첨자는 0번째부터 시작
		//  자바에서 배열은 크기고정, 배열표시[]
		//  자바에서 배열이름을 기술하면 메모리주소 표시
		int a[]=new int[6];
		a [0]=45;   a [1]=31;   a [2]=13;
		a [3]=29;   a [4]=16;   a [5]=7;
	
		int b[]={34,41,7,12,39,25};
		System.out.println("a갯수=" + a.length);
		System.out.println("b갯수=" + b.length);

	}
}

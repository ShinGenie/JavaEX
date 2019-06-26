package net.itbank.Day0408;

public class StudentEx extends Student {
	// KG학원은 자바, C언어만 강의를 하고 있었습니다.
	// 파이썬 과목을 추가하기로 결정 ,관리 프로그램 클래스도 수정
	// (StudentEx 클래스)
	// 파이썬(python) 파이썬 과목 점수
	private int python;

	public StudentEx(String name,int java,int C, int python) {
		super(name, java, C);
		this.python=python;
		int tot=python+java+C;
		this.setTot();
		this.getAvg();
	}
	
	
	public int getPython() { return python; }
	public void setPython(int python) {
		this.python = python;	
	}
	
	public void disp() {
		super.disp();
		System.out.println("파이썬 : " +python);
		System.out.println("=========================");
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}


	@Override
	public int getTot() {
		
		return tot;
	}


	@Override
	public void setTot() {
		super.tot=tot;
	}


	@Override
	public double getAvg() {
		avg=tot/3.0;
		return avg;
	}


	@Override
	public void setAvg() {
		// TODO Auto-generated method stub
		super.setAvg();
	}

	
	// (합계, 평균 등이 제대로 나오도록 아래의 객체를 생성 후 정보 출력)
 	//public class StudentMain {  메인함수  }
	// 		name	java 	c		python
	// [1] 	엑스맨 80 		85	 	어
	// [2] 	배트맨 90		85 		80
	// [3] 	슈퍼맨 100 	20 		25
}//class END

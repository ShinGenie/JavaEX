package net.itbank.Day0408;

public class StudentEx extends Student {
	// KG�п��� �ڹ�, C�� ���Ǹ� �ϰ� �־����ϴ�.
	// ���̽� ������ �߰��ϱ�� ���� ,���� ���α׷� Ŭ������ ����
	// (StudentEx Ŭ����)
	// ���̽�(python) ���̽� ���� ����
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
		System.out.println("���̽� : " +python);
		System.out.println("=========================");
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
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

	
	// (�հ�, ��� ���� ����� �������� �Ʒ��� ��ü�� ���� �� ���� ���)
 	//public class StudentMain {  �����Լ�  }
	// 		name	java 	c		python
	// [1] 	������ 80 		85	 	��
	// [2] 	��Ʈ�� 90		85 		80
	// [3] 	���۸� 100 	20 		25
}//class END

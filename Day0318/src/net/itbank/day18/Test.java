package net.itbank.day18;

/*
 * �н� ��ǥ: ��� , ȯ�漳��
 * �ڹپ���� Ư¡(��ҹ��ڱ���, ���, ȯ�漳��)
 * �ڹ���� �������� 4~5������
 * �ۼ���:������
 * ------
 * �ڹٿ��� Ư������ \n, \t, \\ 
 *\n ���ΰ��� enter ���� t�� 7ĭ ������ �̵���
 * \\ String path="C:\dev\work"; �����߻�
 * ���������� \d Ư������ \w Ư�����ھ���
 * String path="C:\\dev\\work"; \\2�� ǥ���� \ ��Ʈ ����
 */



public class Test {
	public static void main(String[] args) {
		int a=0, b=0, hap=0; 
		double avg=0.0;
		 a=90;
		 b=85;
		 hap=a+b;
		 avg=(double)hap/2; //��
		 //����=175 ���=87.5
		System.out.println("����=" + hap );
		System.out.println("���=" + avg );
	} //main End
} // Two class End
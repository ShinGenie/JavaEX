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



public class Two {
	public static void main(String[] args) {
		int eng=85;
		char grade='F'; // ���ڿ� String�� "" ��Ʈ���� ĳ���Ͱ� �ȵ˴ϴ�. cannot covert to string 
		String city="����LA"; // String�� �ݵ�� ���� ""�� �ؾ��Ѵ�. ���ڿ� �迭
		boolean gender=false;
		double avg=3.4; // ������ ���� �ϸ� �ȵ� �ݵ�� ���� �����ؾ���. ����� �Ǽ������� ��µ�.
		System.out.println("����=" + eng);
		System.out.println("avg=" + avg);
		System.out.println("���=" + grade);
		System.out.println("����=" + city);
		System.out.println("����=" + gender);

	} //main End
} // Two class End
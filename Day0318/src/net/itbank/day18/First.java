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



public class First {
	public static void main(String[] args) {
		/*�ڹٹ������ ���, ����, ����
		 * �ּ�ó�� ������
		  public static void main(String[] args) �̰��� �⺻�߿� �⺻ �ݵ�� �ܿ�����*/
		System.out.println("������ 4:39 4:42 ");
		System.out.print("����:���빮\n"); // ����ȵ�
		System.out.print("����:���α�"); // ����ȵ�
		System.out.println();
		//System.out.print();// �� �żҵ�� argument �� �� �����Ѵ�. ��������
		int kor=90; // int ������ ����, ����, ��� -21��~ +21�� ---> ����, �ι� � ���� ����
		int eng=85;
		int hap=0;
		hap=kor+eng;
		System.out.println("����=" + kor);
		System.out.println("����=" + eng);
		System.out.println("�հ�=" + hap);
	}
} // class END �ڹٴ� 
/*��ҹ��� ���� class First {���嵵 �ݵ�� First.java F�� �����ؾ���} �ڹٴ� �ȳ��� ���ڿ� "" ǥ�� �ڹٴ� ���Ὺ���� + ���ϱ�� */
// �ڹٿ��� �����ּ� , �ڹٿ��� ���帶���� ; �����ݷ�  �� - ���� ��Ʈ�� f11 ����Ű 
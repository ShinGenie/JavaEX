package net.itbank.Day0326;

public class TestSelect {
	//book price note(); ���� �Լ��� ȣ���̿�

	// �迭 ��Ʈ�ϱ� 
	public static void main(String [] args) {
		//5 �� * 5��
		//2�� for�� 
		int [][] su = new int[5][5]; // ��Ʈ�ϱ� 
		int count=0;

		for(int i=0; i<su.length; i++) {
			for(int j=0; j<su.length;  j++) {
				count++;
				su[i][j]=count;
				System.out.print(su[i][j]+"\t");
			} System.out.println();
		}


	}//main end
}//class end

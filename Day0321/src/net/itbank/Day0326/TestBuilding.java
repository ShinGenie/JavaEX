package net.itbank.Day0326;

public class TestBuilding {
	//book price note(); ���� �Լ��� ȣ���̿�

	// �迭 ��Ʈ�ϱ� 
	public static void main(String [] args) {
		//5 �� * 5��
		//2�� for�� 
		int [][] map = new int [5][5];
		int count=0;

		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map.length;  j++) {
				count++;
				map[i][j]=count;
				System.out.print(map[i][j]+"\t");
			} System.out.println();
		}


	}//main end
}//class end

package net.itbank.Day0326;

public class TestBuilding3 {
	//book price note(); ���� �Լ��� ȣ���̿�

	// �迭 ��Ʈ�ϱ� 
	public static void main(String [] args) {
		//5 �� * 5��
		//2�� for�� 
		int [][] map = {
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,2,4,5},
				{1,2,34,4,5},
				{1,2,34,4,5}
		};
		
		for(int a=0; a<5; a++) {
			for(int b=0; b<map[a].length; b++) { // �� ���� ������ŭ
				System.out.print(map[a][b]);
			}
			System.out.println();
		}

		
	
               
	}//main end
}//class end

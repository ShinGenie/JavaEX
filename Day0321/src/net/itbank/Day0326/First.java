package net.itbank.Day0326;

public class First {
	//book price note(); ���� �Լ��� ȣ���̿�

	// �迭 ��Ʈ�ϱ� 
	public static void main(String [] args) {
		int su [] = {1,9,48,78,152,45};

		for(int a=0; a<6; a++) {
			for(int b=0; b<a+1; b++) {
				if(su[a]>su[b]) {
					int temp=0;
					temp=su[a];
					su[a]=su[b];
					su[b]=temp;
					System.out.print(su[a]+"\t");
				} 
			}
		}
	}//main end
}//class end

package net.itbank.Day0325;

public class TestSelsect3 {

	public static void main(String[] args) {
		int su[] = new int[5];
		//MathŬ���� random()�޼ҵ� �Լ� �̿��ؼ� 1~10 ���� ���� �߻�
		for(int a=0; a<5; a++) {
			su[a]=(int)(Math.random()*10)+1;
			System.out.print(su[a]+"\t");
		} // ������ ������ ���ڰ� �ߺ��ɼ� �ִ�

		
//		for(int data : su) {
//			System.out.println(data+"");
//		}
	}//main end

}//class end

package net.itbank.Day0402;

public class TestString {
	public static void main(String[]args) {
		String a=new String("apple");// ��ü 1
		String b=new String("apple");// ��ü 2
		if(a==b) {
			System.out.println("apple ���� ����");
		}else {
			System.out.println("�ٸ����� fruit");
		}//if end
		if(a.equals(b)) { // �� ��ü�� ���� ������~
			System.out.println("apple ���� ����");
		}else {
			System.out.println("�ٸ����� fruit");
		}//if end
		
		String data = "ȫ�浿,�����,���γ�,������,�ں���";
		String[] name = data.split(",");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"\t");
		}//for end
	}//end
}//class end

//public class Sort{
//	
//}

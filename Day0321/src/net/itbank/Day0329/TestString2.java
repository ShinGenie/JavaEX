package net.itbank.Day0329;


public class TestString2 {


	public static void main(String[] args) {
		String data ="3  X  5  Y 7   B";
		String msg="sk";
		
		//��Ʈ for �ݺ�(i=0;i<data.length())
		//charAt()==' ' ���� 
		//replaceAll()
//		data=data.replace(" ","");
//		System.out.println(data);
//		
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)==' ') {
				
			}else {msg+=data.charAt(i);} // ���Կ���
		} 
		System.out.println(data);
		System.out.println(msg);
		
	}//main end
	

}//class end

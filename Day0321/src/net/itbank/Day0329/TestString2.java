package net.itbank.Day0329;


public class TestString2 {


	public static void main(String[] args) {
		String data ="3  X  5  Y 7   B";
		String msg="sk";
		
		//힌트 for 반복(i=0;i<data.length())
		//charAt()==' ' 공백 
		//replaceAll()
//		data=data.replace(" ","");
//		System.out.println(data);
//		
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)==' ') {
				
			}else {msg+=data.charAt(i);} // 대입연산
		} 
		System.out.println(data);
		System.out.println(msg);
		
	}//main end
	

}//class end

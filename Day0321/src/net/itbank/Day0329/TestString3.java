package net.itbank.Day0329;


public class TestString3 {


	public static void main(String[] args) {
		String data ="3  X  5  Y 7   B";
		String msg="";//3X5Y7B
		String last="";//357 숫자만 추출
		
//		
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)==' ') {
			}else {msg+=data.charAt(i);} // 대입연산
		} 
		System.out.println(data);
		System.out.println(msg);
		
		for(int j=0;j<msg.length();j++) {
			if(msg.charAt(j)<65) {
				last+=msg.charAt(j);
			}	
		}
		System.out.println(last);
		
		String msg1="3X5Y7B";
		msg1=msg1.replaceAll("[0-9]", "");
		System.out.println(msg1);

//		String str = "abdc1,2sfdsa4";
//		str = str.replaceAll("[^0-9]", "");
//		System.out.println(str);
	
	}//main end
	

}//class end

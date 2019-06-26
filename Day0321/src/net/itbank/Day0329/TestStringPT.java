package net.itbank.Day0329;


public class TestStringPT {


	public static void main(String[] args) {
		String data ="3  X  5  Y 7   B";
		String msg="";//3X5Y7B
		String last="";//357 숫자만 추출

		data=data.replaceAll(" ","");
		System.out.println(data);

		System.out.println("==================");

		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)==' ') {
				msg=msg+"";
			} msg+=data.charAt(i);
		}System.out.println(msg);

		System.out.println("==================");
		
		//msg=3X5Y7B;
		for(int i=0;i<msg.length();i++) {
			String ret="";
			if(msg.charAt(i)>='0'&&msg.charAt(i)<='9') {
				ret+=msg.charAt(i);
			}
			System.out.print(ret);
		}
		
		System.out.println("\n==================");
		data=data.replaceAll(" ","");
		System.out.println(data);
		
		System.out.println("==================");
		String data1=data.replaceAll("[^0-9]","");
		System.out.println(data1);
	}//main end


}//class end

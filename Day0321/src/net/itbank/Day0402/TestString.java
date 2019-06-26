package net.itbank.Day0402;

public class TestString {
	public static void main(String[]args) {
		String a=new String("apple");// 객체 1
		String b=new String("apple");// 객체 2
		if(a==b) {
			System.out.println("apple 같은 과일");
		}else {
			System.out.println("다른종류 fruit");
		}//if end
		if(a.equals(b)) { // 각 객체의 값이 같으냐~
			System.out.println("apple 같은 과일");
		}else {
			System.out.println("다른종류 fruit");
		}//if end
		
		String data = "홍길동,김고은,유인나,아이유,박보검";
		String[] name = data.split(",");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"\t");
		}//for end
	}//end
}//class end

//public class Sort{
//	
//}

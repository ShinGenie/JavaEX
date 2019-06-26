package net.itbank.day23;

public class GetSetEx {	
	
	public static void main(String[] args) {
		
		Name name = new Name("홍길동","임꺽정");
		System.out.println(name.getMyName()+name.getYourName());

	}

}

class Name {
	
	String myName;
	String yourName;
	
	public Name(String myName, String yourName) {
		setName(myName,yourName);
	}

	public String getMyName() {
		return myName;
	}

	public String getYourName() {
		return yourName;
	}

	public void setName(String myName, String yourName) {
		this.myName = myName;
		this.yourName = yourName;
	}
}

// get/set 메소드 사용은 클래스에서 private로 보호된 변수의 값을 지정하고 
// 가져오기 위한 방법으로 사용한다.  "private으로 선언된 변수를 위해!









package net.itbank.day23;

public class GetSetEx {	
	
	public static void main(String[] args) {
		
		Name name = new Name("ȫ�浿","�Ӳ���");
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

// get/set �޼ҵ� ����� Ŭ�������� private�� ��ȣ�� ������ ���� �����ϰ� 
// �������� ���� ������� ����Ѵ�.  "private���� ����� ������ ����!









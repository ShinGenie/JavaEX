package net.itbank.Day0401;

import java.io.IOException;

public class TestGuGudan {

	public static void main(String[] args) throws IOException  {
		java.io.InputStream is = System.in;
		int dan = is.read();
		for(int i=1;i<10;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}//end
	}//main end

}//class end

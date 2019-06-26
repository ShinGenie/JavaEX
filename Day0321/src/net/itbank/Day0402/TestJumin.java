package net.itbank.Day0402;

public class TestJumin {
	public static void main(String[]args) {
		String jumin="851230-3927635";
		//첫번째 indexOf, substring();
		int pos=jumin.indexOf("-");
		System.out.println("pos="+pos);
		//두번째 substring함수로 39~추출
		String pos1=jumin.substring(pos+1);
		System.out.println(pos1);
		//마지막문제 
		String[] star = new String[14];
		
			for(int i=0;i<star.length;i++) {
				star[i]=jumin;
//				for(int j=0;j<star[5].length();j++) {
//					star[j]="*";
//					System.out.println(star[j]);
//				}//for end
			}//for end
		}//main end

}//class end

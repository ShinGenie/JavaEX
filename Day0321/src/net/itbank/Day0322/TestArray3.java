package net.itbank.Day0322;

public class TestArray3 {
	public static void main(String[] args) {
		int su[]=new int[3];
		su[0]=35; su[1]=79; su[2]=6;
		System.out.println("\n아래 코드는 김진호조장");
		for(int i=0; i<2; i++) {//기준점
			for(int j=(i+1); j<3; j++) {//비교의 대상
				int temp=0;	
				if(su[i]<su[j]) { 
					temp=su[i];
					su[i]=su[j];
					su[j]=temp;
				}//if end
			}// j end
		}// i end
		for(int i=0; i<su.length; i++) {
			System.out.print(su[i]+"\t");
		}//for end
		System.out.println();
		
		
	}//main end
}//class end

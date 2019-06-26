import java.util.Arrays;

public class Lotto {


	public int[] getNumber() {

		int[] su = new int[6];
		int i=0;
		//문제 1 난수 6개 발생 1~10
		for(i=0;i<6;i++) {
			su[i]=(int)(Math.random()*10)+1;

			for(int j=0;j<i;j++) {
				if(su[i]==su[j]) {
					i--;
					break;
				}
			}
		}
		return su;
	}


	public void setNumber(int[] data) {
		Arrays.sort(data);
		for(int i=0; i<6;i++) {
			System.out.print(data[i]+" ");
		}
//		
	}



}//class end




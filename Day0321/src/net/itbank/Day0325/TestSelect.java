package net.itbank.Day0325;

public class TestSelect {

	public static void main(String[] args) {
		int su [] = {7,4,12,1,3};
		System.out.print("소트전 :\t");
		for(int i=0; i<su.length; i++){
			System.out.print(su[i]+"\t");
		}

		System.out.print("\n소트후 :\t");
		for(int i=0; i<su.length; i++) {
			for(int j=i+1; j<su.length; j++) {
				if(su[i]>su[j]) {
					int temp=0;
					temp=su[i];
					su[i]=su[j];
					su[j]=temp;
				}
			}
		}
		for(int i=0; i<su.length; i++) {
			System.out.print(su[i]+"\t");
		}


		// 별출력, 소트출력은 100% 2중 for문
	}//main end

}//class end

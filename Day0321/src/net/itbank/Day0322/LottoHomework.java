package net.itbank.Day0322;
	
	import java.util.Scanner;
	import java.util.Random;
	
	public class LottoHomework {
	
		public static void main(String[] args) {
			//6개 숫자 받기 
	int su [] = new int [6];
	Scanner sc = new Scanner(System.in);
	int i=0, count=0;
	
	
	for (i=0; i<6; i++){
		try{
			System.out.print("su + [" + i + "] = ");
			su[i] = Integer.parseInt(sc.nextLine());
	
			if(su[i]<=0 || su[i]>45){
				System.out.println("1~45사이의 수를 입력해주세요");
				continue;}
		}
		catch(Exception ex){System.out.println("숫자로");};
	}
	
	for(i=0; i<su.length; i++){
		System.out.print(su[i]+" ");
	}
	
	
	System.out.println("\n\n\n=========로또비교============\n");
	//로또번호와 비교한다.
	
	int comSu [] = {1,2,4,5,6,7};
	
	//su[0]==1 같다면, 2와 같다면 ...
	//su[1]==1 같다면,
	//su[2]==1 같다면, 2와 같다면 ...
	//su[3]==1 같다면, 2와 같다면 ...
	//su[4]==1 같다면, 2와 같다면 ...
	
		for (i=0; i<su.length; i++){
			if(su[i]==comSu[i]){
				count++;
				}
			}
		System.out.println(count+"개 맞추셨습니다.");
			if(count==1){System.out.println("하지마세요");}
			else if(count==2){System.out.println("그돈으로 빵사먹으세요\n");}
			else if(count==3){System.out.println("반타작\n");}
			else if(count==4){System.out.println("오 럭키\n");}
			else if(count==5){System.out.println("행운아\n");}
			else if(count==6){System.out.println("로또만 하세요\n");}
			else {return;}
			
	}//main end
}//class end

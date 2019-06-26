package net.itbank.day16;

public class Fibonacci {
  public static void main(String[ ]  args) {
  	long start = System.currentTimeMillis();
		System.out.println(fiboDynamic(50));
		long end = System.currentTimeMillis();
		System.out.println("1실행시간 : "+((end-start)/1000.0)+"초\n");

		start = System.currentTimeMillis();
		System.out.println(fiboRecursion(50));
		end = System.currentTimeMillis();
		System.out.println("2실행시간 : "+((end-start)/1000.0)+"초\n");
		
		start = System.currentTimeMillis();
		System.out.println(fiboLoop(50));
		end = System.currentTimeMillis();
		System.out.println("3실행시간 : "+((end-start)/1000.0)+"초\n");
	}//main end

	public static double fiboRecursion(int a) {
		if(a<=1)
			return a;
		else 
			return fiboRecursion(a-2)+ fiboRecursion(a-1); 
	}//end

	public static double fiboDynamic(int a) {
		double[] c = new double[a+1];
		c[0]=0;
		c[1]=1;
		if(a>1) {
			for(int i=2; i<=a; i++) {
				c[i] = c[i-2]+c[i-1];	
			}
		}
		return c[a];
	}//end

	public static double fiboLoop(int a) {
		if(a<=1) {
			return 1;
		}else {
			double c=0;
			double d=1;
			double sum=0;

			for(int i=2; i<=a; i++) {
				sum = c+d;
				c=d;
				d=sum;
			}
			return sum;
		}
  }//end
}//class END

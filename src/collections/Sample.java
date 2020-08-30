package collections;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		type conversion example
		short number = 32767;
		short numberTwo = (short)(number + 1);
		System.out.println(numberTwo);
//		System.out.println(-2%2);
		
		int sum =0;
		for (int i=0, j=0; i<5 & j<5; ++i, j =i+1) {
			sum += i;
			System.out.println("value of i "+i+" value of j "+j +"Value of sum is "+ sum);
		}
		System.out.println(sum);
	}

}

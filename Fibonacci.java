public class Fibonacci {
	public static void main(String[] args) {
		System.out.print(fibo(9));
	}
	public static int fibo(int digit){
		if (digit <= 1) {
			return digit;
		} else {return fibo(digit-1) + fibo(digit-2);}
	}
}
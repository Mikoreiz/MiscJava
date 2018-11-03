public class Fibonacci {
	public static int fibo(int digit){
		if (digit <= 1) {
			return digit;
		} else {return fibo(digit-1) + fibo(digit-2);}
	}
}

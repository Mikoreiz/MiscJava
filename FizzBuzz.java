
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int digit = 0; digit <=100; digit++) {
			if (digit % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (digit % 5 == 0) {
				System.out.println("Buzz");
			} else if (digit % 3 == 0) {
				System.out.println("Fizz");
			}  else {System.out.println(digit);}
		}
	}
}

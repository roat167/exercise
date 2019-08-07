package algo.implementation.easy;

public class ReverseInteger {
	
	public static int reverseInt(int x) {
		long res = 0;
		while (x  != 0) {
			res = res * 10 + x % 10;
			x /= 10;
		}
		
		return (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 : (int) res;
	}
	
	public static void main(String[] args) {
		int x = 123;
		System.out.println(ReverseInteger.reverseInt(x)); //output 321
		x = -123;
		System.out.println(ReverseInteger.reverseInt(x)); //output -321		
		x = 430;
		System.out.println(ReverseInteger.reverseInt(x)); //output 34
	}
}

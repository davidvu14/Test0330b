package weiser;

public class Fibonacci {

	public int fibonacci(int z) {
		if (z == 1 || z == 2) {
			return 1;
		}
		return fibonacci(z-1) + fibonacci(z-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

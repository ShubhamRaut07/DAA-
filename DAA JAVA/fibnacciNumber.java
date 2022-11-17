
public class fibnacciNumber {

	static int fibonacciRecursive(int n) {
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
		
	}
	
	static int fibonacciIterative(int n) {
		
		int x = 0;
		int y = 1;
		int z = 0;
		
		for(int i = 0; i < n; i++) {
			
			z = x + y;
			x = y;
			y = z;
			
		}
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(fibonacciRecursive(5));
		System.out.println(fibonacciIterative(10));

	}

}

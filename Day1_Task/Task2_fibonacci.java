package Day1;

public class Task2_fibonacci {
	    public static int fibonacci(int n) {
	       
	        if (n == 0) {
	            return 0;
	        } else if (n == 1) {
	            return 1;
	        }
	       
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    public static void main(String[] args) {
	        int num = 6;
	        System.out.println("Fibonacci of " + num + " is: " + fibonacci(num));
	    }
	}




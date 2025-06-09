package Day1;

public class Day1_PA {
		    public static int sumOfDigits(int number) {	      
		        if (number == 0) {
		            return 0;
		        }	        
		        return number % 10 + sumOfDigits(number / 10);
		    }
		    public static void main(String[] args) {
		        int number = 12;
		        int result = sumOfDigits(number);
		        System.out.println("Sum of digits of " + number + " is: " + result);
		    }
		}





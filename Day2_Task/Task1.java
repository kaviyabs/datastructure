package Day2;

public class Task1 {
	    public static void main(String[] args) {
	        int[] numbers = {2, 4, 6, 8, 10, 12};
	        for (int i = 0; i < numbers.length; i++) {
	            int maxIndex = i;
	            for (int j = i + 1; j < numbers.length; j++) {
	                if (numbers[j] > numbers[maxIndex]) {
	                    maxIndex = j;
	                }
	            }
	            int temp = numbers[maxIndex];
	            numbers[maxIndex] = numbers[i];
	            numbers[i] = temp;
	        }
	        for (int num : numbers) {
	            System.out.print(num + " ");

	        }

	    }

	}


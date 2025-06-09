package Day1;

public class Task1 {
	

	    public static void main(String[] args) {
	      
	        int[] arr = {10, 20, 30, 40, 50};	 
	        arr[2] = 25;
	        System.out.println("Array after insertion:");
	        printArray(arr);       
	        arr[3] = 35;
	        System.out.println("Array after update:");
	        printArray(arr);	        
	        arr[4] = 0;  
	        System.out.println("Array after deletion:");
	        printArray(arr);
	    }	    
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}



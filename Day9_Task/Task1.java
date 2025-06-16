package day9;
	import java.util.Arrays;
	import java.util.Scanner;
	public class Task1 
	{
	    public static int lowerBound(int[] arr, int target)
	    {
	        int low = 0, high = arr.length;
	        while (low < high) 
	        {
	            int mid = (low + high) / 2;
	            if (arr[mid] < target) 
	            {
	                low = mid + 1;
	            } else
	            {
	                high = mid;
	            }
	        }
	        return low;  
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " sorted integers:");
	        for (int i = 0; i < n; i++)
	        {
	            arr[i] = scanner.nextInt();
	        }
	        System.out.print("Enter target value: ");
	        int target = scanner.nextInt();
	        int index = lowerBound(arr, target);
	        System.out.println("Lower bound index: " + index);
	        if (index < n) 
	        {
	            System.out.println("Value at lower bound: " + arr[index]);
	        } else
	        {
	            System.out.println("No element ≥ target in the array.");
	        }
	    }
	}
package Day2;

public class Task3 {
	    public static int removeDuplicates(int[] nums) {
	        if (nums.length == 0) {
	            return 0;
	        }
	        int uniqueIndex = 1;
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) { 
	                nums[uniqueIndex] = nums[i];
	                uniqueIndex++; 
	            }
	        }
	        return uniqueIndex; 
	    }
	    public static void main(String[] args) {
	        int[] nums = {1, 2, 2, 3, 4, 4, 5};
	        int newLength = removeDuplicates(nums);     
	        for (int i = 0; i < newLength; i++) {
	            System.out.print(nums[i] + " ");
	        }
	    }
	}


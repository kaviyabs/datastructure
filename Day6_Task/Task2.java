package day6;

	import java.util.Scanner;
	public class Task2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int maxSize = 5;             
	        int[] stack = new int[maxSize];
	        int top = -1;                	      
            while (true) {
	            System.out.println("\nChoose operation:");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Display stack");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");
	            int choice = scanner.nextInt();            
	           switch (choice) {
	                case 1: 
                    if (top == maxSize - 1) {
                        System.out.println("Stack Overflow! Cannot push more.");
	                    } else {
	                        System.out.print("Enter value to push: ");
	                        int value = scanner.nextInt();
	                        stack[++top] = value;
	                        System.out.println(value + " pushed to stack.");
	                    }
	                    break;	                
	                case 2: 
	                    if (top == -1) {
	                       System.out.println("Stack Underflow! Nothing to pop.");
	                    } else {
	                        int popped = stack[top--];
                        System.out.println(popped + " popped from stack.");
	                    }
	                    break;               
	                case 3:
	                    if (top == -1) {
                        System.out.println("Stack is empty.");
	                    } else {
	                        System.out.println("Top element is: " + stack[top]);
	                    }
	                    break;                
	                case 4: 
	                    if (top == -1) {
	                        System.out.println("Stack is empty.");
	                    } else {
	                        System.out.print("Stack elements: ");
	                        for (int i = top; i >= 0; i--) {
	                            System.out.print(stack[i] + " ");
	                        }
	                        System.out.println();
	                    }
	                    break;	               
	                case 5: 
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    System.exit(0);                
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }
	}


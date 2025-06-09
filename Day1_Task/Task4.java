package Day1;
	import java.util.Scanner;
	public class Task4 {
	    private static final int MAX_SIZE = 10;
	    private static int[] array = new int[MAX_SIZE];
	    private static int size = 0;
	    private static Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	        System.out.println("Welcome to Recursive Array Manipulator!");
	        menu();
	    }
	    public static void menu() {
	        System.out.println("\nMenu:");
	        System.out.println("1. Insert element");
	        System.out.println("2. Delete element");
	        System.out.println("3. Update element");
	        System.out.println("4. Display array");
	        System.out.println("5. Exit");
	        System.out.print("Choose an option (1-5): ");
	        int choice = readInt();
	        switch (choice) {
	            case 1:
	                insertElement();
	                break;
	            case 2:
	                deleteElement();
	                break;
	            case 3:
	                updateElement();
	                break;
	            case 4:
	                displayArray();
	                break;
	            case 5:
	                System.out.println("Exiting program. Goodbye!");
	                scanner.close();
	                return; 
	            default:
	                System.out.println("Invalid choice, please try again.");
	        }
	        menu();
	    }
	    private static void insertElement() {
	        if (size >= MAX_SIZE) {
	            System.out.println("Array is full! Cannot insert more elements.");
            return;
	        }
	        System.out.print("Enter index to insert (0 to " + size + "): ");
	        int index = readInt();
	        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
	            return;
	        }
	        System.out.print("Enter value to insert: ");
	        int value = readInt();
	        for (int i = size; i > index; i--) {
	            array[i] = array[i - 1];
	        }
	        array[index] = value;
	        size++;
	        System.out.println("Inserted " + value + " at index " + index + ".");
	    }
	    private static void deleteElement() {
	        if (size == 0) {
	            System.out.println("Array is empty. Nothing to delete.");
	            return;
	        }
	        System.out.print("Enter index to delete (0 to " + (size - 1) + "): ");
	        int index = readInt();
	        if (index < 0 || index >= size) {
	            System.out.println("Invalid index.");
	            return;
	        }
	        int deletedValue = array[index];
	        for (int i = index; i < size -1; i++) {
	            array[i] = array[i + 1];
	       }
	        size--;
	        System.out.println("Deleted element " + deletedValue + " from index " + index + ".");
	    }
	    private static void updateElement() {
	        if (size == 0) {
	           System.out.println("Array is empty. Nothing to update.");
	            return;
	        }
	        System.out.print("Enter index to update (0 to " + (size - 1) + "): ");
	        int index = readInt();
	        if (index < 0 || index >= size) {
	            System.out.println("Invalid index.");
	            return;
	        }
	        System.out.print("Enter new value: ");
	        int newValue = readInt();
	        int oldValue = array[index];
	        array[index] = newValue;
        System.out.println("Updated index " + index + " from " + oldValue + " to " + newValue + ".");
	    }
	    private static void displayArray() {
	        if (size == 0) {
	            System.out.println("Array is empty.");
	            return;
	        }
	        System.out.print("Array elements: ");
	        for (int i = 0; i < size; i++) {
	            System.out.print(array[i] + (i < size - 1 ? ", " : ""));
	        }
	        System.out.println();
	    }
	    private static int readInt() {
	        while (!scanner.hasNextInt()) {
	            System.out.print("Invalid input. Enter an integer: ");
	            scanner.next();
	        }
	        return scanner.nextInt();
	    }
	}

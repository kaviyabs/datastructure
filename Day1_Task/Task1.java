package Day1;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Task1 {
	    public static void main(String[] args) {
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nArray Operations Menu:");
	            System.out.println("1. Insert");
	            System.out.println("2. Delete");
	            System.out.println("3. Update");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the number to insert: ");
	                    int insertValue = scanner.nextInt();
	                    arrayList.add(insertValue);
	                    System.out.println(insertValue + " inserted.");
	                    break;

	                case 2:
	                    System.out.print("Enter the index to delete: ");
	                    int deleteIndex = scanner.nextInt();
	                    if (deleteIndex >= 0 && deleteIndex < arrayList.size()) {
	                        int removedValue = arrayList.remove(deleteIndex);
	                        System.out.println(removedValue + " removed from index " + deleteIndex + ".");
	                    } else {
	                        System.out.println("Invalid index.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter the index to update: ");
	                    int updateIndex = scanner.nextInt();
	                    if (updateIndex >= 0 && updateIndex < arrayList.size()) {
	                        System.out.print("Enter the new value: ");
	                        int newValue = scanner.nextInt();
	                        arrayList.set(updateIndex, newValue);
	                        System.out.println("Value at index " + updateIndex + " updated to " + newValue + ".");
	                    } else {
	                        System.out.println("Invalid index.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Current Array: " + arrayList);
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	        scanner.close();
	    }
	}
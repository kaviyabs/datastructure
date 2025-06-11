package day4;
	 import java.util.ArrayList;
	 import java.util.List;
	 import java.util.Scanner;
	  public class Day4_PA {
	  private List<String> data;
	  private Scanner scanner;
	  public Day4_PA() {
	  data = new ArrayList<>();
	  scanner = new Scanner(System.in);
	  }
	  public void addElement(String element) {
	  data.add(element);
	  System.out.println("Element added: " + element);
	  }
	  public void removeElement(String element) {
	  if (data.remove(element)) {
	  System.out.println("Element removed: " + element);
	  } else {
	  System.out.println("Element not found: " + element);
	  }
	  }
	  public void displayElements() {
	  if (data.isEmpty()) {
	  System.out.println("List is empty.");
	  return;
	  }
	  System.out.println("Elements in the list:");
	  for (int i = 0; i < data.size(); i++) {
	  System.out.println((i + 1) + ". " + data.get(i));
	  }
	  }
	  public boolean searchElement(String element) {
	  if (data.contains(element)) {
	  System.out.println("Element found: " + element);
	  return true;
	  } else {
	  System.out.println("Element not found: " + element);
	  return false;
	  }
	  }
	  public int getSize() {
	  return data.size();
	  }
	  public void runMenu() {
	  int choice;
	  do {
	  System.out.println("\nMenu:");
	  System.out.println("1. Add Element");
	  System.out.println("2. Remove Element");
	  System.out.println("3. Display Elements");
	  System.out.println("4. Search Element");
	  System.out.println("5. Get Size");
	  System.out.println("6. Exit");
	  System.out.print("Enter your choice: ");
	  choice = scanner.nextInt();
	  scanner.nextLine(); 
	  switch (choice) {
	  case 1:
	  System.out.print("Enter element to add: ");
	  String elementToAdd = scanner.nextLine();
	  addElement(elementToAdd);
	  break;
	  case 2:
	  System.out.print("Enter element to remove: ");
	  String elementToRemove = scanner.nextLine();
	  removeElement(elementToRemove);
	  break;
	  case 3:
	  displayElements();
	  break;
	  case 4:
	  System.out.print("Enter element to search: ");
	  String elementToSearch = scanner.nextLine();
	  searchElement(elementToSearch);
	  break;
	  case 5:
	  System.out.println("Size of the list: " + getSize());
	  break;
	  case 0:
	  System.out.println("Exiting...");
	  break;
	  default:
	  System.out.println("Invalid choice. Please try again.");
	  }
	  } while (choice != 0);
	  }
	  public static void main(String[] args) {
		  Day4_PA dll = new Day4_PA();
	  dll.runMenu();
	  }
	 }
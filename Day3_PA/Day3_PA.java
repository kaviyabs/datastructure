package day3;
import java.util.Scanner;
   public class Day3_PA {
    static class Node {
      int data; 
      Node next;
       Node(int data) { this.data = data; }
    }
    static class SLL {
        Node head;
        void insertAtBeginning(int data) {
            Node newNode = new Node(data); newNode.next = head; head = newNode;
        }
        void insertAtEnd(int data)
        {
            if (head == null) { head = new Node(data); return; }
            Node temp = head; while (temp.next != null) temp = temp.next;
            temp.next = new Node(data);
        }
        void display()
        {
            Node temp = head; while (temp != null) { System.out.print(temp.data + " -> "); 
            temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SLL list = new SLL();
        int choice;
        do {
            System.out.println("\n1. Insert at Beginning\n2. Insert at End\n3. Display\n4. Exit");
            choice = scanner.nextInt();
            if (choice == 1) { System.out.print("Enter value: "); 
            list.insertAtBeginning(scanner.nextInt());
            }
            else if (choice == 2) { System.out.print("Enter value: ");
            list.insertAtEnd(scanner.nextInt()); 
            }
            else if (choice == 3) list.display();
        } while (choice != 4);
        scanner.close();
    }
}
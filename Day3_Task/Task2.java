package day3;
import java.util.Scanner;

public class Task2 {

    static class Node {

        int data; Node next;

        Node(int data) { this.data = data; }

    }



    static class SLL {

        Node head;

        void insertAtPosition(int data, int position) {

            Node newNode = new Node(data);

            if (position == 0) { newNode.next = head; head = newNode; return; }

            Node temp = head;

            for (int i = 0; i < position - 1 && temp != null; i++) temp = temp.next;

            if (temp == null) { System.out.println("Position out of bounds."); return; }

            newNode.next = temp.next; temp.next = newNode;

        }

        void display() {

            Node temp = head; while (temp != null) { System.out.print(temp.data + " -> "); temp = temp.next; }

            System.out.println("null");

        }

    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SLL list = new SLL();

        int choice;

        do {

            System.out.println("\n1. Insert at Position\n2. Display\n3. Exit");

            choice = scanner.nextInt();

            if (choice == 1) {

                System.out.print("Enter value: "); int value = scanner.nextInt();

                System.out.print("Enter position: "); int position = scanner.nextInt();

                list.insertAtPosition(value, position);

            } else if (choice == 2) list.display();

        } while (choice != 3);

        scanner.close();

    }

}


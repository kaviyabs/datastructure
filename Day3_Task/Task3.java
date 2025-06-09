package day3;
	class Node {
	    int data;
	    Node next;
	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	public class Task3 {
	    Node head;
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        if (position == 1) {
	            head = head.next;
	            return;
	        }
	        Node current = head;
	        Node prev = null;
	        int count = 1;
	        while (current != null && count < position) {
	            prev = current;
	            current = current.next;
	            count++;
	        }
        if (current == null) {
	           System.out.println("Position exceeds list length");
	            return;
	        }
	        prev.next = current.next;
	    }
        public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	    public static void main(String[] args) {
	    	Task3 list = new Task3();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);
	        list.insert(50);
	        System.out.println("Original list:");
	        list.display();
	        java.util.Scanner scanner = new java.util.Scanner(System.in);
	        System.out.print("Enter position to delete (1-based index): ");
	        int position = scanner.nextInt();
	        list.deleteAtPosition(position);
            System.out.println("List after deletion:");
	        list.display();
            scanner.close();

	    }
	}



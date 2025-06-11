package day4;
public class Task2 {
	    static class Node {
	        int data;
	        Node next, prev;
	        Node(int data) { this.data = data; }
	    }
	    static class DoublyLinkedList {
	        Node head;
	        public void insertAtEnd(int data) {
	            Node newNode = new Node(data);
	            if (head == null) { head = newNode; return; }
	            Node current = head;
	            while (current.next != null) current = current.next;
	            current.next = newNode;
	            newNode.prev = current;
	        }
	        public void insertAtMiddle(int data) {
	            Node newNode = new Node(data);
	            if (head == null) { head = newNode; return; }
	            Node slow = head, fast = head;
	            while (fast != null && fast.next != null) {
	                fast = fast.next.next;
	                slow = slow.next;
	            }
	            if (slow != null) {
	                newNode.next = slow;
	                newNode.prev = slow.prev;
	                if (slow.prev != null) {
	                    slow.prev.next = newNode;
	                } else {
	                    head = newNode; 
	                }
	                slow.prev = newNode;
	            }
	        }	  
	        public void printList() {
	            Node current = head;
	            System.out.print("Doubly Linked List: ");
	            while (current != null) {
	                System.out.print(current.data + (current.next != null ? " , " : ""));
	                current = current.next;
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();
	        list.insertAtEnd(10);
	        list.insertAtEnd(20);
	        list.insertAtEnd(30);
	        list.insertAtMiddle(25);
            list.printList();
	    }
	}


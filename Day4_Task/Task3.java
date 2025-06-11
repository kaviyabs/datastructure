package day4;
	class Node {
	    int data;
	    Node next, prev;

	    Node(int data) {
	        this.data = data;
	    }
	}
	class DoublyLinkedList {
	    Node head;
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null) temp = temp.next;
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	    public void deleteMiddle() {
	        if (head == null) return;

	        Node slow = head, fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        if (slow.prev != null) slow.prev.next = slow.next;
	        else head = slow.next;

	        if (slow.next != null) slow.next.prev = slow.prev;
	    }
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	}
	public class Task3{
	    public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);
	        System.out.println("Original List:");
	        list.printList();
	        list.deleteMiddle();
	        System.out.println("List after deleting the middle node:");
	        list.printList();
	    }
	}


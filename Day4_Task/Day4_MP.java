package day4;

public class Day4_MP {
	  private Node head;
	  private Node tail;
	  private int size;
	  private static class Node {
	  String data;
	  Node next;
	  Node prev;
	  Node(String data) {
	  this.data = data;
	  this.next = null;
	  this.prev = null;
	  }
	  }
	  public Day4_MP() {
	  head = null;
	  tail = null;
	  size = 0;
	  }
	  public void add(String data) {
	  Node newNode = new Node(data);
	  if (head == null) {
	  head = newNode;
	  tail = newNode;
	  } else {
	  tail.next = newNode;
	  newNode.prev = tail;
	  tail = newNode;
	  }
	  size++;
	  }
	  public void traverseForward() {
	  if (head == null) {
	  System.out.println("List is empty.");
	  return;
	  }
	  System.out.println("Traversing forward:");
	  Node current = head;
	  while (current != null) {
	  System.out.print(current.data + " ");
	  current = current.next;
	  }
	  System.out.println();
	  }
	  public void traverseBackward() {
	  if (tail == null) {
	  System.out.println("List is empty.");
	  return;
	  }
	  System.out.println("Traversing backward:");
	  Node current = tail;
	  while (current != null) {
	  System.out.print(current.data + " ");
	  current = current.prev;
	  }
	  System.out.println();
	  }
	  public int getSize() {
	  return size;
	  }
	  public static void main(String[] args) {
		  Day4_MP t4 = new Day4_MP();
	  t4.add("2");
	  t4.add("4");
	  t4.add("6");
	  t4.add("8");
	  t4.add("10");
	  t4.traverseForward();
	  t4.traverseBackward();
	  System.out.println("Size of the list: " + t4.getSize());
	  }
	 }
	 


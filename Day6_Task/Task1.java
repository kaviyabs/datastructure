package day6;

public class Task1 {
    private int[] stackArray;
    private int top;
    private int capacity;
    public Task1(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }
    public void push(int item) {
        if (top == capacity - 1) {
           System.out.println("Stack Overflow! Cannot push " + item);
           return;
        }
        stackArray[++top] = item;
        System.out.println(item + " pushed to stack");
    }
    public int pop() {
    	 if (top == -1) {
             System.out.println("Stack Underflow! Cannot pop from empty stack");
             return -1; 
         }
         return stackArray[top--];
     }
     public static void main(String[] args) {
         Task1 stack = new Task1(5);
         stack.push(10);
         stack.push(20);
         System.out.println(stack.pop() + " popped from stack");
     }
}
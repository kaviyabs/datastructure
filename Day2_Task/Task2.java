package Day2;
import java.util.*;

public class Task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Integer[] original = new Integer[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }
        
        Integer[] sorted = new Integer[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = original[i];
        }
        Arrays.sort(sorted, Collections.reverseOrder());
        System.out.println("Sorted array in descending order:");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        sc.close();
    }
}

// write a java program to print the sorted list of integers by using one of the collection set

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to sort");
        int n = sc.nextInt();
        Set<Integer> sortedSet = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your Element: ");
            int a = sc.nextInt();
            sortedSet.add(a);
        }

        System.out.println("The Sorted set is : " + sortedSet);

    }
}
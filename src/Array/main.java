package Array;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Uzunluğu daxil edin: ");
        int n = scanner.nextInt();
        int[] array = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println(array);

    }

    }



package hometasks;

import java.util.Scanner;

public class ArrayAppears {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int uzunluq = 5;

        int[] array = new int[uzunluq];

        System.out.println("5 ədəd daxil edin: ");

        for (int i = 0; i < uzunluq; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Təkrarlanan ədədlər: ");
        boolean found = false;

        for (int i = 0; i < uzunluq; i++) {

            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;

                    break;

                }
            }

            if (!isDuplicate) {
                int count = 0;

                for (int k = 0; k < uzunluq; k++) {
                    if (array[i] == array[k]) {
                        count++;
                    }
                    }
                if (count > 1) {
                    System.out.println(array[i] + " ədədi " + count + " dəfə təkrarlanır. ");
                    found = true;
                }
                }
            }
        if (!found) {
            System.out.println("Təkrarlanan ədəd yoxdur! ");
        }
        scanner.close();
}
}


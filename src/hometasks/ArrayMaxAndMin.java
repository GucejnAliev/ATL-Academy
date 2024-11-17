package hometasks;

import java.util.Scanner;

public class ArrayMaxAndMin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int uzunluq = 5;

        int[] array = new int[uzunluq];

        System.out.println("5 ədəd daxil edin: ");
        for (int i = 0; i < uzunluq; i++) {
            array[i] = scanner.nextInt();
        }
            int min = array[0];
            int max = array[0];

            for (int i = 1; i < uzunluq; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("Minimal ədəd: " + min);
            System.out.println("Maksimal ədəd: " + max);

            scanner.close();
        }

    }

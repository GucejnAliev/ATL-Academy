package hometasks;

import java.util.Scanner;

/*public class ArraySumAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int uzunluq = 5;

        int[] array = new int[uzunluq];

        System.out.println("5 ədəd daxil edin: ");
        for (int i = 0; i < uzunluq; i++) {
            array[i] = scanner.nextInt();
        }
        int cəm = 0;
        for (int i = 0; i < uzunluq; i++) {
cəm += array[i];}
        double ədədiOrta = (double) cəm / uzunluq;
        System.out.println("Ədədlərin cəmi: " + cəm);
        System.out.println("Ədədi ortası: " + ədədiOrta);

        scanner.close();
        }
    }


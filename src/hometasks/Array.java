package hometasks;

import java.util.Scanner;

public class Array
{ public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int uzunluq = 5;

    String[] array = new String[uzunluq];

    System.out.println("5 element daxil edin: ");
    for (int i = 0; i < uzunluq; i++) {
        array[i] = scanner.nextLine();
    }
    StringBuilder nəticə = new StringBuilder();
    for (int i = 0; i < uzunluq; i++) {
        nəticə.append(array[i]);
    }
    String output = nəticə.toString();

    if (output.length() == 5) {
        System.out.println("5 elementli sətirin uzunluğu " + output);
    } else {
        System.out.println("Sətirin uzunluğu 5 deyil, uzunluğu " + output.length());

    }

    }
}

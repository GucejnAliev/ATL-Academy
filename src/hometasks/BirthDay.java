package hometasks;

import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı daxil edin: ");
        String name = scanner.nextLine();

        System.out.println("Yaşınızı daxil edin: ");
        int age = scanner.nextInt();

        int currentYear = 2024;
        int birthYear = currentYear - age;

        System.out.println("Salam, " + name + "! Siz " + birthYear + "-c(ı, i, u, ü) ildə doğulmusunuz.");
        scanner.close();
    }
}

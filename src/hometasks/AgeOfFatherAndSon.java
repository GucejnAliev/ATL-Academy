package hometasks;

import java.util.Scanner;

public class AgeOfFatherAndSon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Atanın yaşını daxil edin: ");
        int fatherAge = scanner.nextInt();

        System.out.println("Oğulun yaşını daxil edin: ");
        int sonAge = scanner.nextInt();

        int ageDifference = fatherAge - sonAge;

        System.out.println("Ata oğuldan " + ageDifference + " yaş böyükdür.");

        scanner.close();
    }
}

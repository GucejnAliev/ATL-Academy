import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long totalWheat = 0;
        long wheatOnCurrentSquare;

        for (int i = 1; i <= 64; i++) {
            wheatOnCurrentSquare = (long) Math.pow(2, i - 1);
            totalWheat += wheatOnCurrentSquare;
            System.out.println("Xana " + i + ": " + wheatOnCurrentSquare + " buğda");
        }
        {
            System.out.println("Xanadakı buğdaların ümumi sayı: " + totalWheat);
        }
    }


}



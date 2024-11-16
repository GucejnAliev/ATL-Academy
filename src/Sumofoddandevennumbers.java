import java.util.Scanner;

public class Sumofoddandevennumbers {
 public static void main(String[] args) {

     int sum = 0;
     int i = 1;

     do {
         sum += i;
         i++;
     } while (i < 11);

     System.out.println("1-dən 10-a qədər olan ədədlərin cəmi: " + sum);
     }
 }

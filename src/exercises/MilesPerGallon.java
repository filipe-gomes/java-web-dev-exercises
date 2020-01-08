package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles can you drive on a full tank?");
        int miles = input.nextInt();
        System.out.println("How many gallons can you store in a full tank?");
        int gallons = input.nextInt();
        int mpg = miles / gallons;
        System.out.println("Your car can do " + mpg + " miles per gallon");
    }
}

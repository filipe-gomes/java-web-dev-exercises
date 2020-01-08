package exercises;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide the width the rectangle: ");
        double width = input.nextDouble();
        System.out.println("Please provide the length the rectangle:");
        double length = input.nextDouble();

        double area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}

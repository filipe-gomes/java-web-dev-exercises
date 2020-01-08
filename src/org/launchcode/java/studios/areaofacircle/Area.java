package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a circle, and we will return its area: ");
        double r = input.nextDouble();
        double area = Circle.getArea(r);
        System.out.println("The area of the circle if " + area);
    }
}

package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Triangle triangleBob = new Triangle();
        triangleBob.name = "Triangle Bob";
        triangleBob.sideA = 4;
        triangleBob.sideB = 4;
        triangleBob.sideC = 4;

        Triangle triangleJane = new Triangle();
        triangleJane.name = "Triangle Jane";
        triangleJane.sideA = 3;
        triangleJane.sideB = 5;
        triangleJane.sideC = 8;

        printTriangleSummary(triangleBob);
        printTriangleSummary(triangleJane);
    }

    private static void printTriangleSummary(Triangle triangle)
    {
        System.out.println("SideA's length measures: " + triangle.sideA);
        System.out.println("SideB's length measures: " + triangle.sideB);
        System.out.println("SideC's length measures: " + triangle.sideC);

        System.out.println("The perimeter of " + triangle.name + " is: " + triangle.getPerimeter());
        System.out.println(triangle.name + " is equilateral:  " + triangle.isEquilateral() );
    }
}

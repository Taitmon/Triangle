package com.company;

public class Triangle
{
    int sideA, sideB, sideC;
    String name;

    public int getPerimeter()
    {
        int perimeter = this.sideA + this.sideB + this.sideC;

        return perimeter;
    }

    public boolean isEquilateral()
    {
        boolean equilateral;

        if(this.sideA == this.sideB && this.sideA == this.sideC && this.sideB == this.sideC)
        {
            equilateral = true;
        }
        else
        {
            equilateral = false;
        }
        return equilateral;
    }
}


package com.javagenerics;

public class Array {

    public static void printInteger(Integer [] intarray )
    {
        for (int i : intarray)
        {
            System.out.print(i+"  ");
        }
        System.out.println("\n");
    }

    public static void printDouble(Double [] doublearray )
    {
        for (double i : doublearray)
        {
            System.out.print(i+"  ");
        }
        System.out.println("\n");

    }

    public static void printChar(Character [] chararray )
    {
        for (char i : chararray)
        {
            System.out.print(i+"  ");
        }
        System.out.println("\n");

    }

    public static void main(String[] args) {
        Integer []    intArray = {1,3,5,7};
        Double []     doubleArray = {3.4,5.7,4.3,8.9};
        Character []  charArray = {'a','t','h','n'};

        Array.printInteger(intArray);
        Array.printDouble(doubleArray);
        Array.printChar(charArray);
    }

}
package com.javagenerics;

public class Generics {

    public static  <G> void print(G [] Array){
        for(G i: Array){
            System.out.println(i);
        }
        System.out.println("/n");
    }
    public static void main(String[] args) {
        Integer[] intArray={ 96, 10, 9, 4, 6};
        Double[] doubleArray= { 5.7, 3.9, 5.9, 3.5, 6.8};
        Character[] charArray = { 'w', 'n', 'b', 'h', 'r'};

        Generics.print(intArray);
        Generics.print(doubleArray);
        Generics.print(charArray);
    }
}

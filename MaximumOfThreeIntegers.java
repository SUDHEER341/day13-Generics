package com.javagenerics;


    public class MaximumOfThreeIntegers {
        public static <G extends Comparable<G>> G maximumInteger(G a, G b, G c) {
            G Max= a;

            if (b.compareTo(Max) > 0)
                Max = b;

            if (c.compareTo(Max) > 0)
                Max = c;

            return Max;
        }
        public static void main(String args[]) {
            System.out.println("maximum of three given integer numbers is :" + maximumInteger(4,6,3) );
        }
    }


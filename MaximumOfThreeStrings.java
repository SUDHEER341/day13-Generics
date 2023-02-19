package com.javagenerics;

    public class MaximumOfThreeStrings {
        public static <G extends Comparable<G>> G maximumString(G a, G b, G c) {
            G MaxString = a;

            if (b.compareTo(MaxString) > 0)
                MaxString = b;

            if (c.compareTo(MaxString) > 0)
                MaxString = c;

            return MaxString;
        }

        public static void main(String args[]) {

            System.out.println("Maximum of given three strings  : "+maximumString("ravi","surya","sushant"));
        }
    }


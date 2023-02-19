package com.javagenerics;


    public class MaximumOfThreeFloatValues {
        public static <G extends Comparable<G>> G maximumFloat(G a, G b, G c) {
            G Max = a;
            if (b.compareTo(Max) > 0)
                Max = b;
            if (c.compareTo(Max) > 0)
                Max = c;

            return Max;
        }

        public static void main(String args[]) {
            System.out.println("Maximum of three given float values : "+ maximumFloat(4.6,3.8,9.2));
        }
}

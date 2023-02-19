package com.javagenerics;
    public class FindMaximum<G extends Comparable<G>> {
        G element1, element2, element3;

        public FindMaximum(G element1, G element2, G element3) {
            this.element1 = element1;
            this.element2 = element2;
            this.element3 = element3;
        }

        public G maximum() {
            return FindMaximum.maximum(element1, element2, element3);
        }

        public static <G extends Comparable<G>> G maximum(G element1, G element2, G element3) {
            G max = element1;
            if (element2.compareTo(max) > 0) {
                max = element2;
            }
            if (element3.compareTo(max) > 0) {
                max = element3;
            }
            printMax(element1, element2, element3, max);
            return max;
        }

        public static String MaxString(String x, String y, String z) {
            String max = x;
            if (y.compareTo(max) > 0) {
                max = y;
            }
            if (z.compareTo(max) > 0) {
                max = z;
            }
            printMax(x, y, z, max);
            return max;
        }

        public static <G> void printMax(G element1, G element2, G element3, G max) {
            System.out.printf("Maximum of %s,%s and %s is : %s\n", element1, element2, element3, max);
        }

        public static void main(String[] args) {
            Integer xInt = 12, yInt = 23, zInt = 34;
            Float xFl = 12.5f, yFl = 8.8f, zFl = 7.7f;
            String xStr = "volvo", yStr = "bently", zStr = "kia";

           // FindMaximum.MaxString(xStr, yStr, zStr);
            new FindMaximum<>(xInt, yInt, zInt).maximum();
            new FindMaximum<>(xStr, yStr, zStr).maximum();
            new FindMaximum<>(xFl, yFl, zFl).maximum();

        }
    }


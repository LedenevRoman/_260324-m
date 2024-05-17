package org.example._2024_05_17;

import java.math.BigInteger;

public class MathExample {
    public static void main(String[] args) {
        int a = 3;
        int b = (int) Math.pow(a, 3);
        System.out.println(b);

        double c = Math.sqrt(2);
        System.out.println(c);

        BigInteger d = BigInteger.valueOf(15);
        BigInteger e = BigInteger.valueOf(5);

        BigInteger f = d.add(e);
        BigInteger j = d.subtract(e);
        BigInteger h = d.multiply(e);
        BigInteger k = d.divide(e);
        System.out.println(f);
        System.out.println(j);
        System.out.println(h);
        System.out.println(k);
    }
}

package com.arrays;

//6th File
import java.math.BigInteger;
import java.math.BigDecimal;

public class BigIntegerLesson {
    public static void main(String[] args) {
        int a = 33;
        int b = 345;

        // int to BigInteger
        BigInteger A = BigInteger.valueOf(2545);
        BigInteger B = BigInteger.valueOf(363165464);

        // We can import number from string also.
        // Remember, for this we have to create BigInteger Object. It won't work by "valueOf"
        BigInteger str = new BigInteger("35465546");
        System.out.println(new BigInteger("415465165"));

        //Constants
        BigInteger e = BigInteger.TWO.pow(10);
        BigInteger E = BigInteger.TWO.pow(16);
        System.out.println(e + " " + E);

        //Addition
        BigInteger s = e.add(B);
        System.out.println(s);



        double x = 0.03;
        double y = 0.04;
        double ans = x-y;
        // Double and Float have an error with precision of 10^-19.

        // BigDecimal
        // Same way we have "BigDecimal" for large Decimals.
        BigDecimal X = new BigDecimal("0.05");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ANS = X.subtract(Y);
        // BigDecimal does not have an error
        System.out.println(ans + " " + ANS);


        // Complex decimal numbers
        BigDecimal c = new BigDecimal(453434.126456);
        BigDecimal d = new BigDecimal(54564.1541);

        System.out.println(c.multiply(d));
        System.out.println(c.negate());
        System.out.println(c.remainder(d));
        //System.out.println(c.divide(d));
    }
}

package com.example.codewars;

public class NumberFun {

    /**
     * Finds the next square given the value input.
     *
     * @param value square value.
     * @return next square value to value.
     */
    public static long findNextSquare(long value) {

        long square = (long) Math.sqrt(value);
        if ((square * square) == value) {
           return (square + 1) * (square + 1);
        }
        return -1;
    }
}

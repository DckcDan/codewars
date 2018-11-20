package com.example.codewars;


public class CountingDuplicates {

    private static final String EMPTY = "";

    public static int duplicateCount(String source) {

        source = source.toLowerCase();
        int counter = 0;
        while(source.length() > 0){
            String character = source.substring(0,1);
            source = source.substring(1);
            if(source.contains(character)){
                counter++;
                source = source.replaceAll(character,EMPTY);
            }
        }


        return counter;
    }

}

package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String string = "abc+6";


        // First you need pattern
        String specialSignsPattern = "[+\\-*/]";
        // then compile this pattern
        Pattern checkRegex = Pattern.compile(specialSignsPattern);
        // then you need check if given string matches pattern
        Matcher matcher = checkRegex.matcher(string);
        // you can check it by following way:

        while (matcher.find()) {


            if (matcher.group().length() != 0) {
                System.out.println(matcher.group().trim());
            }
        }


    }
}

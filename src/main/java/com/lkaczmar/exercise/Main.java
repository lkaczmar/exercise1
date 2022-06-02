package com.lkaczmar.exercise;

import com.lkaczmar.exercise.convert.Converter;
import org.apache.commons.codec.digest.DigestUtils;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        System.out.println("Enter number:");

        Scanner readme = new Scanner(System.in);
        Integer input = Integer.valueOf(readme.nextLine());

        Function<Integer,String> romanNumeralsFunc = (arg)->Converter.integerToRoman5(arg);
        String numeral = romanNumeralsFunc.apply(input);

        System.out.println("Super duper secret result: "+ numeral+ "         secret:"+ DigestUtils
                .md5Hex(numeral).toUpperCase());

    }
}
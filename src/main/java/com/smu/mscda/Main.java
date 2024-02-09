package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This program will capitalize the input string and Generate MD5 hex");
        System.out.println("Enter the input string:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String input_capitalize = capitalizeString(input);
        System.out.println("Capitalized string is: " + input_capitalize);
        String md5Hex = generateMD5Hex(input);
        System.out.println("MD5 Hex is: " + md5Hex);
    }

    public static String capitalizeString(String input) {
        return StringUtils.capitalize(input);
    }

    public static String generateMD5Hex(String input) {
        return DigestUtils.md5Hex(input);
    }
}

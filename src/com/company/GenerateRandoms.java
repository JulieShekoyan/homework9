package com.company;

import java.util.Random;

public class GenerateRandoms {
    public static int generateRandomNumber() {
        Random random = new Random();
        int size = 3 + random.nextInt(8);
        return size;
    }

    public static String generateRandomString(int size) {
        Random random = new Random();
        String randomText = "";

        for (int i = 0; i < size; i++) {
            int number = 97 + random.nextInt(25);
            char symbol = (char) number;
            if (i == 0) {
                String s = String.valueOf(symbol).toUpperCase();
                randomText += s;
            } else {
                randomText += symbol;
            }
        }
        return randomText;


    }

    public static int generateRandomDate() {
        Random random = new Random();
        int date = 1950 + random.nextInt(72);
        return date;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Human human = new Human(GenerateRandoms.generateRandomString(GenerateRandoms.generateRandomNumber()), GenerateRandoms.generateRandomString(GenerateRandoms.generateRandomNumber()), GenerateRandoms.generateRandomDate());
            System.out.println(human);
        }
    }
}

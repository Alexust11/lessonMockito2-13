package org.example;

public class StudentValueGenerator {
    private static int DEFAULT_MAX=100;
    private static int DEFAULT_MIN=1;
    public int generateAge() {
        return generateAgeRange(DEFAULT_MIN, DEFAULT_MAX);
    }

    public int generateAgeRange(int min, int max) {
        return (int) ((Math.random()*(max-min))+min);
    }
}

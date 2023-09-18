package com.acme.hamming;

public class HammingMeter {

    public int distance(String str1, String str2) {
        if (str1.length() != str2.length()) {
            throw new IllegalArgumentException("Both strings should be of equal length");
        }
        int distance = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (!this.compare(str1.charAt(i), str2.charAt(i))) {
                distance++;
            }
        }
        return distance;
    }

    protected boolean compare(char char1, char char2) {
        return char1 == char2;
    }
}

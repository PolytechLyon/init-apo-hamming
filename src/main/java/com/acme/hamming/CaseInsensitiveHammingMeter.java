package com.acme.hamming;

public class CaseInsensitiveHammingMeter extends HammingMeter {

    @Override
    protected boolean compare(char char1, char char2) {
        return Character.toLowerCase(char1) == Character.toLowerCase(char2);
    }
}

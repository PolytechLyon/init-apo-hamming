package com.acme.cli;

import com.acme.hamming.CaseInsensitiveHammingMeter;
import com.acme.hamming.HammingMeter;

import java.util.List;

public class Distance {

    public static void main(String[] args) {
        if (args.length < 2) {
            usage();
            return;
        }
        HammingMeter hammingMeter;
        String str1, str2;
        if (args.length > 2) {
            if (!List.of("-i", "--ignore-case").contains(args[0])) {
                usage();
                return;
            }
            hammingMeter = new CaseInsensitiveHammingMeter();
            str1 = args[1];
            str2 = args[2];
        } else {
            hammingMeter = new HammingMeter();
            str1 = args[0];
            str2 = args[1];
        }
        if (str1.length() != str2.length()) {
            System.out.println("Words should be equal in length.");
            return;
        }
        int result = hammingMeter.distance(str1, str2);
        if (result == 0) {
            System.out.println("Words are identical.");
        } else {
            System.out.printf("Words are %d apart.\n", result);
        }
    }

    private static void usage() {
        System.out.printf("Usage: java %s [-i|ignore-case] str1 str2\n", Distance.class.getName());
    }
}

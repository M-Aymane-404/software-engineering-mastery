package com.chat;

public class Main {

    public static void main(String[] args) {

        int passed = 0;
        int failed = 0;

        for (int i = 0; i < 256; i++) {

            String binary = BinaryToolkit.decimalToBinary(i);

            binary = "0".repeat(8 - binary.length()) + binary;

            int expected = (byte) i;
            int actual = BinaryToolkit.signedDecode(binary);

            if (actual == expected) {
                passed++;
            } else {
                failed++;

                System.out.println("Failed: " + binary
                        + " | Expected: " + expected
                        + " | Actual: " + actual);
            }
        }

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
    }
}
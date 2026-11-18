package com.chat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int passed = 0;
        int failed = 0;

        for (int i=0; i<256 ;i++){
           int n = BinaryToolkit.binaryToDecimal(BinaryToolkit.decimalToBinary(i));
           if(n==i){
               passed++;
           }else {
               failed++;
           }
        }

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);


        }
    }

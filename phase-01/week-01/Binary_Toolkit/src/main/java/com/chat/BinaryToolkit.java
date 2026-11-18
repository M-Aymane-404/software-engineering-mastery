package com.chat;

public class BinaryToolkit {


    public static  String   decimalToBinary(int n){
        String binary = "";
        int res;
        if(n<0){
            throw new IllegalArgumentException("Le nombre doit être positif ou nul");
        }
        if(n==0){
            return  "0" ;
        }

        while (n!=0){
            res = n % 2;
            n=n/2;
            binary = res + binary ;
        }
        return binary;
    }


    public static  int  binaryToDecimal(String binary){



        if (binary==null || binary.isEmpty()){
            throw new IllegalArgumentException("il faut entre un nombre binaire");
        }

        int decimal = 0;
        int nbBit = binary.length() ;
         for(int i=0;i<nbBit;i++){
            int bit = binary.charAt(i) -'0';

            if(!(bit == 0) && !(bit == 1)){
                throw new IllegalArgumentException("nombre doit contient juste une combinisant des 1 et 0");

            }

            if (decimal > (Integer.MAX_VALUE-bit)/2){
                throw new IllegalArgumentException("overflow");
            }
            decimal = decimal * 2 + bit;





         }

        return decimal;

    }



    public static int signedDecode(String binary){
        int decimal = 0;
        if(binary==null || binary.isEmpty()){
            throw new IllegalArgumentException("il faut entre un nombre binaire");
        }
        if(!(binary.trim().length()==8)){
            throw new IllegalArgumentException("il faut entrere 8 bit ");
        }

       decimal = binaryToDecimal(binary);



        if (decimal > 127){

            return  (decimal - 256) ;
        }
        return decimal;
    }
}

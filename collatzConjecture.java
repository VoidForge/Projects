package com.VoidVoice;

import java.util.Scanner;

public class collatzConjecture {

    public static void main(){
        Scanner scan = new Scanner(System.in);
        long num;
        while(true) {
            System.out.print("Enter a natural number which is larger than 1:");
            num = scan.nextLong();
            if (num < 2) {
                System.out.println("Invalid number! Please enter a valid number again.");
            }else{
                break;
            }
        }
        System.out.print(calculate(num));
    }

    private static long calculate(long num){
        long i = num;
        long times = 0;
        while(i > 1){
            i = 1 == (i % 2)? (i * 3) + 1 : i / 2;
            times++;
        }
        return times;
    }
}

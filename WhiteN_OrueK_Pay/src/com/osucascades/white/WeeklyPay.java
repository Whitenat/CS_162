package com.osucascades.white;

public class WeeklyPay {
    public static void pay(double basePay, int hours){
        if(hours < 60 && basePay>=20) {
            System.out.println("your pay is " + (basePay * hours));
        } else if (basePay < 20) {
            System.out.println("Not enough Money");
        }else if (hours > 60 && basePay >=20) {
            System.out.println("Take a weekend YOU FREAK! You're " + (hours-60) + " hours over");
        }

    }
    public static void main(String[] args) {
        pay(7.5, 35);
        pay(28.2, 47);
        pay(30.0, 73);
    }
}

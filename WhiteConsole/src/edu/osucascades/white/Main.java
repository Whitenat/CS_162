package edu.osucascades.white;

import java.util.Scanner;

public class Main {

    private static final String DEFAULT_PHRASE = "Please try again and enter a valid phrase";
    private static final String CLOSING_PHRASE = "You're gonna get fat";

    public static void main(String[] args) {

        int result = Integer.parseInt(args[0]);
        System.out.print("What is your favorite food? ");
        Scanner keyboard = new Scanner(System.in);
        String favoriteFood = keyboard.nextLine();


        if(favoriteFood.length()>0){
            for(int i=0; i < result;i++) {
                System.out.println(favoriteFood);
            }
            System.out.println(CLOSING_PHRASE);
        }else{
            System.out.println(DEFAULT_PHRASE);
        }
    }

//    public static void main(){
//        System.out.print("Please enter a number: ");
//        Scanner numkey = new Scanner(System.in);
//        int numberOfPhrases = numkey.nextInt();
//        System.out.print("What is your favorite food? ");
//        Scanner keyboard = new Scanner(System.in);
//        String favoriteFood = keyboard.nextLine();
//
//        if(favoriteFood.length()>0){
//            for(int i=0; i < numberOfPhrases;i++) {
//                System.out.println(favoriteFood);
//            }
//            System.out.println(CLOSING_PHRASE);
//        }else{
//            System.out.println(DEFAULT_PHRASE);
//        }
//    }
}

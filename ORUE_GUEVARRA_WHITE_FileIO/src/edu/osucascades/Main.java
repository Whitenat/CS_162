//Assignment 14 - File IO
//Natashia White
//This assignment is to take a data file as an input, parse the data to make country objects and calculations
//and then write the data out to separate .txt files for every country object

package edu.osucascades;
import java.io.*;
import java.util.*;


public class Main {

    static ArrayList<String> countryData = new ArrayList<>();
    static ArrayList<Country> countries = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        String fileName = args[0];
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
    }

        while(fileIn.hasNext()){
            countryData.add(fileIn.nextLine());
        }
        for (String country: countryData) {
            countries.add(new Country(country));
        }

        for (Country country : countries){
            try {
                country.displayAll();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }





    }

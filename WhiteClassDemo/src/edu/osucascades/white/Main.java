package edu.osucascades.white;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> scores = new ArrayList<>();
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new File("Num.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (fileIn.hasNext()) {
            scores.add(fileIn.nextInt());
        }

        System.out.println(scores);
    }
}

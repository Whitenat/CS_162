package com.osucascades.white;

public class Main {

    public static void main(String[] args) {

        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
        };

        int[] times = {
                341,273,278,329,445,402,388,275,243,334,412,293,299,343,317,265
        };

        int fastestTime = 0;
        int fastestIndex = 0;

        for(int i = 0; i <names.length; ++i) {
            if(times[i] > fastestTime){
                fastestIndex = i;
                fastestTime = times[i];
            }
        }

        System.out.println(names[fastestIndex] + " : " + times[fastestIndex]);
    }


}

package edu.osucascades;
import java.util.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.*;

/* This class defines a blueprint for a country object.  It contains member variables and data structures to
store information about a country */
public class Country {

    //Create the following member variables:

    String name; //countryName: stores the name of the country
    ArrayList <Float> lifeExpectancies = new ArrayList<>(); //lifeExpectancies: stores all life expectancy values for the country
    float maximum;  //maximum: stores to maximum life expectancy value for the country
    float minimum; //minimum: stores to minimum life expectancy value for the country */


        /* The constructor receives a row of data as a String. It's job is to extract the name and store
        the value in the object's member variable and extract the life expectancy data and store it in the object's
        data structure. Test this by printing the object's name and life expectancy data to the screen.
         */
        public Country(String line) {
            Scanner scanner = new Scanner(line);
            name = scanner.next();
            while (scanner.hasNext()) {
                lifeExpectancies.add(Float.parseFloat(scanner.next()));
            }

        }

        /* This method calculates the max and min life expectancy values from the data set.
        Check out the constants Double.MIN_VALUE iand Double.MAX_VALUE. They could be useful here. Make sure
        to print the values to the screen before proceeding
         */
        public String maxMin() {
            maximum = 0;
            minimum = 100;
            for (Float expected : lifeExpectancies){
                if(expected > maximum){
                    maximum = expected;
                } else if(expected < minimum){
                    minimum = expected;
                }
            }
            return("The minimum life expectancy for " + name + " is " + minimum + "\n" +"The maximum life expectancy for " + name + " is " + maximum);

        }


        /* You know what this does. Print the average to the screen before proceeding just to make sure all is good  */
        public String average() {
            float total = 0;
            for (Float expected : lifeExpectancies){
                total += expected;
            }
            float average = total/lifeExpectancies.size();
            return("the average life expectancy for " + name + " is " + average);

        }

        /* This method should create a file named countryName.txt (substitute countryName with the actual name of the country.
        Print "Country" and "Life Expectancy" to line 1 of the file
        One each subsequent line, print the country name followed by a life expectancy value ( see example output file)
        After all values have been printed (one per line), print the average life expectancy for the country
        Then print the minimum life expectancy for the country
        Finally print the minimum life expectancy for the country
        Don't forget to close the file!
         */
        void displayAll() throws IOException {
            File file = new File(name+".txt");
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fos);

            pw.write(name + "   life expectancy");
            pw.println();
            for(float expectancy : lifeExpectancies){
                pw.write(name + "   " + expectancy);
                pw.println();
            }
            pw.write(maxMin());
            pw.println();
            pw.write(average());

            pw.flush();
            fos.close();
            pw.close();


        }

}

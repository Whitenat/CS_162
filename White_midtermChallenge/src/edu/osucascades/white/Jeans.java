package edu.osucascades.white;

public class Jeans extends Clothing {

    String whenToWear;

    Jeans(int size, float price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
        whenToWear = "Wear with a shirt";
    }

    void setWhenToWear(String whenToWear){
        this.whenToWear = whenToWear;

    }



    void instructions(){
        System.out.println(whenToWear);
    }
}

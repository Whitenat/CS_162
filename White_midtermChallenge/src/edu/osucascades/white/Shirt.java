package edu.osucascades.white;

public class Shirt extends Clothing {

    String whenToWear;

    Shirt(int size, float price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
        whenToWear = "Wear with pants";
    }

    void setWhenToWear(String whenToWear){
        this.whenToWear = whenToWear;

    }

    void instructions(){
        System.out.println(whenToWear);
    }
}

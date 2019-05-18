package edu.osucascades.white;

public class Clothing {

    public int size;
    public float price;
    public String color;

    Clothing(){
        size = 0;
        price = 0;
        color = "No Color";
    }

    Clothing(int size, float price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return(this.size);
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice(){
        return(this.price);
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return(this.color);
    }


    public boolean clashesWith(Clothing clothing){
        boolean clashes = false;
        if(this.color.equals(clothing.getColor())){
            clashes = true;
        }
        return clashes;
    }
}

package edu.osucascades.white;

public class Hat extends Clothing {

    String whenToWear;

    Hat(){
        whenToWear = "Always";
    }

    void setWhenToWear(String whenToWear){
        this.whenToWear = whenToWear;

    }

    public boolean clashesWith(){
        return(false);
    }
}

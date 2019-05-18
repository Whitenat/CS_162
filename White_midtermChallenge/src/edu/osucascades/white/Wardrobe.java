package edu.osucascades.white;

import java.util.ArrayList;

public class Wardrobe {


    public static void main(String[] args) {
	// write your code here
        ArrayList<Clothing> wardrobe = new ArrayList<>();
        float cost = 0;

        wardrobe.add(new Jeans(5,10, "Blue"));
        wardrobe.add(new Jeans(8,20, "Indigo"));
        wardrobe.add(new Shirt(8, 15, "Red Plaid"));
        wardrobe.add(new Hat());

        Shirt newShirt= new Shirt(8,20,"Blue");

        for(Clothing item : wardrobe){
            System.out.println(item.color);
            cost += item.getPrice();
            System.out.println(item.clashesWith(newShirt));

        }


        System.out.println(cost);
        newShirt.instructions();



    }
}

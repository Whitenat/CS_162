package edu.osucascades.white;

public class SingingZombie extends Zombie {
    String song;

    SingingZombie(String name){
        this.name = name;
        noise = "You may say I'm a dreamer, but I'm not the only one ";
         song = "Truth Hurts";
    }

    SingingZombie(String name, String song){
        this.name = name;
        noise = "You may say I'm a dreamer, but I'm not the only one ";
        this.song = song;
    }

    public void favoriteSong(){
        System.out.println("My favorite song is " + song);
    }
}

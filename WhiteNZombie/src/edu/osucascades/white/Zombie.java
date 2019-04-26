package edu.osucascades.white;
import java.util.*;

public class Zombie {

    String name;
    String noise;
    int health;
    int speed;

    Zombie(){
        name = "Paul";
        noise = "Hi!";
    }

    void setName(String name){
        this.name = name;
    }

    void setHealth(int health){
        this.health = health;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    void makeNoise(){
        System.out.println(noise + name);
    }

    public static void main(String[] args) {
//        GroaningZombie zombieOne = new GroaningZombie("Steve");
//        WhisperingZombie zombieTwo = new WhisperingZombie("Shelly");
//        SingingZombie zombieThree = new SingingZombie ("Paula");
//        RappingZombie zombieFour = new RappingZombie("Stuart");
//        ShoutingZombie zombieFive = new ShoutingZombie ("Shayla");

//        zombieOne.makeNoise();
//        zombieTwo.makeNoise();
//        zombieThree.makeNoise();
//        zombieFour.makeNoise();
//        zombieFive.makeNoise();
//
        ArrayList<Zombie>zombies= new ArrayList<>();

        zombies.add(new GroaningZombie("Steve"));
        zombies.add(new WhisperingZombie("Shelly"));
        zombies.add(new SingingZombie ("Paula"));
        zombies.add(new RappingZombie("Stuart"));
        zombies.add(new ShoutingZombie ("Shayla"));

        for(Zombie zombie :zombies){
            zombie.makeNoise();
        }



    }

}

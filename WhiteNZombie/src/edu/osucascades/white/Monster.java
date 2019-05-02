package edu.osucascades.white;

import java.util.ArrayList;

class Monster {
    //add fields using the most restrictive type possible
    //For all fields think about the following:
    //(What is the access modifier? Public, Private,Protected? Is it static?)
    private String name;
    private int health;
    private static int numOfMonsters;
    private boolean dead;

    //add constructor(s)
    Monster(){
        numOfMonsters += 1;

    }

    Monster(String name){
        this.name = name;
        numOfMonsters += 1;
    }

    Monster(String name, int health){
        this.name = name;
        this.health = health;
        numOfMonsters += 1;

    }

    //add method getName(). It returns the name of the Monster. What is its access modifier? Is it static?
    public String getName(){
        return(name);
    }

    //add method setName(). It has a String parameter used to set the Monster's name. What is its access modifier? Is it static?
    public void setName(String name){
        this.name = name;
    }

    //add method getHealth(). It returns the health of the Monster. What is its access modifier? Is it static?
    public int getHealth(){
        return(health);
    }

    //add method setHealth(). It has a integer parameter used to set the Monster's health. What is its access modifier? Is it static?

    public void setHealth(int health){
        this.health = health;
    }

    //add method getNumOfMonsters(). It returns the total # of monsters created. What is its access modifier? Is it static?

    public int getNumOfMonsters(){
        return(numOfMonsters);
    }


    //function attack takes 2 parameters: the monster to attack and how many many health points the attacked monster loses when attacked
    public void attack(Monster monster, int damage){
        System.out.println(monster.getName());
        monster.setHealth(health - damage);
        System.out.println(monster.health);
        //print the name of the monster being attacked, lower its health, print it's health

    }

    //function isDead has no parameters. It returns true of the monster is dead and false if its alive.
    //It updates how many monsters are currently in the game
    //It prints the monster's name and whether it's alive or dead
    public boolean isDead(){
        dead = false;
        if(health <= 0){
            numOfMonsters -= 1;
            dead = true;
        }
        return dead;
    }
    //do not change function sayName. It is implemented for you
    public void sayName() {
        System.out.println("You can call me Monster " +name + " if you're nice!");
    }


    public static void main(String[] args) {

        Monster pete = new Monster("Pete", 20);
        Monster walter = new Monster("Walter", 1);
        pete.sayName();
        pete.attack(walter,2);
        ArrayList<Zombie> zombies= new ArrayList<>();

        zombies.add(new GroaningZombie("Steve"));
        zombies.add(new WhisperingZombie("Shelly"));
        zombies.add(new SingingZombie ("Paula"));
        zombies.add(new RappingZombie("Stuart"));
        zombies.add(new ShoutingZombie ("Shayla"));

        for(Zombie zombie :zombies){
            zombie.makeNoise();
            if(zombie instanceof SingingZombie){
                ((SingingZombie) zombie).favoriteSong();

            }
        }


        //Test your monster object before moving on
        //create a monster1 object and set it's name
        //make it tell you who it is
        //set the monster's health and check to see if it was set
        //how many monsters have been created?
        //create a monster2 object
        //how many monsters have been created?
        //make monster1 attack monster 2
        //check to see if monster 2 is alive
        //if it is, attack it again until it's dead
        //how many monsters are left?
    }
}

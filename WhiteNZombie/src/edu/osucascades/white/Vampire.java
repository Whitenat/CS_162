package edu.osucascades.white;

public class Vampire extends Monster {


//create a field to store the Vampires blood reserves.  Access mode? static? type?

//constructor(s)
        Vampire (){
        this("Default Vampire");  //this calls your parameterized constructor passing it the string "Default Vampire"
        }
        Vampire (String name){
            super(name);
        //call super classes constructor
        //initialize blood reserves
        //timer();  //check this function out. it draws down the object's blood reserves over time.
        }

/*  Leave this one as is. It reduces the vampires blood reserves by 3 every 10 seconds */
//private void timer() {
//        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(new TimerTask() {
//
//@Override
//public void run() {
//        //Your logic it will repeating your task ever 10 seconds....
//        loseBlood(3);
//
//        }
//        }, 5000, 5000);
//        }

//override sayName method

//define a new makeNoise method.  Make it say "I want to drink your blood" plus the vampire's name

//override attack. A vampire's attack works a little differently.
//They kill their opponent immediately and drink some of their blood
public void attack(Monster m,int attackPoints){
        //implement this method
        }

//define a new looseBlood method. Every time it's called, you reduce the Vampires blood reserves by the bloodAmount
public void loseBlood(int bloodAmount){
        //implement this method
        }

//override function isDead. The vampire dies when its bloodReserves run out.  Poor Edward!
public boolean isDead(){
        //Implement this function
        }

public static void main (String[] args){

        //create a new vampire
        //make it introduce itself and make a noise
        //create a new Zombie - whichever one you want
        //make it introduce itself and make a noise
        //set the Zombies health to 10 and make sure it's set to 10
        //let the vampire attack the Zombie
        //print the Zombie's health and display if its head

        }

        }

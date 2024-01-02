package org.launchcode;

import javax.management.openmbean.CompositeType;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfirld", 12);
        garfield.eat();
        System.out.println(garfield.isTired()); //prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); //prints 13

        //Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        //System.out.println(plainCat.noise()); //prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); //prints "Hello, my name is Cheshire!"

        //Cat salem = new Cat(8);

        //Casting
        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());; //Calls HouseCat's noise() method - Hello, my name is Suki!
        //System.out.println(suki.isSatisfied()); // compiler error, Cat does not contain such a method, no corresponding override method in Cat
        System.out.println(((HouseCat) suki).isSatisfied()); //as long as suki really is a HouseCat, this works
    }


}

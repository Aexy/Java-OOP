package Abstraction;

import Abstraction.Animal;

public class Cat extends Animal {

    public String name;
    public double energy;

    public Cat(String name) {
        this.name = name;
        this.energy = 0;
    }
    @Override
    public void eat() {
        this.energy += 0.5;
        System.out.println( this.name + " ate fish, current energy: " + this.energy);
    }

    @Override
    public void sleep() {
        System.out.println( this.name + " is sleeping.");
    }

    @Override
    public void pet() {
        System.out.println(this.name + " is being pet. Purr");
    }

    @Override
    public void play() {

        if(this.energy >= 0.5) {
            System.out.println(this.name + " is playing outside");
            this.energy -= 0.5;
        }else{
            System.out.println(this.name + " does not have enough energy to play, current energy: " + this.energy);
        }
    }
}

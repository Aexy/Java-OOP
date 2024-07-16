package Polymorphisim;

import Abstraction.Animal;

public class PolymorphisimMain {

    public static void main(String[] args) {

        //Create the objects
        Vehicle vehicle = new Vehicle();
        Bike bike = new Bike();
        Car car = new Car();

        //implement the same named methods
        vehicle.drive();
        bike.drive();
        car.drive();
    }
}

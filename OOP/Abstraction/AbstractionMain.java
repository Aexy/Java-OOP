public class AbstractionMain {

    public static void main(String[] args) {

        //The line below can not be executed
        // since the animal class is abstract
        //Animal animal = new Animal();

        Cat luna = new Cat("Luna");

        //Luna does not have enough energy to play
        luna.play();

        luna.eat();
        luna.sleep();
        luna.pet();
        luna.play();
    }
}
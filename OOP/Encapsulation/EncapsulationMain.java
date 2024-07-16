package Encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {

        Tom tom = new Tom("Tom", 17, 50, "Jennifer");


        //We can access public fields by "tom.field"
        System.out.println("Tom's name is " + tom.name);
        System.out.println("Tom's age is " + tom.age);

        //However accessing a private field is not allowed in the same format
        //TODO try it yourself
        // System.out.println("Tom's account balance is " + tom.money);

        //So we have to use a get method to access his account balance
        System.out.println("Tom's account balance is " + tom.getBalance());

        //Similarly accessing Tom's crush without his consent (private field) is also not allowed
        //System.out.println("Tom's crush is" tom.crush);

        //So we have to use a provided get method to access his crush
        System.out.println("Tom's crush is " + tom.getCrush());




        //Updating a variable for public fields is simple
        tom.age += 1;
        System.out.println("Happy birthday Tom, your new age: " + tom.age);

        //But private fields can not be updated in the same way
        //TODO try it yourself
        // tom.money += 1;

        //That's why the Tom class should provide us with a set method to if we want to modify Tom's age
        System.out.println("Before updating Tom's balance: " + tom.getBalance());
        tom.setBalance(tom.getBalance() + 10);
        System.out.println("After updating Tom's balance: " + tom.getBalance());

        //This is valid for all the private fields (in our case money and crush)
        System.out.println("Before updating Tom's crush: " + tom.getCrush());
        tom.setCrush("Emma");
        System.out.println("After updating Tom's crush: " + tom.getCrush());
    }
}

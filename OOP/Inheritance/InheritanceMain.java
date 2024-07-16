public class InheritanceMain {
    public static void main(String[] args) {

        //We already know that a laptop can be turned on or off
        Laptop laptop = new Laptop("Office Laptop");
        laptop.turnOnLaptop();
        laptop.turnOffLaptop();

        //Given that lenovo is a laptop with extra methods, lets see what happens when we turn on Lenovo
        Lenovo lenovo = new Lenovo("Gaming Laptop", "Minecraft", "Roblox", "Fortnite");
        lenovo.turnOnLaptop();
        lenovo.turnOffLaptop();
        lenovo.playGames();

        //We see that when we turn on lenovo, the turn on method from the laptop class with fields of lenovo is executed
        //This is because of the key word "extends Laptop" in the lenovo class, and the "super" key word that creates a
        //laptop with more specifications.
    }
}

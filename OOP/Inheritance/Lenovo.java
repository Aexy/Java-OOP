public class Lenovo extends Laptop{

    public String[] games;

    public Lenovo(String model, String ...games) {
        //"super" keyword calls the constructor of the extended class (in our case Laptop)
        super(model);
        this.games = games;
    }

    public void playGames(){
        for(String game : games){
            System.out.println("Playing game: " + game);
        }
    }

    //Note that this class does not have the turnOn or turnOff methods.
}

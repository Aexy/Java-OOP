public class Laptop {

    public String model;

    public Laptop(String model) {
        this.model = model;
    }

    public void turnOnLaptop(){
        System.out.println( this.model + " is on");
    }

    public void turnOffLaptop(){
        System.out.println(this.model + " is off");
    }
}

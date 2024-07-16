public class Tom {

    public String name;
    public int age;
    private double balance;
    private String crush;

    public Tom(String name, int age, double money, String crush) {
        this.name = name;
        this.age = age;
        this.balance = money;
        this.crush = crush;
    }


    //Note that the method is public
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Note that the method is public
    public String getCrush() {
        return crush;
    }
    public void setCrush(String crush) {
        this.crush = crush;
    }
}

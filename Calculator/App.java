import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        while (true) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter First Number: ");
            int a = sc.nextInt();

            System.out.println("Enter Second Number: ");
            int b = sc.nextInt();

            System.out.println("Enter Operation: Add(1), Subtract(2), Multiply(3), Divide(4) ");
            int n = sc.nextInt();


            switch (n) {
                case 1:
                    System.out.println("Adding " + a + " + " + b + " = " + calc.add(a, b));
                    break;
                case 2:
                    System.out.println("Subtracting " + a + " - " + b + " = " + calc.subtract(a, b));
                    break;
                case 3:
                    System.out.println("Multiplying " + a + " * " + b + " = " + calc.multiply(a, b));
                    break;
                case 4:
                    System.out.println("Dividing " + a + " / " + b + " = " + calc.divide(a, b));
                    break;
            }

            System.out.println("Thank you for using Calculator, Next Operation: ");
        }
    }
}

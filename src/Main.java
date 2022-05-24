import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Fraction a = new Fraction();
        try {
            a.Errors(sc);
        }catch (Exception exception){
            System.out.println(exception);
        }
        System.out.println("\n");

        System.out.println("The fraction is: " + a);
        System.out.println("\n");
        System.out.println("The result of dividend and divisor addition is " + a.addition(a.getDividend(), a.getDivisor()));
        System.out.println("\n");
        System.out.println("The result of dividend and divisor substitution is " + a.substitution(a.getDividend(), a.getDivisor()));
        System.out.println("\n");
        System.out.println("The result of dividend and divisor multiplication is " + a.multiplication(a.getDividend(), a.getDivisor()));
        System.out.println("\n");
        System.out.println("The result of dividend and divisor complex division is " + a.division(a.getDividend(), a.getDivisor()));

    }
}

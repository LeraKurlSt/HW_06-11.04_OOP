import java.util.Scanner;

public class Fraction {
        private int dividend;
        private int divisor;

        public Fraction(){}

        public Fraction(int dividend, int divisor) throws Exception{
            if (divisor == 0){
                throw new Exception("The denominator is 0");
            }
            this.dividend = dividend;
            this.divisor = divisor;
        }

        public int getDividend() {
            return dividend;
        }

        public void setDividend(int dividend) {
            this.dividend = dividend;
        }

        public int getDivisor() {
            return divisor;
        }

        public void setDivisor(int divisor) throws Exception{
            if (divisor == 0) {
                throw new Exception("Denominator must be not zero!");
            }
            this.divisor = divisor;
        }

        public void Errors(Scanner sc) throws Exception {
            System.out.print("Enter numerator: ");
            if (sc.hasNextInt()) {
                dividend = sc.nextInt();
            } else {
                throw new Exception("Try again, the divisor must be a number");
            }
            System.out.print("Enter denominator: ");
            if (sc.hasNextInt()) {
                int sor = sc.nextInt();
                if (sor == 0) {
                    throw new Exception("Try again, the dividend must be a number but not 0");
                } else {
                    divisor = sor;
                }

            } else {
                dividend = 0;
                throw new Exception("Try again, the dividend must be a number but not 0");
            }
            sc.nextLine();
        }

    @Override
    public String toString(){
        if (dividend > divisor){
            return ("quotient " + dividend / divisor + (dividend % divisor == 0 ? "" :
                    " rest " + dividend % divisor + "\\" + divisor ));
        }
        return "" + dividend + "\\" + divisor;
    }

    public int addition(int dividend, int divisor){
        return dividend + divisor;
    }

    public int substitution(int dividend, int divisor){
        return dividend - divisor;
    }

    public int multiplication(int dividend, int divisor){
        return dividend * divisor;
    }

    public int division(int dividend, int divisor){
        return dividend / divisor;
    }
}

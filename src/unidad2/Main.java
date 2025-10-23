class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class SafeCalculator {
    public double divide(int a, int b) throws InvalidInputException {
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Los números no pueden ser negativos.");
        }

        try {
            return a / (double) b;
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN;
        } finally {
            System.out.println("Fin de la operación.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SafeCalculator calculator = new SafeCalculator();

        try {
            System.out.println("Resultado: " + calculator.divide(10, 2));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Resultado: " + calculator.divide(10, 0));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Resultado: " + calculator.divide(-10, 2));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Resultado: " + calculator.divide(10, -2));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}

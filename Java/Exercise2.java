// write a java program to throw arithmetic exception using "throw" and "throws"

public class Exercise2 {
    public static void main(String[] args) {
        try {
            dividewithzero();
            dividewithfloat();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Error");
        }
    }

    public static void dividewithfloat() throws ArithmeticException {
        throw new ArithmeticException("New Error");
    }

    public static void dividewithzero() throws ArithmeticException {
        throw new ArithmeticException("Dividewithzero");
    }
}

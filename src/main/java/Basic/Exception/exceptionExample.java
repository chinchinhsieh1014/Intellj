package Basic.Exception;

public class exceptionExample {
    public static void divide(int a, int b) {
        if (b==0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            System.out.println("Result: " + a / b);
        }
    }
    public static void main(String[] args) {
        try {
            int result = 10/0;
        } catch(Exception e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            System.out.println("in this block, thing will always program");
        }

        try {
            divide(10, 0);
        } catch(Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}

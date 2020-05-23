package exceptions_13;
/*
write the following statement — int c = 30/0 — within a program and execute it.
update that program to handle the exception.
Then print a statement after the division to say,
"Division is fun." This statement should be outputted no matter what happens in your program.
 */

public class DividingByZero {
    public static void main(String[] args) {
        try {
            int c = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Dividing  by 0 is not allowed");
        } finally {
            System.out.println("Division is fun");
        }
    }
}

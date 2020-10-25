package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {

    private int solution = 0;

    public Multiply(int arg1, int arg2) {
        solution = arg1 * arg2;
    }

    public String toString() {
        return Integer.toString(solution);
    }

}

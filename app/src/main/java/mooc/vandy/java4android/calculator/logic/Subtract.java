package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {

    private int solution = 0;

    public Subtract(int arg1, int arg2) {
        solution = arg1 - arg2;
    }

    public String toString() {
        return Integer.toString(solution);
    }

}

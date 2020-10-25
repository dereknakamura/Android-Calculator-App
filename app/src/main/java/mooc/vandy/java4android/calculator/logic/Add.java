package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {

    private int solution = 0;

    public Add(int arg1, int arg2) {
        solution = arg1 + arg2;
    }

    public String toString() {
        return  Integer.toString(solution);
    }

}

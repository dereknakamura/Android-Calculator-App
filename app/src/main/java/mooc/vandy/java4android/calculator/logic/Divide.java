package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {

    private int quotient = 0;
    private int remainder = 0;
    private boolean flag = false;

    public Divide(int arg1, int arg2) {
        if(arg2 != 0) {
            quotient = arg1 / arg2;
            remainder = arg1 % arg2;
        }
        else
            flag = true;
    }

    public String toString() {
        if(flag)
            return "Error: division by 0";
        else
            return Integer.toString(quotient) + " R:" + Integer.toString(remainder);
    }

}

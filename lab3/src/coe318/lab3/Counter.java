/**
 *
 * @author Your Name
 * Hoang Vo, 500976404, Section 16
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    private int modulus;
    private int digit;
    private Counter left;
    public Counter(int modulus, Counter left) {
        this.modulus = modulus;
        this.left = left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return modulus;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        Counter a = null;
        if(left != null){
            a = left;
        }
        return a;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digit = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        digit++;
        if(digit == modulus){
            digit = 0;
            if(this.getLeft() != null){
                left.increment();
            }
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount(){
        int a = digit;
        if(left != null){
            a = digit+modulus*left.getCount();
        }
        return a;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
package coe318.lab2;
/**
* ComplexNumber models a complex number expressed
* in rectangular form (real and imaginary parts). 
* 
* It is an <em>immutable</em> object.
*
* @author Your Name
* Hoang Vo, 500976404, section 16
*/
public class ComplexNumber {
  private double real;
  private double imaginary;
 //Instance variable declarations
 /**
 * Construct a ComplexNumber given its
 * real and imaginary parts.
 * @param re The real component
 * @param im The imaginary component
 */
 public ComplexNumber(double re, double im) {
 //Initialize the instance variables
   real = re;
   imaginary = im;
 }
 /**
 * Returns the real component.
 * @return the real
 */
 public double getReal() {
   return real; //A stub: to be fixed
 }
 /**
 * Returns the imaginary component.
 * @return the imaginary
 */
 public double getImaginary() {
   return imaginary; //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber number that is
 * the negative of <em>this</em>. Note: the
 * original ComplexNumber is <b>NOT</b>
 * modified.
 * @return -this
 */
 public ComplexNumber negate() {
   ComplexNumber bn = new ComplexNumber(-real,-imaginary);
   return bn; //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber that is the
 * sum of <em>this</em> and <em>z</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @return this + z
 */
 public ComplexNumber add(ComplexNumber z) {
   ComplexNumber bn = new ComplexNumber((real + z.getReal()),(imaginary + z.getImaginary()));
   return bn; //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber that is the
 * difference of <em>this</em> and <em>z</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @return this + z
 */
 public ComplexNumber subtract(ComplexNumber z) {
   ComplexNumber bn = new ComplexNumber((real - z.getReal()),(imaginary - z.getImaginary()));
   return bn; //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber that is the
 * product of <em>this</em> and <em>z</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @return this * z
 */
 public ComplexNumber multiply(ComplexNumber z) {
   ComplexNumber bn = new ComplexNumber((real*z.getReal() - imaginary*z.getImaginary()),(real*z.getImaginary() + imaginary*z.getReal()));
   return bn;
   //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber that is
 * the reciprocal of <em>this</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @return 1.0 / this
 */
 public ComplexNumber reciprocal() {
   ComplexNumber bn = new ComplexNumber((real/(real*real+imaginary*imaginary)),(imaginary/(real*real+imaginary*imaginary)));
   return bn;
   //A stub: to be fixed
 }
 /**
 * Returns a new ComplexNumber that is
 * <em>this</em> divided by <em>z</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @return this / z
 */
 public ComplexNumber divide(ComplexNumber z) {
   double c = z.getReal();
   double d = z.getImaginary();
   ComplexNumber bn = new ComplexNumber(((real*c + imaginary*d)/(c*c+d*d)),((imaginary*c - real*d)/(c*c +d*d)));
   return bn; //A stub: to be fixed
 }
 /**
 * Returns a String representation of
 * <em>this</em> in the format:
 * <pre>
 * real +-(optional) i imaginary
 * </pre>
 * If the imaginary part is zero, only the
 * real part is converted to a String.
 * A "+" or "-" is placed between the real
 * and imaginary parts depending on the
 * the sign of the imagrinary part.
 * <p>
 * Examples:
 * <pre>
 * ..println(new ComplexNumber(0,0); -> "0.0"
 * ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
 * ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
 * </pre>
 * @return the String representation.
 */
 @Override
 public String toString() {
 //DO NOT MODIFY THIS CODE!
   String str = "" + this.getReal();
   if (this.getImaginary() == 0.0) {
     return str;
   }
   if (this.getImaginary() > 0) {
     return str + " + i" + this.getImaginary();
   } 
   else {
     return str + " - i" + -this.getImaginary();
   }
 }
}

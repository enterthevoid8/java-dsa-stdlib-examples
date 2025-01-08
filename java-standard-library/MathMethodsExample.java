import java.util.Random;

public class MathMethodsExample {
    public static void main(String[] args) {
        double x = -9.5;
        double y = 4.5;
        int a = -5, b = 3;
        long m = 2000000000L, n = 1000000000L;

        // Absolute value
        System.out.println("abs(x): " + Math.abs(x)); // 9.5

        // Arc cosine
        System.out.println("acos(0.5): " + Math.acos(0.5)); // ~1.047 (in radians)

        // Add exact
        System.out.println("addExact(a, b): " + Math.addExact(a, b)); // -2

        // Arc sine
        System.out.println("asin(0.5): " + Math.asin(0.5)); // ~0.523 (in radians)

        // Arc tangent
        System.out.println("atan(1): " + Math.atan(1)); // ~0.785 (in radians)

        // atan2
        System.out.println("atan2(y, x): " + Math.atan2(y, x)); // ~2.695

        // Cube root
        System.out.println("cbrt(27): " + Math.cbrt(27)); // 3.0

        // Ceiling
        System.out.println("ceil(x): " + Math.ceil(x)); // -9.0

        // Copy sign
        System.out.println("copySign(x, y): " + Math.copySign(x, y)); // 9.5

        // Cosine
        System.out.println("cos(Math.PI): " + Math.cos(Math.PI)); // -1.0

        // Hyperbolic cosine
        System.out.println("cosh(1): " + Math.cosh(1)); // ~1.543

        // Decrement exact
        System.out.println("decrementExact(a): " + Math.decrementExact(a)); // -6

        // Exponential
        System.out.println("exp(1): " + Math.exp(1)); // ~2.718

        // Exponential minus 1
        System.out.println("expm1(1): " + Math.expm1(1)); // ~1.718

        // Floor
        System.out.println("floor(x): " + Math.floor(x)); // -10.0

        // Floor division
        System.out.println("floorDiv(a, b): " + Math.floorDiv(a, b)); // -2

        // Floor mod
        System.out.println("floorMod(a, b): " + Math.floorMod(a, b)); // 1

        // Get exponent
        System.out.println("getExponent(y): " + Math.getExponent(y)); // 2

        // Hypotenuse
        System.out.println("hypot(x, y): " + Math.hypot(x, y)); // ~10.631

        // IEEE remainder
        System.out.println("IEEEremainder(x, y): " + Math.IEEEremainder(x, y)); // ~-0.5

        // Increment exact
        System.out.println("incrementExact(b): " + Math.incrementExact(b)); // 4

        // Natural logarithm
        System.out.println("log(10): " + Math.log(10)); // ~2.302

        // Base 10 logarithm
        System.out.println("log10(100): " + Math.log10(100)); // 2.0

        // Logarithm of 1 + x
        System.out.println("log1p(1): " + Math.log1p(1)); // ~0.693

        // Maximum value
        System.out.println("max(x, y): " + Math.max(x, y)); // 4.5

        // Minimum value
        System.out.println("min(x, y): " + Math.min(x, y)); // -9.5

        // Multiply exact
        System.out.println("multiplyExact(a, b): " + Math.multiplyExact(a, b)); // -15

        // Negate exact
        System.out.println("negateExact(a): " + Math.negateExact(a)); // 5

        // Next after
        System.out.println("nextAfter(y, x): " + Math.nextAfter(y, x)); // ~4.499999999999999

        // Next down
        System.out.println("nextDown(y): " + Math.nextDown(y)); // ~4.499999999999999

        // Next up
        System.out.println("nextUp(y): " + Math.nextUp(y)); // ~4.500000000000001

        // Power
        System.out.println("pow(2, 3): " + Math.pow(2, 3)); // 8.0

        // Random
        System.out.println("random(): " + Math.random()); // Random number between 0 and 1

        // Rint
        System.out.println("rint(x): " + Math.rint(x)); // -10.0

        // Round
        System.out.println("round(y): " + Math.round(y)); // 5

        // Scalb
        System.out.println("scalb(x, 2): " + Math.scalb(x, 2)); // -38.0

        // Signum
        System.out.println("signum(x): " + Math.signum(x)); // -1.0

        // Sine
        System.out.println("sin(Math.PI / 2): " + Math.sin(Math.PI / 2)); // 1.0

        // Hyperbolic sine
        System.out.println("sinh(1): " + Math.sinh(1)); // ~1.175

        // Square root
        System.out.println("sqrt(16): " + Math.sqrt(16)); // 4.0

        // Subtract exact
        System.out.println("subtractExact(a, b): " + Math.subtractExact(a, b)); // -8

        // Tangent
        System.out.println("tan(Math.PI / 4): " + Math.tan(Math.PI / 4)); // ~1.0

        // Hyperbolic tangent
        System.out.println("tanh(1): " + Math.tanh(1)); // ~0.761

        // To degrees
        System.out.println("toDegrees(Math.PI): " + Math.toDegrees(Math.PI)); // 180.0

        // To int exact
        System.out.println("toIntExact(m): " + Math.toIntExact(n)); // 1000000000

        // To radians
        System.out.println("toRadians(180): " + Math.toRadians(180)); // ~3.142

        // ULP
        System.out.println("ulp(y): " + Math.ulp(y)); // ~8.881784197001252E-16
    }
}

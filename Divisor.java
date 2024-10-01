public class Divisor {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // overflow case
        }

        // Determine the sign of the result
        boolean sign = (dividend < 0) == (divisor < 0);

        // Use long to avoid overflow
        long dividd = Math.abs((long) dividend);
        long divis = Math.abs((long) divisor);

        int result = 0;

        while (dividd >= divis) {
            int count = 0;
            while (dividd >= (divis << (count + 1))) {
                count++;
            }
            result += 1 << count;
            dividd -= divis << count;
        }

        return sign ? result : -result;
    }
}

class New{
    public static void main(String[] args) {
        Divisor d=new Divisor();
        System.out.println(d.divide(17,8));
    }
}
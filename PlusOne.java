import java.math.BigInteger;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        String str = "";
        for (int i = 0; i < digits.length; i++) {
            str += digits[i];
        }

        BigInteger num = new BigInteger(str);
        num = num.add(BigInteger.ONE);

        String numstr = "" + num;

        int[] res = new int[numstr.length()];

        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(String.valueOf(numstr.charAt(i)));
        }

        return res;

    }
}

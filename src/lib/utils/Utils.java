package lib.utils;

import jdk.jfr.DataAmount;
import jdk.jfr.Label;
import jdk.jfr.Unsigned;

import java.math.BigDecimal;
import java.math.BigInteger;

// Better import all methods as static so the namespace doesn't have to be seen in source code
public class Utils {

    // Hashing via Goedel-Numbering
    public static BigInteger hash(Object input) {
        char[] charArray = input.toString().toCharArray();
        int[] charArrayToIntArray = new int[charArray.length];
        BigDecimal temp = new BigDecimal(1);

        for (int i = 0; i < charArray.length; i++) {
            charArrayToIntArray[i] = (primes[i]) ^ charArray[i];
            temp = temp.multiply(new BigDecimal(charArrayToIntArray[i]));
        }

        return temp.toBigInteger();
    }

    // sorry for that
    private static final int[] primes = new int[] {
            2
            ,3
            ,5
            ,7
            ,11
            ,13
            ,17
            ,19
            ,23
            ,29
            ,31
            ,37
            ,41
            ,43
            ,47
            ,53
            ,59
            ,61
            ,67
            ,71
            ,73
            ,79
            ,83
            ,89
            ,97
            ,101
            ,103
            ,107
            ,109
            ,113
            ,127
            ,131
            ,137
            ,139
            ,149
            ,151
            ,157
            ,163
            ,167
            ,173
            ,179
            ,181
            ,191
            ,193
            ,197
            ,199
};
}

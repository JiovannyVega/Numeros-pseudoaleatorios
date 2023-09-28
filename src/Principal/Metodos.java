package Principal;

import java.text.DecimalFormat;

public class Metodos {
    private static int StringAInteger(String s) {
        return Integer.parseInt(s);
    }

    private static String IntegerAString(int i) {
        return String.valueOf(i);
    }

    public static int NumerosMedios4(int n) {
        String s = IntegerAString(n);
        int lenght = s.length();
        if (lenght <= 4) {
            return n;
        } else {
            int nInicial = (lenght - 4) / 2;
            return StringAInteger(s.substring(nInicial, nInicial + 4));
        }
    }

    public static String get4Decimals(int n) {
        DecimalFormat df = new DecimalFormat("0.0000");
        double d = n;
        return df.format(d / 10000);
    }

    public static String format4Dec(double d) {
        DecimalFormat df = new DecimalFormat("0.0000");
        return df.format(d);
    }

}

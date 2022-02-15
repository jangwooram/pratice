package pattern;

import java.text.DecimalFormat;

public class FormatEx {
    public static void main(String[] args) {
        int num = 23500000;
        DecimalFormat decFormat = new DecimalFormat("###,###");
        String str = decFormat.format(num);
        System.out.println(str);

        double dnum = 2452344.345;
        decFormat = new DecimalFormat("0.0");
        System.out.println(decFormat.format(dnum));
    }
}

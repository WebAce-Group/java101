package w1.zadania.Wyklad1;

import java.lang.Math;

public class Zadanie2 {
    public static void main (String[] args) {
        int a =5;
        int b=10;

        double c;
        double d;

        c = Math.pow(a,b);

        d = Math.sqrt(c);

        System.out.println("a ="  + a + " b = " + b + " c = " + c + " d = " + d);

        int e = -5;

        double g;
        double h;

        g= Math.abs(e);
        h = 10.5001;
        h= Math.round(h);
        System.out.println("e = " + e + " g = " + g + " h = " + h);
    }


}
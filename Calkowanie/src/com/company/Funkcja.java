package com.company;
import org.mariuszgromada.math.mxparser.*;

public class Funkcja {

    //private final Expression e;
    private final String funkcja;

    public Funkcja(String funkcja) {
        //e = new Expression(funkcja);
        this.funkcja = funkcja;
    }

    public double oblicz(double arg) {
        Argument x = new Argument("x",arg);
        Expression e = new Expression(funkcja,x);
        double y = e.calculate();
        //System.out.println(y);
        return y;
    }
}

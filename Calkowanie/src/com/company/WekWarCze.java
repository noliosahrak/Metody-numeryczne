package com.company;

public class WekWarCze {
    double[] x;
    double[] y;
    Funkcja efodiks;
    private double czynnik;
    private CzynMetCze czynMetCze;

    public WekWarCze(String przedzial,int ilosc,Funkcja efodiks) {
        this.efodiks = efodiks;
        String[] tab = przedzial.split(":",2);
        double poczatek = Double.parseDouble(tab[0]);
        double koniec = Double.parseDouble(tab[1]);
        czynnik = (koniec - poczatek) / (double) ilosc;
        czynMetCze = new CzynMetCze(ilosc);

        x = new double[ilosc];
        y = new double[ilosc];

        for (int i = 0; i < ilosc; i++) {
            x[i] = 0.5 * ((koniec + poczatek) + (koniec - poczatek) * czynMetCze.t[i]);
            y[i] = efodiks.oblicz(x[i]);

        }
    }

    public double calka() {
        double calka = 0;
        for (int i = 1; i < y.length; i++) {
            calka += y[i];
        }
        calka *= czynnik;
        return calka;
    }
}

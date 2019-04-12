package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
/*
        System.out.println("Jaką funkcję całkujemy?");
        String funkcja = s.next();
        System.out.println("Na jakim przedziale, proszę podać zakres tak jak tworzy się wektor w Matlabie początek:krok:koniec");
        String przedzial = s.next();
        Funkcja efodiks = new Funkcja(funkcja);
        WekWarFun dane = new WekWarFun(przedzial,efodiks);
        System.out.println("Metodą prostokątów otrzymano wynik = "+dane.calkaProst());
        System.out.println("Metodą trapezów otrzymano wynik = "+dane.calkaTrap());
        System.out.println("Metodą parabol otrzymano wynik = "+dane.calkaParab());
*/
        System.out.println("Jaką funkcję całkujemy?");
        String funkcja2 = s.next();
        Funkcja efodiks2 = new Funkcja(funkcja2);
        System.out.println("Na jakim przedziale, proszę podać w formie początek:koniec");
        String przedzial2 = s.next();
        System.out.println("Podaj n");
        int n = s.nextInt();
        WekWarCze dane2 = new WekWarCze(przedzial2,n,efodiks2);
        System.out.println("Metodą Czebyszewa otrzymano wynik = "+dane2.calka());
    }
}

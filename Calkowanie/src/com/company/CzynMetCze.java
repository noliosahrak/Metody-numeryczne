package com.company;

public class CzynMetCze {
    double[] t;

    public CzynMetCze(int ilosc) {
        switch (ilosc) {
            case 2:
                t = new double[]{-0.5775, 0.5775};
                break;
            case 3:
                t = new double[]{-0.707107,0,0.707107};
                break;
            case 4:
                t = new double[]{-0.794654,-0.187592,0.187592,0.794654};
                        break;
            case 5:
                t = new double[]{-0.835492,-0.374541,0,0.374541,0.835492};
                        break;
        }
    }
}

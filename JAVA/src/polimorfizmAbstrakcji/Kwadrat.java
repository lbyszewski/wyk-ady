package polimorfizmAbstrakcji;

import abstrakcja.Figura;

public class Kwadrat extends Figura {
    @Override
    public double pole() {
        double wynik = 2*2;
        return wynik;
    }

    @Override
    public double obwod() {
        double a =2;
        double wynik = 4*a;
        return wynik;
    }
}

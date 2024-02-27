package polimorfizmInterface;

import interfaces.IFigura;

public class Kwadrat implements IFigura {
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

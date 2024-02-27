import abstrakcja.Figura;
import interfaces.IFigura;
import metody.SomeClass;
import polimorfizmAbstrakcji.Kwadrat;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        //

        // wywołanie obiektu z referencji Abstrakcji


        Figura kwadrat = new Kwadrat();
        System.out.println(kwadrat.pole());
        System.out.println(kwadrat.obwod());

        // wywołanie obiektu z referencji Interface

        IFigura kwadratOne = new polimorfizmInterface.Kwadrat();
        System.out.println(kwadratOne.pole());
        System.out.println(kwadratOne.obwod());

        SomeClass someClass = new SomeClass("Alpha","beta");
        System.out.println(someClass.show());
    }
}
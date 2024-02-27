package org.example;

import org.example.dziedzieczenie.Father;
import org.example.dziedzieczenie.Son;
import org.example.polimorfizm.Figura;
import org.example.polimorfizm.Trapez;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


       //Person person = new Person();

     //   Scanner scanner = new Scanner(System.in);
     //   System.out.println("podaj imie: ");
     //   String imie = scanner.next();

      ///  person.show(imie);


        ///System.out.println(person.getFirstName());


       // Father father = new Father("Adam","Kowalski",50);
       // father.show();
      //  Son son = new Son("Dawid", "Kowlski", 15,3000);
       // son.show();

        Figura trapez = new Trapez();
        System.out.println(trapez.pole());

    }
}
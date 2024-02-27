package org.example;

public class Person {

    // PascalCase - klasy

    // camelCase  - zmienne i metody

    // pola - property

    private String firstName;



    // metody - methods




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void show(String name){
        this.setFirstName(name);
        System.out.println("Oto moje imie: " + this.getFirstName());
    }
}

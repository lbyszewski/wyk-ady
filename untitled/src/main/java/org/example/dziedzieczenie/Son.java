package org.example.dziedzieczenie;

public class Son extends Father{

    private double pieniadze;


    public Son(String imie, String nazwisko, int wiek, double pieniadze) {
        super(imie, nazwisko, wiek);
        this.pieniadze = pieniadze;
    }

    public double getPieniadze() {
        return pieniadze;
    }

    public void setPieniadze(double pieniadze) {
        this.pieniadze = pieniadze;
    }

    public void show(){
        System.out.println("jestem synem" + this.getImie() + " " + this.getNazwisko());
    }
}

package model;

import model.profesje.Mag;
import model.profesje.Wojownik;
import model.rasy.Hobbit;

import static model.Zapis.zapiszDoPliku;

public class Main {
    public static void main(String[] args) {
        Postac postac = new Hobbit();

        postac = new Wojownik(postac);
        postac = new Mag(postac);

//        postac.pokazZdolnosci();
//        postac.pokazUmiejetnosci();

        zapiszDoPliku(postac);
    }
}

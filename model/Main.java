package model;

import model.profesje.Mag;
import model.profesje.Wojownik;
import model.profesje.Zabojca;
import model.rasy.Hobbit;

import static model.Zapis.zapiszDoPliku;

public class Main {
    public static void main(String[] args) throws Exception {
        Postac postac = new Hobbit();

        postac = new Zabojca(postac);
        postac = new Mag(postac);

        //wyrzuci wyjątek
        //postac = new Wojownik(postac);

        zapiszDoPliku(postac);
    }
}

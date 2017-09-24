package model.profesje;

import model.Postac;
import model.Profesja;
import model.umiejetnosci.Uzdrawianie;
import model.umiejetnosci.Zatruwanie;

public class Mag extends Profesja {
    Postac postac;

    public Mag(Postac postac) {
        super(postac);
        this.postac = postac;
        dodajUmiejetnosci();
    }

    @Override
    public void dodajUmiejetnosci() {
        postac.dodajUmiejetnosc(new Uzdrawianie());
        postac.dodajUmiejetnosc(new Zatruwanie());
    }
}
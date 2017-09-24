package model.profesje;

import model.Postac;
import model.Profesja;
import model.umiejetnosci.WalkaWrecz;
import model.umiejetnosci.Zatruwanie;

public class Zabojca extends Profesja {
    Postac postac;

    public Zabojca(Postac postac) {
        super(postac);
        this.postac = postac;
        dodajUmiejetnosci();
    }

    @Override
    public void dodajUmiejetnosci() {
        postac.dodajUmiejetnosc(new WalkaWrecz());
        postac.dodajUmiejetnosc(new Zatruwanie());
    }
}
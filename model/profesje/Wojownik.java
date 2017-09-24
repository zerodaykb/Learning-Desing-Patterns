package model.profesje;

import model.Postac;
import model.Profesja;
import model.umiejetnosci.WalkaMieczem;
import model.umiejetnosci.WalkaToporem;

public class Wojownik extends Profesja {
    Postac postac;

    public Wojownik(Postac postac) {
        super(postac);
        this.postac = postac;
        dodajUmiejetnosci();
    }

    @Override
    public void dodajUmiejetnosci() {
        postac.dodajUmiejetnosc(new WalkaMieczem());
        postac.dodajUmiejetnosc(new WalkaToporem());
    }
}

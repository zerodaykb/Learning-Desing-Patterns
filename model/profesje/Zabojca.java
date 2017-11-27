package model.profesje;

import model.Postac;
import model.Profesja;
import model.umiejetnosci.WalkaWrecz;
import model.umiejetnosci.Zatruwanie;

public class Zabojca extends Profesja {
    private Postac postac;

    public Zabojca(Postac postac) {
        super(postac);
        this.postac = postac;

        umiejetnosci.add(new WalkaWrecz());
        umiejetnosci.add(new Zatruwanie());
        drzewoKlas.add(this.getClass().getSimpleName());
    }
}